package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.ModVerificadorLocal;
import br.embrapa.model.Verificador_m;
import br.embrapa.repository.ModVerificadorLocalRepository;


@RestController
@RequestMapping("/modverificadorlocal")
public class ModVerificadorLocalResource {

	@Autowired
	private ModVerificadorLocalRepository modVerificadorLocalRepository;
	
	@GetMapping
	public List<ModVerificadorLocal> Listar(){
		return modVerificadorLocalRepository.findAll();
	}
}
