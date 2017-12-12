package fundatec.org.br.projetoSnapchat.dao;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import fundatec.org.br.projetoSnapchat.business.UsuarioBO;

@Component
public class AppDao {

	private ObjectMapper objectMapper = new ObjectMapper();

	public String calcular(String expressao) {
		
		try {
			HttpClient client = HttpClientBuilder.create().build();
			
			HttpPost request = new HttpPost("http://api.mathjs.org/v1/");
			
			request.addHeader("content-type", "application/json");
			
			String jsonRequisicao = "{ \"expr\" : \"" + expressao + "\"}";
			
			StringEntity params = new StringEntity(jsonRequisicao, "UTF-8");
			request.setEntity(params);
			
			HttpResponse response = client.execute(request);
			
			String json = EntityUtils.toString(response.getEntity(), "UTF-8");

			UsuarioEntity usuarioEntity = objectMapper.readValue(json, UsuarioEntity.class);
			return usuarioEntity.getUsername();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "ok";
	}
}
