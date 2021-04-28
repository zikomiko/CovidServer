package com.covid.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.covid.test.model.Covid;

@Repository
public interface CovidRepository extends JpaRepository<Covid, Long>{

}
