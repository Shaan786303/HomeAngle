package com.project.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.ElectricianDao;
import com.project.demo.entity.ElectricianEntity;
import com.project.demo.service.ElectricianService;

@Service
public class ElectricianServiceImpl implements ElectricianService {

	@Autowired 
	private ElectricianDao electricianDao;
	
	@Override
	public void saveElectrician(ElectricianEntity electrician) {
		this.electricianDao.save(electrician);
		
	}
	
	@Override
	public List<ElectricianEntity> getAllElectrician() {
		return electricianDao.findAll();
	}

	@Override
	public ElectricianEntity updateElectrician(String id) {
		Optional < ElectricianEntity > optional = electricianDao.findById(id);
		ElectricianEntity electrician = null;
        if (optional.isPresent()) {
            electrician = optional.get();
        } else {
            throw new RuntimeException(" Electrician not found for id :: " + id);
        }
        return electrician;
	}

	@Override
	public void deleteElectrician(String id) {
		this.electricianDao.deleteById(id);
		
	}

}
