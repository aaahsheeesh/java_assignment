package com.lab5.exercise5;

import java.util.Scanner;

public class Age {

	public static void checkAge(int age) throws AgeException {

		if (age < 1) {
			throw new AgeException("not a valid age ");

		} else if (age < 15) {
			throw new AgeException("age is less than 15");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		try {
			checkAge(age);
			System.out.println("Your is valid to go");
		} catch (AgeException e) {
			System.out.println("AgeException : " + e.getMessage());
		}
		scanner.close();
	}
}
