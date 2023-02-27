package com.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	Map<String,Book> books = new HashMap<>();
	
	@GetMapping("/")
	public String greetings() {
		return "Spring securty demo.";
	}
	@GetMapping("/books")
	public Collection<Book> getAllBooks() {
		return this.books.values();
	}
	@PostMapping("/book")
	public Book addNewBook(@RequestBody Book book) {
		return this.books.put(book.getId(),book);
	}
	@PatchMapping("/book")
	public Book updateBook(@RequestBody Book book) {
		return this.books.replace(book.getId(),book);
	}
	@DeleteMapping("/book/{id}")
	public Book deleteBookById(@PathVariable String id) {
		return this.books.remove(id);
	}
	
	
}
