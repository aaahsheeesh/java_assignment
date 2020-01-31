package com.lab3;

import java.util.Arrays;

public class Exercise2 {

	public static String sortString(String str) {
		
		char ch[] = str.toCharArray();
		int size = ch.length;
		Arrays.parallelSort(ch);
		str = String.valueOf(ch);
		
		String subStringPartOne, subStringPartTwo;
		if (size % 2 == 0) {
			subStringPartOne = str.substring(0, size / 2).toUpperCase();
			subStringPartTwo = str.substring(size / 2, size).toLowerCase();

		} else {

			subStringPartOne = str.substring(0, size / 2 + 1).toUpperCase();
			subStringPartTwo = str.substring(size / 2 + 1, size).toLowerCase();
		}

		return subStringPartOne + subStringPartTwo;
	}

	public static void main(String[] args) {

		String str = "qwert";
		System.out.println(sortString(str));
	}

}
