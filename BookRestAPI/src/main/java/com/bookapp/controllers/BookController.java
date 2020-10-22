package com.bookapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book>showAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books-by-author/{author}")
	public List<Book>showByAuthor(@PathVariable("author") String author){
		return bookService.getByAuthor(author);
	}
	
	@GetMapping("/books-by-Id/{bookId}")
	public Book showById(@PathVariable("bookId")int id){
		return bookService.getById(id);
	}
}
