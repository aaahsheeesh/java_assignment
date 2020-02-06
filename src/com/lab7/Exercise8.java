package com.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Exercise8 {

	public static int[] modifyArray(int[] numbers) {
		TreeSet<Integer> numberTreeSet = new TreeSet<>();
		for (int i : numbers) {
			numberTreeSet.add(i);
		}
		
		int[] noDupSortedArray = new int[numberTreeSet.size()];

		Iterator<Integer> integer = numberTreeSet.descendingIterator();
		for (int i = 0; integer.hasNext(); i++) {
			noDupSortedArray[i] = integer.next();
		}

		return noDupSortedArray;
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
			System.out.println("Number after sort : " + Arrays.toString(modifyArray(numbers)));
		} else {
			System.out.println("Invalid array size ");
		}

		scanner.close();
	}
}
