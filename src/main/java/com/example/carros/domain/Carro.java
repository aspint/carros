package com.example.carros.domain;

import javax.persistence.*;

import lombok.Data;


@Entity( name="carro")
@Data
public class Carro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String tipo;
	

}
