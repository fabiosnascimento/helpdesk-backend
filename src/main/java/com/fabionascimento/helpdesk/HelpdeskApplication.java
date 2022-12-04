package com.fabionascimento.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fabionascimento.helpdesk.domain.Chamado;
import com.fabionascimento.helpdesk.domain.Cliente;
import com.fabionascimento.helpdesk.domain.Tecnico;
import com.fabionascimento.helpdesk.domain.enums.Perfil;
import com.fabionascimento.helpdesk.domain.enums.Prioridade;
import com.fabionascimento.helpdesk.domain.enums.Status;
import com.fabionascimento.helpdesk.repositories.ChamadoRepository;
import com.fabionascimento.helpdesk.repositories.ClienteRepository;
import com.fabionascimento.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "84088204000", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "73493180063", "linus@mail.com", "123");
		cli1.addPerfil(Perfil.CLIENTE);
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
