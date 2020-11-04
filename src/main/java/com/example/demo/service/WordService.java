package com.example.demo.service;

import java.util.Collection;

import com.example.demo.Model.Word;

public interface WordService {

	
	public abstract void insert(String word);
	public abstract Collection<Word> findAll();
}
