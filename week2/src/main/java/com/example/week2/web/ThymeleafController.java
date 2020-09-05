package com.example.week2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.week2.model.Message;

public class ThymeleafController {
	
	@RequestMapping("/hello")
	public String greeting(@RequestParam(value = "name") String name, Model model) {
		model.addAttribute("name", name);
		return "hello"; //this is important. What we return here must be the name of template html. 
	}
	
	@RequestMapping("/message")
	public String messages(Model model) {
		List<Message> messages = new ArrayList<Message>();
		Message msg1 = new Message(1 , "Greeting", "Whats up?");
		Message msg2 = new Message(2 , "Greeting", "Hello");
		messages.add(msg1);
		messages.add(msg2);
		model.addAttribute("messages", messages);
		return "message"; //returns name of the View thus message
	}
}
