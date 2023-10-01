package com.skidmoreCodes.bootCamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class FirstController {
	
	@RequestMapping("")
	public String helloWorldBasic() {
		return "helloworld";
	}
	
	@RequestMapping("/hello-moon")
	@ResponseBody
	public String helloMoonBasic() {
		return "Hello-Moon";
	}

}
