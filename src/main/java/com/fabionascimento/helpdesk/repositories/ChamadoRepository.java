package com.fabionascimento.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabionascimento.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
