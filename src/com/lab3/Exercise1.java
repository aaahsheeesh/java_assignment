package com.lab3;

import java.util.Arrays;

public class Exercise1 {

	public static int getSecondSmallest(int[] arr) {
		if (arr.length > 1) {
			Arrays.sort(arr);
			return arr[1];
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 6, 2, 8, 1, 3 };
		int secondSmallest = Exercise1.getSecondSmallest(arr);
		if (secondSmallest != -1)
			System.out.println(secondSmallest);
		else
			System.out.println("Array must contain more than 1 element");
	}

}
