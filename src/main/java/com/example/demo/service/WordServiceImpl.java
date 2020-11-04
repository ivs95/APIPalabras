package com.example.demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Word;
import com.example.demo.repository.WordRepository;

@Service
public class WordServiceImpl implements WordService{
	
	@Autowired
	private WordRepository repository; 

	@Override
	public void insert(String string) {
		// TODO Auto-generated method stub
		String upper = string.toUpperCase();
		String lower = string.toLowerCase();
		
		Word word = new Word(upper, lower);
		repository.insert(word);
		
	}

	@Override
	public Collection<Word> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
