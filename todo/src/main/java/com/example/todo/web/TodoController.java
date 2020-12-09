package com.example.todo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.todo.domain.Todo;
import com.example.todo.domain.TodoRepository;

@Controller
public class TodoController {

	// @Autowired annotation bring repository class into the context, and will
	// inject an instance of the service to this class.
	@Autowired
	private TodoRepository todoRepository;

//	@Autowired
//	private CategoryRepository categoryRepository;

	// Home page
	@RequestMapping(value = { "/", "/home" })
	public String todoList(Model model) {
		model.addAttribute("todolist", todoRepository.findAll());
		return "home";
	}

	// Add a new task

	@GetMapping("/add")
	public String addTodo(Model model) {
		model.addAttribute("todo", new Todo());
		return "addtask";
	}

	@PostMapping(value = "/save")
	public String save(Todo todo) {
		todoRepository.save(todo);
		return "redirect:home";
	}

	@GetMapping(value = "/delete/{id}")
	public String deleteStudent(@PathVariable("id") Long todoId, Model model) {
		todoRepository.deleteById(todoId);
		return "redirect:../"; //Check this later
	}

}
