package com.skidmoreCodes.bootCamp.data;

import java.time.LocalDate;

public class Todo {
	
	public int id;
	
	public String name;
	
	public LocalDate deadline;
	
	public boolean isDone;
	
	public String user;
	
	public String description;
	
	public Todo(int id, String name, LocalDate deadline, boolean isDone, String user, String description) {
		super();
		this.id = id;
		this.name = name;
		this.deadline = deadline;
		this.isDone = isDone;
		this.user = user;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	
	public void flipDone() {
		this.isDone = !this.isDone;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", name=" + name + ", deadline=" + deadline + ", isDone=" + isDone + ", user=" + user
				+ ", description=" + description + "]";
	}


}
