package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.PlumberEntity;

@Repository
public interface PlumberDao extends JpaRepository<PlumberEntity, String> {

}
