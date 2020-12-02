package com.booking.medical.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.medical.entity.Doctor;

@Repository
public interface Doctorepo extends JpaRepository<Doctor, Long> {

}
