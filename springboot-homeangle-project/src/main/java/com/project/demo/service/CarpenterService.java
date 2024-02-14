package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.CarpenterEntity;

public interface CarpenterService {
	void saveCarpenter(CarpenterEntity carpenter);
	List <CarpenterEntity > getAllCarpenter();
	CarpenterEntity updateCarpenter(String id);
	void deleteCarpenter(String id);
}
