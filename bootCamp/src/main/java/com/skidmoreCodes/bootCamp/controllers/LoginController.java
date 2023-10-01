package com.skidmoreCodes.bootCamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.skidmoreCodes.bootCamp.service.AuthService;

@Controller
public class LoginController {
	
	@Autowired
	public AuthService auth;
	
	
	@RequestMapping(value ="login-page", method=RequestMethod.GET)
	public String mainLogin() {
		return "login-page";
	}
	
	@RequestMapping(value="login-page", method=RequestMethod.POST)
	public String LoginPost(@RequestParam String username , @RequestParam String password) {
		if (auth.auth(username, password)) {
			return "welcome";
		}
		else {
			return "login-page";
		}
	}

}
