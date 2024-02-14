package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.BookEntity;

public interface BookService {
	void saveBook(BookEntity book);
	List <BookEntity > getAllBookings();
	void deleteBook(String id);
}
