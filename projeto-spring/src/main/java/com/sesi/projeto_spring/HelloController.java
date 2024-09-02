package com.sesi.projeto_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/formulario0")
	public  String entregarSalgado() {
		return "formulario";
		}		
	
	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}	
	}
	

