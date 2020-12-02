package com.booking.medical.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.booking.medical.entity.Patient;


public interface Patientrepo extends JpaRepository<Patient, Long> {

	@Query("select e from Patient e where e.username=:username and pass=:pass")
	List <Patient> findByUsernameAndPassword(@Param ("username")String username , @Param ("pass")String pass);



}
