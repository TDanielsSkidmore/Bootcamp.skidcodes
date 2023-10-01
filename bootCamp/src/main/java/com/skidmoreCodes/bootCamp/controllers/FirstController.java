package com.skidmoreCodes.bootCamp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("")
	@ResponseBody
	public String helloWorldBasic() {
		return "<h1>Hello world<h1><br><h4>nice to meet you all<h4>";
	}
	
	@RequestMapping("/hello-moon")
	@ResponseBody
	public String helloMoonBasic() {
		return "Hello-Moon";
	}

}
