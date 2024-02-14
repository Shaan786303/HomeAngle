package com.project.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.LoginDao;
import com.project.demo.entity.LoginEntity;
import com.project.demo.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired 
	private LoginDao loginDao;
	
	@Override
	public void userLogin(LoginEntity login) {
		this.loginDao.save(login);
		
	}

}
