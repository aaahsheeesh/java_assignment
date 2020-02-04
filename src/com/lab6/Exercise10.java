package com.lab6;

import java.util.Scanner;

public class Exercise10 {

	public static boolean validateUserName(String userName) {

		if (userName.isEmpty()) {
			System.out.println("Username cannot be blank");
			return false;
		} else if (!userName.contains("_job")) {
			System.out.println("Username must contain '_job' ");
			return false;
		} else {
			int index = userName.lastIndexOf('_');
			if (!(index + 3 == userName.length() - 1)) {
				System.out.println("Username doesnot contains '_job' at the end");
				return false;
			} else if (userName.substring(0, index).length() < 8) {
				System.out.println("Username length should be greater than 8 excluding '_job'");
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your user name : ");
		String userName = scanner.nextLine();
		if (validateUserName(userName)) {
			System.out.println("Username validated");
		}
		scanner.close();

	}
}
