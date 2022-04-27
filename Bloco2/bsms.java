package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class bsms {
	@GetMapping
	public String asbsms() {
		return "BSMS:"
				+ "Proatividade;"
				+ "Atenção aos detalhes;"
				+ "Persistência;"
				+ "Trabalho em equipe;"
				+ "Comunicação;"
				+ "Orientação ao futuro;"
				+ "Mentalidade de crescimento;"
				+ "Responsabilidade pessoal.";
	}
}
