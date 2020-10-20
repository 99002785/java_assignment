package com.bookapp.client;

import java.util.List;

import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService bookService = new BookServiceImpl();
		
		List<Book> bookList = bookService.getAllBooks();
		String author = "Visva";
		System.out.println(bookService.getByAuthor(author));
		
		for(Book book:bookList)
			System.out.println(book);
	}

}
