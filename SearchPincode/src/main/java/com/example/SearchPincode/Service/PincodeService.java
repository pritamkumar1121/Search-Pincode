package com.example.SearchPincode.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SearchPincode.Repository.PincodeRepository;
import com.example.SearchPincode.domain.Pincode;

@Service
public class PincodeService {
	
	@Autowired
	private PincodeRepository repo;
	
	public List<Pincode> listAll(){
		return repo.findAll();
	}
	
	public Pincode get(long pcode) {
		return (Pincode) repo.findById(pcode).get();
	}

}
