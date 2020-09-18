package com.example.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookstore.domain.Book;
import com.example.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookStoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookStoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookListCommand(BookRepository repository) {
		return (args) -> {

			// Your code...add some demo data to db

			log.info("Few test book");
			
			repository.save(new Book("Sapiens: A Brief History of Humankind", "	Yuval Noah Harari", 2011,
					"978-952-279-470-3", 12.00));
			repository.save(new Book("Homo Deus: A Brief History of Tomorrow", "	Yuval Noah Harari", 2016,
					"978-191-070-187-4", 15.00));
			repository.save(new Book("Zen and the Art of Motorcycle Maintenance", "Robert M. Pirsig", 1974,
					"0-688-00230-7", 17.00));

			log.info("Showing your books");
			
			for (Book book : repository.findAll()) {
				log.info(book.toString());
			}

		};
	}
}
