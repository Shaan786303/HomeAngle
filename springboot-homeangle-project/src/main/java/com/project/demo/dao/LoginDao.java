package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.LoginEntity;

@Repository
public interface LoginDao extends JpaRepository<LoginEntity, String> {

}
