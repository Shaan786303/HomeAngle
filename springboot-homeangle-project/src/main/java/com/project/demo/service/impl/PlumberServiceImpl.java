package com.project.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.PlumberDao;
import com.project.demo.entity.PlumberEntity;
import com.project.demo.service.PlumberService;

@Service
public class PlumberServiceImpl implements PlumberService {

	@Autowired 
	private PlumberDao plumberDao;
	
	@Override
	public void savePlumber(PlumberEntity plumber) {
		this.plumberDao.save(plumber);
		
	}
	
	@Override
	public List<PlumberEntity> getAllPlumber() {
		return plumberDao.findAll();
	}

	@Override
	public PlumberEntity updatePlumber(String id) {
		Optional < PlumberEntity > optional = plumberDao.findById(id);
		PlumberEntity plumber = null;
        if (optional.isPresent()) {
        	plumber = optional.get();
        } else {
            throw new RuntimeException(" plumber not found for id :: " + id);
        }
        return plumber;
	}

	@Override
	public void deletePlumber(String id) {
		this.plumberDao.deleteById(id);
		
	}

}
