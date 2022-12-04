package com.fabionascimento.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabionascimento.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
