package com.project.demo.service;

import java.util.List;

import com.project.demo.entity.PlumberEntity;

public interface PlumberService 
{
	void savePlumber(PlumberEntity plumber);
	List <PlumberEntity > getAllPlumber();
	PlumberEntity updatePlumber(String id);
	void deletePlumber(String id);
}
