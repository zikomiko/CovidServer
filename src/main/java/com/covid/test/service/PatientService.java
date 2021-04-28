package com.covid.test.service;

import java.util.List;

import com.covid.test.model.Patient;

public interface PatientService {
	
	public List<Patient> getAllPatients();
	
	public Patient getPatient(long id);
	
	public Patient updatePatient(Patient patient);
	
	public Patient createPatient(Patient patient);
	
	public Patient deletePatient(Long id);
	
	
}
