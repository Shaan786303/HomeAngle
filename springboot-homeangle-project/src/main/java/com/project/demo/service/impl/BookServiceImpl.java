package com.project.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.BookDao;
import com.project.demo.entity.BookEntity;
import com.project.demo.service.BookService;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public void saveBook(BookEntity book) {
		this.bookDao.save(book);
	}

	@Override
	public List<BookEntity> getAllBookings() {
		return bookDao.findAll();
	}

	@Override
	public void deleteBook(String id) {
		this.bookDao.deleteById(id);
	}

}
