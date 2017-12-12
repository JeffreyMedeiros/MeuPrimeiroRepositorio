package fundatec.org.br.projetoSnapchat.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class UsuarioEntity {

	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "seguidores")
	private List<String> seguidores;
	
	@Column(name = "seguindo")
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
