package com.booking.medical.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT")
public class Patient {


	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "patient_generator")
	@SequenceGenerator(name="patient_generator", sequenceName = "patient_seq" , allocationSize=1)
	private Long id;
	@Column
	private String username;
	@Column
	private String pass;
	@Column
	private String email;
	
	@Column
	private String city;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
