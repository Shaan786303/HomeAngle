package com.project.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.entity.PainterEntity;

@Repository
public interface PainterDao extends JpaRepository<PainterEntity, String>{

}
