package com.winterfel.irs.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {
	private String successMessage="UserRepository.REGISTRATION_SUCCESS";
	
	public String registerUser() {
		return successMessage;
	}
	
	
	
}
