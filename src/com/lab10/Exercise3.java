package com.lab10;

import java.util.Scanner;

interface Auth {
	boolean checkAuth(String userName, String password);
}

public class Exercise3 {

	public static final String USERNAME = "gauti";
	public static final String PASS = "gauti";
	public static void main(String[] args) {
		
		//Taking user name and password from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String username = scanner.nextLine();
		System.out.println("Enter the password");
		String pass = scanner.nextLine();
		
		Auth auth = (userName,password)->{
			if(userName.equals(USERNAME) && password.equals(PASS)) {
				return true;
			}else {
				return false;
			}
		};
		
		if(auth.checkAuth(username, pass)) {
			System.out.println("Authenticated");
		}else {
			System.out.println("Wrong credentials");
		}
		scanner.close();
	}
}
