package com.project.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

	@Entity
	@Table(name="tbl_carpenter")
	public class CarpenterEntity {

		@Id
		@Column(name="Carpenter_Id", length=20)
		private String id;
		@Column(name="Name", length=30, nullable=false)
		private String name;
		@Column(name="Email", unique=true, length=50, nullable=false)
		private String email;
		@Column(name="Contact", unique=true, length=12, nullable=false)
		private String contact;
		@Column(name="Address", length=50, nullable=false)
		private String address;
		@Column(name="Experience", length=20, nullable=false)
		private String experience;
		@Column(name="Fees", length=20, nullable=false )
		private long fees;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
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
		public String getExperience() {
			return experience;
		}
		public void setExperience(String experience) {
			this.experience = experience;
		}
		public long getFees() {
			return fees;
		}
		public void setFees(long fees) {
			this.fees = fees;
		}
}
