package com.bencrispin.recipesite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Measurement {

	@Id
	@GeneratedValue
	private Long id;
	private String measure;
	
	public Measurement() {}
	
	public Measurement(String measure) {
		this.measure = measure;
	}

	public Long getId() {
		return id;
	}

	public String getMeasure() {
		return measure;
	}

	@Override
	public String toString() {
		return "Measurement [id=" + id + ", measure=" + measure + "]";
	}

}
