package br.embrapa.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.embrapa.model.CadAmostragem;
import br.embrapa.model.CadEmpresa;
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
	
	@PostMapping
	public ResponseEntity<CadAmostragem> criar(@RequestBody CadAmostragem cadAmostragem, HttpServletResponse response) {
		CadAmostragem cadAmostragemSalva = cadAmostragemRepository.save(cadAmostragem);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(cadAmostragemSalva.getCodigo()).toUri();
		//response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(cadAmostragemSalva);
	}
	
	@GetMapping("/{codigo}")
	public CadAmostragem buscarPeloCodigo(@PathVariable Long codigo) {
		return cadAmostragemRepository.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadAmostragemRepository.delete(codigo);
	}
		
}
