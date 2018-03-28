package com.example.aprendendo.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.aprendendo.model.UnitOfMeasure;

public interface UnityOfMeasureDAO extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);
}
