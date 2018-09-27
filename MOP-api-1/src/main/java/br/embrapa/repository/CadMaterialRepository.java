package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadMaterial;

public interface CadMaterialRepository extends JpaRepository<CadMaterial, Long>{

}
