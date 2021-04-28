package com.covid.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.test.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
