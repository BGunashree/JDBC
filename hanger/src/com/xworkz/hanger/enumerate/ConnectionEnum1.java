package com.xworkz.hanger.enumerate;

public enum ConnectionEnum1 {

	URL("jdbc:mysql://localhost:3306/hospital_details"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private ConnectionEnum1(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}
}
