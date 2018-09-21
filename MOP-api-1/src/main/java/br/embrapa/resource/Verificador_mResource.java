package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.Verificardor_m;
import br.embrapa.repository.Verificador_mRepository;

@RestController
@RequestMapping("/verificador_m")
public class Verificador_mResource {

	@Autowired
	private Verificador_mRepository verificador_mRepository;
	
	@GetMapping
	public List<Verificardor_m> Listar(){
		return verificador_mRepository.findAll();
	}
}
