package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Seleccion;

import com.example.demo.repository.SeleccionRepository;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/selecciones")
public class SeleccionController {
	
		
		@Autowired
		SeleccionRepository seleccionRepository;
		
		@GetMapping
		public List<Seleccion> getCategoriaAll() {

			return seleccionRepository.findAll();
		}
		
		@PostMapping
		public Seleccion postSeleccion(@RequestBody Seleccion seleccion) {
			
			seleccionRepository.save(seleccion);
			
			return seleccion;
			

		}
}