package com.example.aprendendo.service;

import org.springframework.stereotype.Service;

@Service
public class HistoryBookServiceImpl implements BookService{

	@Override
	public String getBookType() {
		return "History";
	}

}
