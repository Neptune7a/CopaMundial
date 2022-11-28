package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Estadio;

public interface EstadioRepository extends JpaRepository<Estadio,Integer>{
	
	
}