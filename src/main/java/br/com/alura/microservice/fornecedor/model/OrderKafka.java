package br.com.alura.microservice.fornecedor.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderKafka {

	private Long identifier;
	private String customer;
	private double value;
}
