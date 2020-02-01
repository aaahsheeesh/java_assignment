package com.lab4.operator;

import java.util.Scanner;

public class SumOfCube {

	public static int sumOfCubes(int number) {
		char[] value = String.valueOf(number).toCharArray();
		double sum = 0;
		for (int i = 0; i < value.length; i++) {
			sum = sum + Math.pow(Integer.parseInt(String.valueOf(value[i])), 3);
		}

		return (int)sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("Sum of Cube of "+ number +" = "+sumOfCubes(number));
		scanner.close();
	}
}
