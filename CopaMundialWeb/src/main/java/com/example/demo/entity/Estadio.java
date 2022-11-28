package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class Estadio implements Serializable {
	@Id
	@SequenceGenerator(name="estadio_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="estadio_id_seq")
	private Integer id;
	private String nombre;
	private Integer capacidad;
}
