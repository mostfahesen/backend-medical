package com.booking.medical.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.medical.request.LoginRequest;
import com.booking.medical.request.RegisterRequest;
import com.booking.medical.response.LoginResponse;
import com.booking.medical.service.PateintService;


@RestController
@RequestMapping(path = "/patient")
public class PatientController {

	@Autowired
	PateintService pateintService;
	
	@PostMapping(path = "v1.0/regsit")
	public boolean  addpatient(@RequestBody RegisterRequest registerRequest) {
		System.out.println("helllllllllllllllllo");

		boolean check = pateintService.addpatient(registerRequest);
		if (check) {
			return true;
		} else {
			return false;
		}	

	}
	
	@GetMapping(path = "v1.0/login")
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		LoginResponse res = new LoginResponse();
		boolean login = pateintService.getallpatient(loginRequest);
		if (login) {
			res.setValid(true);
		} else {
			res.setValid(false);
		}
		return res;

	}
}
