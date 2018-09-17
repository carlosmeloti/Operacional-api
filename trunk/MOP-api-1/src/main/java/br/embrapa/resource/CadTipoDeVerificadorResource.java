package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	public List<CadTipoDeVerificador> Listar(){
		
		return cadTipoDeVerificadorRepository.findAll();
	}
	
}
