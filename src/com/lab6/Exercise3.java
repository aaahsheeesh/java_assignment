package com.lab6;

import java.util.Scanner;

public class Exercise3 {

	public static StringBuffer getImage(StringBuffer str) {
		return new StringBuffer(str).reverse();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string  : ");
		StringBuffer str = new StringBuffer();
		str.append(scanner.next());
		str.append("|" + getImage(str));
		System.out.println(str);
		scanner.close();

	}

}
