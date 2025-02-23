package com.kazu77project.user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazu77project.user_service.mapper.TestMapper;
import com.kazu77project.user_service.model.Test;

@Service
public class TestService {

	private TestMapper mapper;

	@Autowired
	public TestService(TestMapper mapper) {
		this.mapper = mapper;
	}

	public Test retrieveTestById(Long id) {
		return mapper.findById(id);
	}

}
