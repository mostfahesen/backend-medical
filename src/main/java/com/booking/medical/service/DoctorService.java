package com.booking.medical.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.medical.entity.Doctor;

import com.booking.medical.repositary.Doctorepo;
import com.booking.medical.request.DoctorRequest;

@Service
public class DoctorService {

	@Autowired
	Doctorepo doctorepo;

	@Transactional
	public boolean adddoctor(DoctorRequest doctorRequest) {
		Doctor doctor = new Doctor();
		doctor.setName(doctorRequest.getName());
		doctor.setSpecialization(doctorRequest.getSpecialization());
		doctor.setGovernorate(doctorRequest.getGovernorate());
		doctor.setArea(doctorRequest.getArea());
		doctorepo.save(doctor);
		return true;
	}
}