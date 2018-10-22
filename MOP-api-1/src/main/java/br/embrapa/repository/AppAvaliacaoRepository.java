package br.embrapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.embrapa.model.AppAvaliacao;

public interface AppAvaliacaoRepository extends JpaRepository<AppAvaliacao, Long> {

}
