package com.generation.olamundo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listaObjetivos")

public class ListaObjetivos {

	@GetMapping
	public String listaObjetivos() {
		List<String> listaObjetivos = new ArrayList<String>();
		
		listaObjetivos.add("Melhorar Habilidade de leitura");
		listaObjetivos.add("Ter Mentalidade de Crescimento");
		listaObjetivos.add("Ter Responsabilidade Pessoal");
		listaObjetivos.add("Aprender mais sobre Orientação ao Detalhe");
		listaObjetivos.add("Melhorar trabalho em equipe");
		listaObjetivos.add("Melhorar o foco");
		listaObjetivos.add("Ser mais Organizado");
		
		return listaObjetivos.toString();
		
	}
}