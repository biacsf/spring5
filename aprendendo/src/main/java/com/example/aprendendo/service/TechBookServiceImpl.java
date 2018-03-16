package com.example.aprendendo.service;

import org.springframework.stereotype.Service;

@Service
public class TechBookServiceImpl implements BookService{

	@Override
	public String getBookType() {
		return "Tech";
	}

}
