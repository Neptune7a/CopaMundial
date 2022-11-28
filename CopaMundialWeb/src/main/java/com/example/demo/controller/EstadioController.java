package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Estadio;
import com.example.demo.repository.EstadioRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/estadios")
public class EstadioController {
	@Autowired
	EstadioRepository estadioRepository;
	
	@DeleteMapping("/{id}")
	public Estadio deleteEstadiobyId(@PathVariable Integer id) {
		
		Optional<Estadio> estadio = estadioRepository.findById(id);
		
		if (estadio.isPresent()) {
			
			Estadio estadioReturn = estadio.get();
			
			estadioRepository.deleteById(id);
			
			return estadioReturn;
		}
		
		return null;

	}
}
