package com.lab6;

import java.util.Scanner;

public class Exercise8 {

	public static boolean checkPostiveString(String str) {
		str = str.toLowerCase();
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.nextLine();
		if (checkPostiveString(str)) {
			System.out.println(str + " is a positive string");
		} else {
			System.out.println(str + " is not a positive string");
		}
		scanner.close();

	}
}
