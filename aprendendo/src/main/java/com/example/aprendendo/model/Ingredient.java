package com.example.aprendendo.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(exclude="recipe")
public class Ingredient {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private BigDecimal amount;
	
	@OneToOne
	private UnitOfMeasure uom;
	
	@ManyToOne
	private Recipe recipe;

	public Ingredient() {
		
	}

	public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
		super();
		this.description = description;
		this.amount = amount;
		this.uom = uom;
	}

	
}
