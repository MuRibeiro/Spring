package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o Spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String HelloWorld() {
		return "Hello Big World";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "BSMs:\r\n\n"
				+ "- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção para Detalhes\r\n"
				+ "- Proatividade";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos da semana:\r\n\n"
				+ "- Criação de API\r\n"
				+ "- Inicio do Blog Pessoal\r\n"
				+ "- Continuação do Projeto Integrador\r\n"
				+ "- Feedback em grupo";
	}
}
	


