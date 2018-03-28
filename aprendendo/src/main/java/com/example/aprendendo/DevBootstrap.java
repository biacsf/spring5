package com.example.aprendendo;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		initData();
	}

	private void initData() {

		// Eric
		/*Author eric = new Author("Eric", "Evans");
		Notes ddd = new Notes("Domain Driven Design", "1234");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorDAO.save(eric);
		bookDAO.save(ddd);

		// Rod
		Author rod = new Author("Rod", "Johnson");
		Notes noEJB = new Notes("J2EE Development without EJB", "23444");
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorDAO.save(rod);
		bookDAO.save(noEJB);*/
	}
}
