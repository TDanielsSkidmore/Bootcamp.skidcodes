package com.skidmoreCodes.bootCamp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.skidmoreCodes.bootCamp.service.AuthService;

@SessionAttributes("user_name")
@Controller
public class LoginController {
	
	@Autowired
	public AuthService auth;
	
	
	@RequestMapping(value ="login-page", method=RequestMethod.GET)
	public String mainLogin() {
		return "login-page";
	}
	
	@RequestMapping(value="login-page", method=RequestMethod.POST)
	public String LoginPost(@RequestParam String username , @RequestParam String password, ModelMap model) {
		if (auth.auth(username, password)) {
			model.put("user_name", username);			
			return "redirect:/";
		}
		else {
			return "login-page";
		}
	}

}
