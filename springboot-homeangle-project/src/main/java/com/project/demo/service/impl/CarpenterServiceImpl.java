package com.project.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.CarpenterDao;
import com.project.demo.entity.CarpenterEntity;
import com.project.demo.service.CarpenterService;

@Service
public class CarpenterServiceImpl implements CarpenterService {

	@Autowired
	private CarpenterDao carpenterDao;

	@Override
	public void saveCarpenter(CarpenterEntity carpenter) {
		this.carpenterDao.save(carpenter);

	}

	@Override
	public List<CarpenterEntity> getAllCarpenter() {
		return carpenterDao.findAll();
	}

	@Override
	public CarpenterEntity updateCarpenter(String id) {
		Optional<CarpenterEntity> optional = carpenterDao.findById(id);
		CarpenterEntity carpenter = null;
		if (optional.isPresent()) {
			carpenter = optional.get();
		} else {
			throw new RuntimeException(" carpenter not found for id :: " + id);
		}
		return carpenter;
	}

	@Override
	public void deleteCarpenter(String id) {
		this.carpenterDao.deleteById(id);

	}
}
