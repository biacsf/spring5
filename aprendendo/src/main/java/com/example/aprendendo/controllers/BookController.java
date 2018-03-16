package com.example.aprendendo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.aprendendo.repository.BookDAO;
import com.example.aprendendo.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookDAO bookDAO;
	
	@Autowired
	@Qualifier("techBookServiceImpl")
	private BookService bookService;

	@RequestMapping("/books")
	public String getBooks(Model model) {

		model.addAttribute("books", bookDAO.findAll());
		
		System.out.println(bookService.getBookType());

		return "books";
	}
}
