package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Partido;
import com.example.demo.repository.PartidoRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/partidos")
public class PartidoController {

	@Autowired
	PartidoRepository partidoRepository;
	
	@GetMapping
	public List<Partido> getCategoriaAll() {

		return partidoRepository.findAll();
	}
	
	@PostMapping
	public Partido postPartido(@RequestBody Partido partido) {
		
		partidoRepository.save(partido);
		
		return partido;
		

	}
	
	
}
