package com.example.demo.Model;

import org.springframework.data.annotation.Id;

public class Word {

	@Id
	private String id;
	
	public String upper;
	public String lower;
	
	public Word() {}
	
	
	public Word(String upper, String lower) {
		super();
		this.upper = upper;
		this.lower = lower;
	}


	@Override
	public String toString() {
		return "Word [id=" + id + ", upper=" + upper + ", lower=" + lower + "]";
	}
	
	
	
	
	
	
}
