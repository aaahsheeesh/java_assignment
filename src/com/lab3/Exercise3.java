package com.lab3;

import java.util.Arrays;

public class Exercise3 {

	public static int[] getSorted(int[] number) {

		for (int i = 0; i < number.length; i++) {

			String str = Integer.toString(number[i]);
			StringBuilder s = new StringBuilder(str);
			str = s.reverse().toString();
			number[i] = Integer.parseInt(str);
		}

		return number;
	}

	public static void main(String[] args) {
		int[] number = { 25, 456, 258, 7808};
		System.out.println(Arrays.toString(getSorted(number)));
	}

}
