package com.lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {

	public static int[] getSorted(int[] number) {

		for (int i = 0; i < number.length; i++) {
			StringBuilder str = new StringBuilder(Integer.toString(number[i]));
			number[i] = Integer.parseInt(str.reverse().toString());
		}

		Arrays.parallelSort(number);
		return number;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = scanner.nextInt();
		if (size > 0) {
			int[] numbers = new int[size];
			System.out.println("Enter the number in an array : ");
			for (int i = 0; i < size; i++) {
				numbers[i] = scanner.nextInt();
			}
			System.out.println("Number after sort : " + Arrays.toString(getSorted(numbers)));
		}else {
			System.out.println("Invalid array size ");
		}
		
		scanner.close();
	}
}
