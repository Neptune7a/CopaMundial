package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Partido getCategoriasbyId(@PathVariable Integer id) {
		
		Optional<Partido> partido = partidoRepository.findById(id);
		
		if (partido.isPresent()) {
			return partido.get();
		}
		
		return null;

	}
	
	@PutMapping("/{id}")
	public Partido putPartidobyId(@PathVariable Integer id, @RequestBody Partido partido) {
		
		Optional<Partido> partidoCurrent = partidoRepository.findById(id);
		
		if (partidoCurrent.isPresent()) {
			
			Partido partidoReturn = partidoCurrent.get();
			
			
			//aqui ya no supe como completar, ya que los goles estan en resultado
			
			
			
			partidoRepository.save(partidoReturn);
			
			return partidoReturn;
		}
		
		return null;

	}
	
}
