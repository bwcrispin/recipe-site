package com.bencrispin.recipesite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bencrispin.recipesite.models.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {


}
