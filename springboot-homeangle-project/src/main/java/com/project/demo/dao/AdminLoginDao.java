package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.AdminLoginEntity;

@Repository
public interface AdminLoginDao extends JpaRepository<AdminLoginEntity, String> {

}
