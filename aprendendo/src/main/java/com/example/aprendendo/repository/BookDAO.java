package com.example.aprendendo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.aprendendo.model.Book;

public interface BookDAO  extends CrudRepository<Book, Long>{

}
