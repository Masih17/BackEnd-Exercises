package com.example.bookstore.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import java.util.Optional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;
import com.example.bookstore.domain.CategoryRepository;


@Controller
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository catrepository;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String bookList(Model model) {
		model.addAttribute("books", repository.findAll());
		return "booklist"; //html page name
	}
	
	@RequestMapping(value = "/add")
    public String addBook(Model model){
    	model.addAttribute("book", new Book());
    	model.addAttribute("categories", catrepository.findAll());
        return "addbook";
    }  
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Book book){
        repository.save(book);
        return "redirect:list";
    }  
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    public String deleteBook(@PathVariable("id") Long bookId, Model model) {
    	repository.deleteById(bookId);
        return "redirect:../list"; //double dot because the delete must 
    }    
    @RequestMapping(value = "/modify/{id}", method = RequestMethod.GET)
    public String modifyBook(@PathVariable("id") Long bookId, Model model) {
    	Optional<Book> book = repository.findById(bookId); // optional means there might be a book with the ID or not
    	 model.addAttribute("categories", catrepository.findAll());
    	model.addAttribute("book", book);
        return "modifybook";
    }   
}
