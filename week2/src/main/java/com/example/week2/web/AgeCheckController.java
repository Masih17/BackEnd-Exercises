package com.example.week2.web;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AgeCheckController {

	@RequestMapping("/hello")
	public String ageCheck(@RequestParam(value = "name") String name, int age, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		return "hello"; // this is important. What we return here must be the name of template html.
	}
}
