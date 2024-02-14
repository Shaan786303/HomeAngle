package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.ElectricianEntity;

@Repository
public interface ElectricianDao extends JpaRepository<ElectricianEntity, String> {

}
