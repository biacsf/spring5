package com.example.aprendendo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.aprendendo.repository.BookDAO;

@Controller
public class BookController {
		@Autowired
	  private BookDAO bookDAO;

	    @RequestMapping("/books")
	    public String getBooks(Model model){

	        model.addAttribute("books", bookDAO.findAll());

	        return "books";
	    }
}
