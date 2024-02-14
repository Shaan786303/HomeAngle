package com.project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_book")
public class BookEntity 
{
	@Id
	@Column(name="Book_Id", length=20)
	private String id;
	@Column(name="Book_Date", length=20, nullable=false)
	private String date;
	@Column(name="Book_Status", length=20, nullable=false)
	private String status;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
