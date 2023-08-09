package com.exf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@Configuration
@RefreshScope
@RestController
public class MainController 
{
	@Autowired
	private UserRepo repo;
	
	@Value("${name}")
	private String name;
	@Autowired
	private Environment environment;
	@GetMapping("/getMap")
	public ResponseEntity<?> get()
	{
		System.out.println(name);
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("spring.data.mongodb.database"));
		return new ResponseEntity<List<Student>>(repo.findAll(), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Student student)
	{
		repo.save(student);
		return new ResponseEntity<String>("Saved", HttpStatus.OK);
	}
}
