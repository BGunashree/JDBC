package com.xworkz.cover.repository;



import com.xworkz.cover.dto.CoverDTO;

public interface CoverRepo {
	
	boolean save(CoverDTO coverDTO);
	

	String getListById(int id);

	String getEMailAndPassword(long phoneNumber);

	String checkEmailPassword(String email, String password);

	String deleteByName(String name);

	String updateByEmail(String email);
	
}

