package com.bencrispin.recipesite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue
	private Long id;
	private String ingName;
	
	@ManyToOne
	public Measurement measure;
	
	public Ingredient() {}
	
	public Ingredient(String ingName, Measurement measure) {
		this.ingName = ingName;
		this.measure = measure;
	}

	public Long getId() {
		return id;
	}

	public String getIngName() {
		return ingName;
	}

	public Measurement getMeasure() {
		return measure;
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", ingName=" + ingName + ", measure=" + measure + "]";
	}
	
}
