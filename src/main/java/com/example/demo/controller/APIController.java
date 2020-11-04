package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Word;
import com.example.demo.service.WordService;

@RestController
public class APIController {
	
	@Autowired
	private WordService wordService;
	
	@RequestMapping(value="/getAll")
	public List<Word> getString(){
		return (List<Word>) wordService.findAll();
	}
	
	@RequestMapping(value="/insert")
	public void insertString(@RequestParam("string") String string) {
		wordService.insert(string);
	}

}
