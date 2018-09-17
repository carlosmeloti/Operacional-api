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

import br.embrapa.model.CadEmpresa;
import br.embrapa.repository.CadEmpresaRepository;

@RestController
@RequestMapping("/cadempresa")
public class CadEmpresaResource {
	
	@Autowired
	private CadEmpresaRepository cadEmpresaRepositiry;
	
	@GetMapping
	public List<CadEmpresa> Listar(){
		
		return cadEmpresaRepositiry.findAll();
	}
	
	@PostMapping
	public ResponseEntity<CadEmpresa> criar(@RequestBody CadEmpresa cadEmpresa, HttpServletResponse response) {
		CadEmpresa cadEmpresaSalva = cadEmpresaRepositiry.save(cadEmpresa);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
			.buildAndExpand(cadEmpresaSalva.getCodigo()).toUri();
		//response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(cadEmpresaSalva);
	}
	
	@GetMapping("/{codigo}")
	public CadEmpresa buscarPeloCodigo(@PathVariable Long codigo) {
		return cadEmpresaRepositiry.findOne(codigo);
		
	}
	
	@DeleteMapping("/{codigo}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Long codigo) {
		cadEmpresaRepositiry.delete(codigo);
	}
	
	
	
	
}

