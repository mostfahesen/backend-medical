package com.booking.medical.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.medical.request.DoctorRequest;
import com.booking.medical.service.DoctorService;

@RestController
@RequestMapping(path = "/doctor")
public class DoctorController {

	@Autowired 
	DoctorService doctorService;
	
	@PostMapping(path = "v2.0/adddoctor")
	public boolean  adddoctor(@RequestBody DoctorRequest doctorRequest) {
		
		boolean check= doctorService.adddoctor(doctorRequest);
		if(check) {
			return true;
		}else {
			return false;
		}
		
	}
}
