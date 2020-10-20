package com.bookapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO{

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return showBookList();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		
		List<Book> newBookList = new ArrayList<>() ;
		for (Book book : showBookList()) {
			if(book.getAuthor().equals(author))
				newBookList.add(book);
		}
		return newBookList;
	}

	@Override
	public Book getById(int id) {
		// TODO Auto-generated method stub
		for (Book book : showBookList()) {
			if(book.getBookId()==id)
				return book;
		}
		return null;
	
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		List<Book> newBookList = new ArrayList<>() ;
		for (Book book : showBookList()) {
			if(book.getCategory().equals(category))
				newBookList.add(book);
		}
		return newBookList;
		
	}

	
	private List<Book> showBookList() {
		return Arrays.asList(
				new Book(1,"Learn java" , "Kathy", 2000.0,"Tech"),
				new Book(2,"Learn C" , "Kaithy", 3000.0,"Tech"),
				new Book(3,"Twinner" , "Visva", 1000.0,"Comic"),
				new Book(4,"Megaman" , "GVm", 4000.0,"Movie"));
		
	}
}
