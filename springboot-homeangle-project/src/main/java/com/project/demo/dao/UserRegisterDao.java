package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.UserRegisterEntity;

@Repository
public interface UserRegisterDao extends JpaRepository<UserRegisterEntity, String>
{

}
