package com.skidmoreCodes.bootCamp.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skidmoreCodes.bootCamp.data.Todo;
import com.skidmoreCodes.bootCamp.service.TodoService;




@Controller
public class TodoController {
	
	@Autowired
	public TodoService todoService;
	
	@RequestMapping(value="your-todos")
	public String getYourTodos(ModelMap model) {
		ArrayList<Todo> todos = todoService.getTodos();
		model.addAttribute("todos", todos);
		return "yourtodos";
	}

}
