package fundatec.org.br.projetoSnapchat.web;

import java.util.List;

public class UsuarioDTO {
	
private String username;
	
	private String senha;

	private List<String> seguidores;

	private List<String> seguindo;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<String> getSeguidores() {
		return seguidores;
	}

	public void setSeguidores(List<String> seguidores) {
		this.seguidores = seguidores;
	}

	public List<String> getSeguindo() {
		return seguindo;
	}

	public void setSeguindo(List<String> seguindo) {
		this.seguindo = seguindo;
	}

}
