package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-world")
public class ExerciciosController {
	@GetMapping
	public String helloWorld() {
		return "Hello world!!!";
	}
	
	
}
