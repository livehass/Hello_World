package com.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/olamundo")

public class OlaMundoController {
	@GetMapping
	public String olamundo() {
		return "Olá mundo, a família 71 chegou";
	}
}
