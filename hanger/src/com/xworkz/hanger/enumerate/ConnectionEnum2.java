package com.xworkz.hanger.enumerate;

public enum ConnectionEnum2 {
	
	URL("jdbc:mysql://localhost:3306/mall"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private ConnectionEnum2(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
