package com.example.aprendendo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
public class TechBookServiceImpl implements BookService{

	@Override
	public String getBookType() {
		return "Tech";
	}

}
