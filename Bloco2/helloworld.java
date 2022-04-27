package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloworld")//mapeia o caminho da requisição pra acessar a 
public class helloworld {

	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
}
