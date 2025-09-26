package br.com.javatutor.gestao_de_custos.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.javatutor.gestao_de_custos.entity.Despesa;

public interface DespesaRepository extends JpaRepository<Despesa, UUID> {

}