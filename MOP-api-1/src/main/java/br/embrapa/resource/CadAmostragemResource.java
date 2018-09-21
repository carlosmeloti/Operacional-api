package br.embrapa.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.embrapa.model.CadAmostragem;
import br.embrapa.repository.CadAmostragemRepository;

@RestController
@RequestMapping("/cadamostragem")
public class CadAmostragemResource {

	@Autowired
	private CadAmostragemRepository cadAmostragemRepository;
	
	@GetMapping
	public List<CadAmostragem> Listar() {
		return cadAmostragemRepository.findAll();
	}
		
}
