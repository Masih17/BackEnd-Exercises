package com.example.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.todo.domain.Todo;
import com.example.todo.domain.TodoRepository;

@SpringBootApplication
public class TodoApplication {

	private static final Logger log = LoggerFactory.getLogger(TodoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

	@Bean
	public CommandLineRunner todoListCommand(TodoRepository todoRepository) {
		return (args) -> {

			log.info("Manually added tasks");

//			Category history = new Category("Home");
//			Category biography = new Category("Fitness");
//			Category fiction = new Category("Maintenance");
//			Category philosophical = new Category("School");
//
//			cateRepository.save(history);
//			cateRepository.save(biography);
//			cateRepository.save(fiction);
//			cateRepository.save(philosophical);

			todoRepository.save(new Todo("Dishes"));
			todoRepository.save(new Todo("Urpo"));
			todoRepository.save(new Todo("Floors"));
			todoRepository.save(new Todo("Run"));

			log.info("Showing the tasks");

			for (Todo todo : todoRepository.findAll()) {
				log.info(todo.toString());

			}

		};
	}
}