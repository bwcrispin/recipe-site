package com.bencrispin.recipesite.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bencrispin.recipesite.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findByCategory(String category);

}
