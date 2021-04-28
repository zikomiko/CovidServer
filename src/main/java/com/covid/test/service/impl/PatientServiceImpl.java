package com.covid.test.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.test.model.Address;
import com.covid.test.model.Patient;
import com.covid.test.repository.AdressRepository;
import com.covid.test.repository.PatientRepository;
import com.covid.test.service.PatientService;

@Service
@Transactional
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private AdressRepository adressRepository;
	
	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatient(long id) {
		Optional<Patient> patient = patientRepository.findById(id);
		return patient.get();
	}

	@Override
	public Patient updatePatient(Patient patient) {
		Address address = adressRepository.findById(patient.getAddress().getId()).get();
		address.setAdress(patient.getAddress().getAdress());
		address.setCity(patient.getAddress().getCity());
		address.setCoutry(patient.getAddress().getCoutry());
		address.setZip(patient.getAddress().getZip());
		//adressRepository.save(address);

		return patientRepository.save(patient);
	}
	
	@Override
	public Patient createPatient(Patient patient) {
		Address address = new Address();
		address.setAdress(patient.getAddress().getAdress());
		address.setCity(patient.getAddress().getCity());
		address.setCoutry(patient.getAddress().getCoutry());
		address.setZip(patient.getAddress().getZip());
		adressRepository.save(address);
		patient.setAddress(address);
		patient.setActive(true);
		return patientRepository.save(patient);
	}

	@Override
	public Patient deletePatient(Long id) {
		Patient patient = patientRepository.findById(id).get();
		patient.setActive(false);
		return patient;
	}
	
}
