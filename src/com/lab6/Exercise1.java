package com.lab6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the line of integer :");
		String input = scanner.nextLine();
		StringTokenizer str = new StringTokenizer(input, " ");
		int sum = 0;
		while (str.hasMoreTokens()) {
			sum = sum + Integer.parseInt(str.nextToken());
		}
		System.out.print("Sum : "+ sum);
		scanner.close();
	}
}
