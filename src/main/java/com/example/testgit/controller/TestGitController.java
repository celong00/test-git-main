package com.example.testgit.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestGitController {
	
	@GetMapping("")
	private ResponseEntity<?> test() {
		return new ResponseEntity<Object>("success", HttpStatus.OK);
	}
	
}
