package fundatec.org.br.projetoSnapchat.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fundatec.org.br.projetoSnapchat.business.UsuarioBO;
import fundatec.org.br.projetoSnapchat.business.SnapchatService;
import fundatec.org.br.projetoSnapchat.conversor.SnapchatConversor;

@RestController
@RequestMapping(value = "/snapchat")
public class SnapchatRest {

	private SnapchatService snapchatService;

	@Autowired
	public SnapchatRest(SnapchatService snapchatService) {
		this.snapchatService = snapchatService;
	}

	@PutMapping
	public ResponseEntity<String> seguir(@RequestBody UsuarioDTO uDTO) {
		try {
			UsuarioBO bo = SnapchatConversor.convertDTOToBo(uDTO);
			bo = SnapchatService.seguir(bo);
			UsuarioDTO uDTO = SnapchatConversor.converterBoToDTO(bo);
			return ResponseEntity.ok("Abacaxi");
		} catch (RuntimeException e) {
			return ResponseEntity.badRequest().build();
		}

	}

}
