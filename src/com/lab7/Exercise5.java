package com.lab7;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {

	public static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = scanner.nextInt();
		if (size > 1) {
			int[] numbers = new int[size];
			System.out.println("Enter the number in an array : ");
			for (int i = 0; i < size; i++) {
				numbers[i] = scanner.nextInt();
			}

			System.out.println("Second smallest element is " + getSecondSmallest(numbers));
		} else {
			System.out.println("Invalid array size");
		}
		
		scanner.close();
	}
}
