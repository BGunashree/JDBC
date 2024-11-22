package com.xworkz.cover.dto;

public class CoverDTO {
	private int id;
	private String name;
	private String email;
	private String password;
	private String address;
	private long phoneNumber;
	private String industryType;

	public CoverDTO(int id, String name, String email, String password, String address, long phoneNumber,
			String industryType) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.industryType = industryType;
	}

	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", address="
				+ address + ", phoneNumber=" + phoneNumber + ", industryType=" + industryType + "]";
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIndustryType() {
		return industryType;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}
}
