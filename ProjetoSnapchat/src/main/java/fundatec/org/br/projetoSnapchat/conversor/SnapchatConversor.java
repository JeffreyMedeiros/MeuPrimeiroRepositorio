package fundatec.org.br.projetoSnapchat.conversor;

import fundatec.org.br.projetoSnapchat.business.PostagemBO;
import fundatec.org.br.projetoSnapchat.business.UsuarioBO;
import fundatec.org.br.projetoSnapchat.dao.PostagemEntity;
import fundatec.org.br.projetoSnapchat.dao.UsuarioEntity;
import fundatec.org.br.projetoSnapchat.web.PostagemDTO;
import fundatec.org.br.projetoSnapchat.web.UsuarioDTO;

public class SnapchatConversor {

	public static UsuarioBO convertDTOToBo(UsuarioDTO uDTO) {
		UsuarioBO bo = new UsuarioBO();
		bo.setUsername(uDTO.getUsername());
		bo.setSenha(uDTO.getSenha());
		bo.setSeguidores(uDTO.getSeguidores());
		bo.setSeguindo(uDTO.getSeguindo());
		
		return bo;
	}

	public static UsuarioDTO converterBoToDTO(UsuarioBO bo) {
		UsuarioDTO uDto = new UsuarioDTO();
		uDto.setUsername(bo.getUsername());
		uDto.setSenha(bo.getSenha());
		uDto.setSeguidores(bo.getSeguidores());
		uDto.setSeguindo(bo.getSeguindo());
		
		return uDto;
	}

	public static UsuarioBO convertEntityToBo(UsuarioEntity usuarioEntity) {
		if (usuarioEntity != null) {
			UsuarioBO bo = new UsuarioBO();
			bo.setUsername(usuarioEntity.getUsername());
			bo.setSenha(usuarioEntity.getSenha());
			bo.setSeguidores(usuarioEntity.getSeguidores());
			bo.setSeguindo(usuarioEntity.getSeguindo());
			
			return bo;
		}
		return null;
	}

	public static UsuarioEntity convertBoToEntity(UsuarioBO bo) {
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setUsername(bo.getUsername());
		usuarioEntity.setSenha(bo.getSenha());
		usuarioEntity.setSeguidores(bo.getSeguidores());
		usuarioEntity.setSeguindo(bo.getSeguindo());
		
		return usuarioEntity;
	}

	public static PostagemBO convertDTOToBo(PostagemDTO pDTO) {
		PostagemBO bo = new PostagemBO();
		bo.setId(pDTO.getId());
		bo.setFoto(pDTO.isFoto());
		bo.setVideo(pDTO.isVideo());
		bo.setLegenda(pDTO.getLegenda());
		bo.setTemporizador(pDTO.getTemporizador());
		
		return bo;
	}

	public static PostagemDTO converterBoToDTO(PostagemBO bo) {
		PostagemDTO pDTO = new PostagemDTO();
		pDTO.setId(bo.getId());
		pDTO.setFoto(bo.isFoto());
		pDTO.setVideo(bo.isVideo());
		pDTO.setLegenda(bo.getLegenda());
		pDTO.setTemporizador(bo.getTemporizador());
		
		return pDTO;
	}

	public static PostagemBO convertEntityToBo(PostagemEntity postagemEntity) {
		if (postagemEntity != null) {
			PostagemBO bo = new PostagemBO();
			bo.setId(postagemEntity.getId());
			bo.setFoto(postagemEntity.isFoto());
			bo.setVideo(postagemEntity.isVideo());
			bo.setLegenda(postagemEntity.getLegenda());
			bo.setTemporizador(postagemEntity.getTemporizador());
			
			return bo;
		}
		return null;
	}

	public static PostagemEntity convertBoToEntity(PostagemBO bo) {
		PostagemEntity postagemEntity = new PostagemEntity();
		postagemEntity.setId(bo.getId());
		postagemEntity.setFoto(bo.isFoto());
		postagemEntity.setVideo(bo.isVideo());
		postagemEntity.setLegenda(bo.getLegenda());
		postagemEntity.setTemporizador(bo.getTemporizador());
		
		return postagemEntity;
	}
}
