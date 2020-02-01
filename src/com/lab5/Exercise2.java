package com.lab5;

import java.util.Scanner;

public class Exercise2 {

	public static int nonRecursiveFibonacci(int n) {
		int fibonacciNumber = 1;
		int previousNumber = 1;
		int sum = 0;

		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			fibonacciNumber = 1;
		} else {
			for (int i = 3; i <= n; i++) {
				sum = fibonacciNumber + previousNumber;
				previousNumber = fibonacciNumber;
				fibonacciNumber = sum;

			}
		}

		return fibonacciNumber;
	}

	public static int recursiveFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		}

		return recursiveFibonacci(n - 2) + recursiveFibonacci(n - 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the nth value whose Fibonacci Sequence needed :  ");
		int number = scanner.nextInt();
		System.out.println("Choose : ");
		System.out.println("1. Recursive");
		System.out.println("2. Non Recursive");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println(recursiveFibonacci(number));
		} else {
			System.out.println(nonRecursiveFibonacci(number));
		}
		scanner.close();
	}
}
