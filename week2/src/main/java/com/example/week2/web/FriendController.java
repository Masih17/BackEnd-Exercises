package com.example.week2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {
	
	//Default method is GET so perhaps we could skip it. 
	@RequestMapping(value= "/index", method=RequestMethod.GET) 
	public String index(@RequestParam(name="name", required = false) String name, Model model) {
		return "index";
	}

}
