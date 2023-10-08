package com.skidmoreCodes.bootCamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("user_name")
@Controller
public class WelcomeController {
	
	@RequestMapping("")
	public String helloWorldBasic() {
		return "welcome";
	}
	
	

}
