package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.CarpenterEntity;

@Repository
public interface CarpenterDao extends JpaRepository<CarpenterEntity, String>{

}
