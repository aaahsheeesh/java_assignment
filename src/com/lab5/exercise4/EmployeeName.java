package com.lab5.exercise4;

import java.util.Scanner;


public class EmployeeName {

	public static void checkFullName(String firstName, String lastName) throws FullNameException {

		if (firstName.isEmpty()) {
			throw new FullNameException("First name cannot be blank");
		} else if (lastName.isEmpty()) {
			throw new FullNameException("Last name cannot be blank");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your firstName : ");
		String firstName = scanner.nextLine();
		System.out.println("Enter your lastName : ");
		String lastName = scanner.nextLine();

		try {
			checkFullName(firstName, lastName);
			System.out.println("Name  : " + firstName + " " + lastName);
		} catch (FullNameException e) {
			System.out.println("FullNameException : " + e.getMessage());
		}
		scanner.close();
	}
}
