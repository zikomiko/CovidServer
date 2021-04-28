package com.covid.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.test.model.Address;

@Repository
public interface AdressRepository extends JpaRepository< Address, Long> {

}
