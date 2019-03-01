package com.bencrispin.recipesite.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Recipe {

	@Id
	@GeneratedValue
	private Long id;
	private String recipeName;
	@Lob
	private String recipedesc;
	
	@ManyToOne
	public Category category;
	
	public Recipe(String recipeName, String recipedesc, Category category) {
		this.recipeName = recipeName;
		this.recipedesc = recipedesc;
		this.category = category;
	}

	public Recipe() {} //JPA hook

	public Long getId() {
		return id;
	}

	public String getName() {
		return recipeName;
	}
	
	public String getRecipe() {
		return recipedesc;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", name=" + recipeName + ", recipe=" + recipedesc + ", category=" + category + "]";
	}
	
	
}
