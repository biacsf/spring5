package com.example.aprendendo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.aprendendo.model.Recipe;

public interface RecipeDAO extends CrudRepository<Recipe, Long> {

}
