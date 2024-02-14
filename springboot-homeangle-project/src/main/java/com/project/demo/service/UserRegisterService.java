package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.UserRegisterEntity;

public interface UserRegisterService 
{
	void saveUser(UserRegisterEntity user);
	List  <UserRegisterEntity > getAllUsers();
	UserRegisterEntity updateUser(String userid);
	void deleteUser(String userid);
}
