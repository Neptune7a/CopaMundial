package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Resultado;

import com.example.demo.repository.ResultadoRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/resultados")
public class ResultadoController {
	
	@Autowired
	ResultadoRepository resultadoRepository;
	
	@PostMapping
	public Resultado postResultado(@RequestBody Resultado resultado) {
		
		resultadoRepository.save(resultado);
		
		return resultado;
		

	}

}