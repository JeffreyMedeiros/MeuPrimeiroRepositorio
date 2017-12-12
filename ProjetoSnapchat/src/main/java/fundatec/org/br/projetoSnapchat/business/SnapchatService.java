package fundatec.org.br.projetoSnapchat.business;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fundatec.org.br.projetoSnapchat.conversor.SnapchatConversor;
import fundatec.org.br.projetoSnapchat.dao.AppDao;
import fundatec.org.br.projetoSnapchat.dao.SnapchatDao;
import fundatec.org.br.projetoSnapchat.dao.UsuarioEntity;

@Component
public class SnapchatService {
	
	private SnapchatDao sDao;
	private AppDao appDao;

	@Autowired
	public SnapchatService(AppDao appDao, SnapchatDao sDao) {
		this.appDao = appDao;
		this.sDao = sDao;
	}
	
	public UsuarioBO seguir(UsuarioBO bo) {
		
		 bo.getSeguindo().add("fulano123");
		 sDao.salvar(SnapchatConversor.convertBoToEntity(bo));
		
		
		return bo;
	}
}