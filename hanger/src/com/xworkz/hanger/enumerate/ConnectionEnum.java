package com.xworkz.hanger.enumerate;

public enum ConnectionEnum {
	
	URL("jdbc:mysql://localhost:3306/washing_machine"),USERNAME("root"),PASSWORD("Xworkzodc@123");
	private final String value;
	private ConnectionEnum(String value)
	{
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
