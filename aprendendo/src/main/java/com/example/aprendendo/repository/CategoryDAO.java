package com.example.aprendendo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.aprendendo.model.Category;

public interface CategoryDAO extends CrudRepository<Category, Long>{

	Optional<Category> findByDescription(String description);
}
