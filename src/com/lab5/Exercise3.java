package com.lab5;

import java.util.Scanner;

public class Exercise3 {

	public static void printPrime(int n) {
		int counter;
		if (n < 0) {
			System.out.println("Enter a valid number");
		} else if (n == 0 || n == 1) {
			System.out.println("No prime number found");
		} else {
			System.out.println("Prime numbers are :");
			for (int i = 2; i <= n; i++) {
				counter = 0;
				for (int j = 2; j < Math.sqrt(i); j++) {
					if (i % j == 0) {
						counter++;
					}
				}

				if (counter == 0) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nth value till you want Prime number :  ");
		int number = scanner.nextInt();
		printPrime(number);
		scanner.close();

	}

}
