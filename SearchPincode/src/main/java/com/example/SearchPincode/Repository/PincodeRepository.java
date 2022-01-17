package com.example.SearchPincode.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SearchPincode.domain.Pincode;


public interface PincodeRepository extends JpaRepository<Pincode, Long> {
	
	

}
