package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.embrapa.model.CadTipoDeVerificador;
import br.embrapa.repository.CadTipoDeVerificadorRepository;

@RestController
@RequestMapping("/cadtipodeverificador")
public class CadTipoDeVerificadorResource {

	@Autowired
	private CadTipoDeVerificadorRepository cadTipoDeVerificadorRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADTIPODEVERIFICADOR') and #oauth2.hasScope('read')")
	public List<CadTipoDeVerificador> Listar(){
		
		return cadTipoDeVerificadorRepository.findAll();
	}
	
}
