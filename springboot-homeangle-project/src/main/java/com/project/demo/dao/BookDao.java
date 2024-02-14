package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.BookEntity;

@Repository
public interface BookDao extends JpaRepository<BookEntity, String>{

}
