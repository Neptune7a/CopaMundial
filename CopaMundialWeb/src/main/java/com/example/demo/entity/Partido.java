package com.example.demo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Partido {
	private Integer id;
	private Timestamp fecha;
	@ManyToOne
	@JoinColumn(name="estadio_id")
	private Estadio estadio;

}
