package com.example.aprendendo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.aprendendo.model.Recipe;
import com.example.aprendendo.repository.RecipeDAO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService{
	  private final RecipeDAO recipeDAO;

	    public RecipeServiceImpl(RecipeDAO recipeDAO) {
	        this.recipeDAO = recipeDAO;
	    }

	    @Override
	    public Set<Recipe> getRecipes() {
	    	log.debug("Return Recipes");

	        Set<Recipe> recipeSet = new HashSet<>();
	        recipeDAO.findAll().iterator().forEachRemaining(recipeSet::add);
	        return recipeSet;
	    }
}
