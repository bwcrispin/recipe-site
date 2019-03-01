package com.bencrispin.recipesite.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String category;
	
	@OneToMany(mappedBy="category")
	private Collection<Recipe> recipes;
	
	public Category(String category) {
		this.category = category;
	}
	
	public Category () {}

	public Long getId() {
		return id;
	}

	public String getCategory() {
		return category;
	}

	public Collection<Recipe> getRecipes() {
		return recipes;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category=" + category + "]";
	}
	
	
	
}
