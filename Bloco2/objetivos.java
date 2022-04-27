package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class objetivos {
	@GetMapping
	public String objetivossemanais() {
		return "Objetivos da semana: "
				+ "Estudar mais MySQL;"
				+ "Aprender a utilizar Spring boot;"
				+ "Continuar mantendo o foco;"
				+ "Trabalhar bastante com o grupo do PI;"
				+ "Consumir mais conteúdos extras sobre cada tópico aprendido.";
 }
	
}
