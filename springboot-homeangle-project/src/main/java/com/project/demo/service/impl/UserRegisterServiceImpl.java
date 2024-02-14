package com.project.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.UserRegisterDao;
import com.project.demo.entity.UserRegisterEntity;
import com.project.demo.service.UserRegisterService;

@Service
public class UserRegisterServiceImpl implements UserRegisterService
{
	@Autowired 
	private UserRegisterDao userRegisterDao;
	
	@Override
	public void saveUser(UserRegisterEntity user) {
		this.userRegisterDao.save(user);
		
	}

	@Override
	public List<UserRegisterEntity> getAllUsers() {
		return userRegisterDao.findAll();
	}

	@Override
	public UserRegisterEntity updateUser(String userid) {
		Optional < UserRegisterEntity > optional = userRegisterDao.findById(userid);
		UserRegisterEntity user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException(" User not found for id :: " + userid);
        }
        return user;
	}

	@Override
	public void deleteUser(String userid) {
		this.userRegisterDao.deleteById(userid);
		
	}
	
}

