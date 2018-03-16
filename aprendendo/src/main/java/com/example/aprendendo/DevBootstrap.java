package com.example.aprendendo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.aprendendo.model.Author;
import com.example.aprendendo.model.Book;
import com.example.aprendendo.repository.AuthorDAO;
import com.example.aprendendo.repository.BookDAO;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private AuthorDAO authorDAO;
	@Autowired
	private BookDAO bookDAO;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData() {

		// Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorDAO.save(eric);
		bookDAO.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Book noEJB = new Book("J2EE Development without EJB", "23444");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorDAO.save(rod);
		bookDAO.save(noEJB);
	}
}
