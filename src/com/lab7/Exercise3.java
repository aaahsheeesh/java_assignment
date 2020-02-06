package com.lab7;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {

	public static HashMap<Integer, Integer> getValues(int[] numbers) {

		HashMap<Integer, Integer> squareNumberMap = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			if (!squareNumberMap.containsKey(numbers[i]))
				squareNumberMap.put(numbers[i], (int) Math.pow(numbers[i], 2));
		}

		return squareNumberMap;
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
			HashMap<Integer, Integer> squareNumberMap = getValues(numbers);
			System.out.println(squareNumberMap);
		}else {
			System.out.println("Invalid array size ");
		}
		scanner.close();
	}
}
