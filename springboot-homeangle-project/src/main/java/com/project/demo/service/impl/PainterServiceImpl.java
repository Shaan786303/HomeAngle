package com.project.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.dao.PainterDao;
import com.project.demo.entity.PainterEntity;
import com.project.demo.service.PainterService;

@Service
public class PainterServiceImpl implements PainterService {

	@Autowired
	private PainterDao painterDao;

	@Override
	public void savePainter(PainterEntity carpenter) {
		this.painterDao.save(carpenter);

	}

	@Override
	public List<PainterEntity> getAllPainter() {
		return painterDao.findAll();
	}

	@Override
	public PainterEntity updatePainter(String id) {
		Optional<PainterEntity> optional = painterDao.findById(id);
		PainterEntity painter = null;
		if (optional.isPresent()) {
			painter = optional.get();
		} else {
			throw new RuntimeException(" painter not found for id :: " + id);
		}
		return painter;
	}

	@Override
	public void deletePainter(String id) {
		this.painterDao.deleteById(id);

	}
}
