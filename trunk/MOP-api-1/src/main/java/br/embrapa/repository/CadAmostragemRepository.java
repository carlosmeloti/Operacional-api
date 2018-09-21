package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.CadAmostragem;

public interface CadAmostragemRepository extends JpaRepository<CadAmostragem, Long> {

}
