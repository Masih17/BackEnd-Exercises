package com.example.helloworld.Exercises;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WellcomeToLocation {
	
	@RequestMapping("/hello") 
	public String hello(@RequestParam String location, String name) {

		return "Welcome to the " + location +" "+ name + "!";
	}
}
