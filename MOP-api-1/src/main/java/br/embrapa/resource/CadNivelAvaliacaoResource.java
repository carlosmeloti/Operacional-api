package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.CadNivelDeAvaliacao;
import br.embrapa.repository.CadNivelDeAvaliacaoRepository;
import br.embrapa.repository.CadTipoDeVerificadorRepository;

@RestController
@RequestMapping("/cadnivelavaliacao")
public class CadNivelAvaliacaoResource {
	
	@Autowired
	private CadNivelDeAvaliacaoRepository cadNivelDeAvaliacaoRepository;
	
	@GetMapping
	@PreAuthorize("hasAuthority('ROLE_PESQUISAR_CADNIVELDEAVALIACAO') and #oauth2.hasScope('read')")
	public List<CadNivelDeAvaliacao> Listar(){
		return cadNivelDeAvaliacaoRepository.findAll();
	}
	
}
