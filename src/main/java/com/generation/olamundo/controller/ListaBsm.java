package com.generation.olamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listaBsm")
public class ListaBsm {
	@GetMapping
	public String lista() {
		List<String> lista = new ArrayList<String>();
		
		lista.add("Persistência");
		lista.add("Mentalidade de Crescimento");
		lista.add("Responsabilidade Pessoal");
		lista.add("Orientação ao Futuro");
		lista.add("Orientação ao Detalhe");
		lista.add("Trabalho em Equipe");
		lista.add("Comunicação");
		lista.add("Proatividade");
		
		return lista.toString();
		
	}
}
