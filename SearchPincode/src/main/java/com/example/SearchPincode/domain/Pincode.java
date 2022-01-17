package com.example.SearchPincode.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pincode {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
    private int pincode;
	private String postoffice;
	
	
	public Pincode() {
		
	}
	
	
	public Pincode(int pincode, String postoffice) {
		super();
		this.pincode = pincode;
		this.postoffice = postoffice;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}


	@Override
	public String toString() {
		return "Pincode [pincode=" + pincode + ", postoffice=" + postoffice + "]";
	}
	
	
	
	
	
	
	
}