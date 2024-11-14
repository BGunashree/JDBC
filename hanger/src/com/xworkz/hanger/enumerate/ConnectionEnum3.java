package com.xworkz.hanger.enumerate;

public enum ConnectionEnum3 {
	
	URL("jdbc:mysql://localhost:3306/City"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private ConnectionEnum3(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}


}
