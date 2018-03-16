package com.example.aprendendo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pt")
public class HistoryBookServiceImpl implements BookService{

	@Override
	public String getBookType() {
		return "History";
	}

}
