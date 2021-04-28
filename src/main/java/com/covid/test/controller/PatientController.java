package com.covid.test.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.test.model.Patient;
import com.covid.test.repository.PatientRepository;
import com.covid.test.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	private PatientRepository patientRepository;
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/all")
	private List<Patient> getAllPatients(){
		return patientService.getAllPatients();
	}
	@GetMapping("/{id}")
	private Patient getPatient(@PathVariable Long id) {
		return patientService.getPatient(id);
	}
	
	@PostMapping
	private Patient createPatient(@RequestBody Patient patient) {
		return patientService.createPatient(patient);
	}
	
	@PutMapping
	private Patient updatePatient(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}
	
	@PutMapping("/{id}")
	private Patient deletePatient(@PathVariable Long id) {
		return patientService.deletePatient(id);
	}
	
	
	
	

	
	
}
