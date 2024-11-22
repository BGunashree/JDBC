package com.xworkz.cover.service;



import com.xworkz.cover.dto.CoverDTO;

public interface CoverService {

	boolean validate(CoverDTO coverDTO);
	String getListById(int id);

	String getEMailAndPassword(long phoneNumber);

	String checkEmailPassword(String email, String password);

	String deleteByName(String name);

	String updateByEmail(String email);
	
	
}
