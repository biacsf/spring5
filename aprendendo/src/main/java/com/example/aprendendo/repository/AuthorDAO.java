package com.example.aprendendo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.aprendendo.model.Author;

public interface AuthorDAO extends CrudRepository<Author, Long>{

}
