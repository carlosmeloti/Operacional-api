package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadEmpresa;

public interface CadEmpresaRepository extends JpaRepository<CadEmpresa, Long>{

}
