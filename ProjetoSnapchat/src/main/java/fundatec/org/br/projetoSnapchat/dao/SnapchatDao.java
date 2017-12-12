package fundatec.org.br.projetoSnapchat.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SnapchatDao {

	private EntityManager em;

	@Autowired
	public SnapchatDao(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public void salvar(UsuarioEntity usuarioEntity) {
		em.merge(usuarioEntity);
	}
	
	public UsuarioEntity buscaUsuario(String username) {
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity = em.find(UsuarioEntity.class, username);
		return usuarioEntity;
	}
	
	
}
