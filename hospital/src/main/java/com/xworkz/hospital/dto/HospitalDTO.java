package com.xworkz.hospital.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="hospital_table")
public class HospitalDTO {

	@Id
	private int id;
	private String name;
	private String address;
	private long contact;
	private String email;
	private int branches;
	private int noOfDoctors;
	private int noOfNurse;
	private String founder;
	private int establishedYear;
	public HospitalDTO(int id, String name, String address, long contact, String email, int branches, int noOfDoctors,
			int noOfNurse, String founder, int establishedYear) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.email = email;
		this.branches = branches;
		this.noOfDoctors = noOfDoctors;
		this.noOfNurse = noOfNurse;
		this.founder = founder;
		this.establishedYear = establishedYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBranches() {
		return branches;
	}
	public void setBranches(int branches) {
		this.branches = branches;
	}
	public int getNoOfDoctors() {
		return noOfDoctors;
	}
	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}
	public int getNoOfNurse() {
		return noOfNurse;
	}
	public void setNoOfNurse(int noOfNurse) {
		this.noOfNurse = noOfNurse;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public int getEstablishedYear() {
		return establishedYear;
	}
	public void setEstablishedYear(int establishedYear) {
		this.establishedYear = establishedYear;
	}
	
	
}
