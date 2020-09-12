package com.example.bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.bookstore.domain.Book;

@Controller
public class BookController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(@RequestParam (value="book") Book book)  { 
	return "home";
	}
}
