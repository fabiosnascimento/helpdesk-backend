package com.fabionascimento.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabionascimento.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
