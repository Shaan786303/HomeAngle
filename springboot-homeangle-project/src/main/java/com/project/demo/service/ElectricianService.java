package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.ElectricianEntity;

public interface ElectricianService {
	void saveElectrician(ElectricianEntity electrician);
	List <ElectricianEntity > getAllElectrician();
	ElectricianEntity updateElectrician(String id);
	void deleteElectrician(String id);
	
}
