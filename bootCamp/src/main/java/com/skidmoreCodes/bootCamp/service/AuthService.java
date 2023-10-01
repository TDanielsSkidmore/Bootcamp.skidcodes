package com.skidmoreCodes.bootCamp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	
	
	public boolean auth(String username, String password) {
		return (username.equalsIgnoreCase("Troy") && password.equalsIgnoreCase("password"));
	}
}
