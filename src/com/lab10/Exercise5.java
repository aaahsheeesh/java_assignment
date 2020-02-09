package com.lab10;

import java.util.Scanner;

interface Factorial {
	int getFactorial(int number);
}

public class Exercise5 {

	// Method to calculate factorial
	public int factorial(int number) {
		int fact = 1;
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {

		// Taking input from user
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		// Using Method Reference 
		Exercise5 ex = new Exercise5();
		Factorial fact = ex::factorial;
		System.out.println("Factorial : " + fact.getFactorial(num));

		scanner.close();

	}

}
