package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.PainterEntity;

public interface PainterService {
	void savePainter(PainterEntity Painter);
	List <PainterEntity > getAllPainter();
	PainterEntity updatePainter(String id);
	void deletePainter(String id);
}
