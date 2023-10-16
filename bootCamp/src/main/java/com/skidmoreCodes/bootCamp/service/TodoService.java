package com.skidmoreCodes.bootCamp.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.skidmoreCodes.bootCamp.data.Todo;

@Service
public class TodoService {
	
	public ArrayList<Todo> todos;
	
	private int id = 0;

	public TodoService() {
		super();
		this.todos = new ArrayList<Todo>();
		this.todos.add(new Todo(++id, "learn spring boot", LocalDate.now().plusWeeks(2),false, "troy", "learn how to create MPAs using spring boot" ));
		this.todos.add(new Todo(++id, "create a new app", LocalDate.now().plusWeeks(4),false, "troy", "create a digital mapping of the CIS building" ));
		this.todos.add(new Todo(++id, "learn spring boot", LocalDate.now().plusWeeks(2),false, "troy", "learn how to create MPAs using spring boot" ));
	}

	public ArrayList<Todo> getTodos() {
		return todos;
	}
	
	

}
