
	package fundatec.org.br.projetoSnapchat;

	import java.io.IOException;
	import java.util.HashSet;
	import java.util.Set;

	import javax.servlet.Filter;
	import javax.servlet.FilterChain;
	import javax.servlet.FilterConfig;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	import org.apache.log4j.Logger;
	import org.springframework.core.Ordered;
	import org.springframework.core.annotation.Order;
	import org.springframework.stereotype.Component;

	@Component
	@Order(Ordered.HIGHEST_PRECEDENCE)
	public class AccountingFilter implements Filter {

		private static final Logger LOGGER = Logger.getLogger(AccountingFilter.class);

		private static Set<String> loggedInUsers = new HashSet<>();

		@Override
		public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
				throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) req;
			HttpServletResponse response = (HttpServletResponse) res;
			
			


			chain.doFilter(req, res); // segue o fluxo normal da aplicação
			
			//TODO gravar no log URL's chamadas e o método HTTP
			LOGGER.info(request.getRequestURL() + " " + request.getMethod());
		}

		private void validateUser(String usuario) {
			if (!loggedInUsers.contains(usuario)) {
				throw new RuntimeException("Usuario invalido");
			}
		}

		@Override
		public void destroy() {
		}

		@Override
		public void init(FilterConfig arg0) throws ServletException {
		}

}
