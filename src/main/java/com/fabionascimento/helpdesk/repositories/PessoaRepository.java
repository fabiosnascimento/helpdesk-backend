package com.fabionascimento.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabionascimento.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
