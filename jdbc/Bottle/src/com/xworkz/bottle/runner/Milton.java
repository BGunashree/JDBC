package com.xworkz.bottle.runner;

public class Milton {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("this is Driver class");
		}
		catch(ClassNotFoundException e){
			
			e.printStackTrace();
			
		}

	}

}
