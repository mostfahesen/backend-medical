package com.booking.medical.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DOCTOR")
public class Doctor {

	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "doctor_generator")
	@SequenceGenerator(name="doctor_generator", sequenceName = "doctor_seq" , allocationSize=1)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String specialization;
	
	@Column
	private String governorate;
	
	@Column
	private String area;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getGovernorate() {
		return governorate;
	}

	public void setGovernorate(String governorate) {
		this.governorate = governorate;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
	
}
