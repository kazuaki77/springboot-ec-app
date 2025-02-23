package com.kazu77project.user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.kazu77project.user_service.model.Test;
import com.kazu77project.user_service.service.TestService;

@RestController
public class TestController {

	private TestService service;

	@Autowired
	public TestController(TestService service) {
		this.service = service;
	}

	@GetMapping("/app/tests/{id}")
	public Test getTest(@PathVariable Long id) {
		return service.retrieveTestById(id);
	}

}
