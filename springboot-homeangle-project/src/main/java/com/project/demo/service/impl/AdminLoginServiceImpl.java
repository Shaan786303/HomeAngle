package com.project.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.AdminLoginDao;
import com.project.demo.entity.AdminLoginEntity;
import com.project.demo.service.AdminLoginService;

@Service
public class AdminLoginServiceImpl implements AdminLoginService {

	@Autowired
	private AdminLoginDao adminLoginDao;

	@Override
	public void adminLogin(AdminLoginEntity login) {
		this.adminLoginDao.save(login);

	}
}
