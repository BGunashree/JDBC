package com.xworkz.coconut.dto;

public class CoconutDTO {
	
	String name;
	String email;
	int age;
	String phone;
	String address;
	String gender;
	public CoconutDTO(String name, String email, int age, String phone, String address, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.phone = phone;
		this.address = address;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	


}
