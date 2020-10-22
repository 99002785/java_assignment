package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.service.BookService;

@SpringBootApplication
public class OnlineBookAppApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookAppApplication.class, args);
	}
	
	@Autowired
	BookService bookService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		bookService.getAllBooks().forEach(System.out::println);
		bookService.getByAuthor("Vis").forEach(System.out::println);
	
		
	}

}
