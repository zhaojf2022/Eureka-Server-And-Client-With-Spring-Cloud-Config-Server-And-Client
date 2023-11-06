package com.exf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController 
{
	
	@GetMapping("/get")
	public ResponseEntity<?> get()
	{
		return new ResponseEntity<String>("Hello World!",HttpStatus.OK);
	}
}
