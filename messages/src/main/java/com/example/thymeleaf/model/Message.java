package com.example.thymeleaf.model;

// THIS STYLE of Model ONLY WORKS FOR WEEK TWO TASKS. 

public class Message {
	private int id;
	private String title;
	private String text;
	
	public Message() {
		super();
	}
	
	

	public Message(int id, String title, String text) {
		super();
		this.id = id;
		this.title = title;
		this.text = text;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", title=" + title + ", text=" + text + "]";
	}
	
	
	
}