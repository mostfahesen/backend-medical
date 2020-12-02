package com.booking.medical.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.medical.entity.Patient;
import com.booking.medical.repositary.Patientrepo;
import com.booking.medical.request.LoginRequest;
import com.booking.medical.request.RegisterRequest;



@Service
public class PateintService {

	@Autowired
	private Patientrepo patientrepo;
	
	public boolean getallpatient(LoginRequest loginRequest) {
		
		
		List<Patient> list =patientrepo.findByUsernameAndPassword(loginRequest.getUsername(),loginRequest.getPass());
		
		boolean check=false;
		if(list.size() >0) {
			check = true;
		}else {
			check = false;
		}
		
		return check;
	}
	
	@Transactional
	public boolean addpatient(RegisterRequest registerRequest) {
		Patient patient=new Patient();
		patient.setUsername(registerRequest.getUsername());
		patient.setPass(registerRequest.getPass());
		patient.setEmail(registerRequest.getEmail());
		patient.setCity(registerRequest.getCity());
		patientrepo.save(patient);
		return true;
	} 
}
