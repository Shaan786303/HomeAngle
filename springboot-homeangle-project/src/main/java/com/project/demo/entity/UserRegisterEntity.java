package com.project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="userregister")
public class UserRegisterEntity 
{
	@Id 
	@Column(name="userid", length=20)
	private String userid;
	@Column(name="Name", length=30, nullable=false)
	private String name;
	@Column(name="Email", unique=true, length=50, nullable=false)
	private String email;
	@Column(name="Password", length=20, nullable=false)
	private String password;
	@Column(name="Contact", unique=true, length=12, nullable=false)
	private String contact;
	@Column(name="Address", length=50, nullable=false)
	private String address;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
