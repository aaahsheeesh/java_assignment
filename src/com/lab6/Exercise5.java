package com.lab6;

import java.util.Scanner;

public class Exercise5 {

	public static int modifyNumber(String str) {
		StringBuffer stringBuffer = new StringBuffer();
		char[] ch = str.toCharArray();
		int size = ch.length - 1;
		for (int i = 0; i < size; i++) {
			stringBuffer.append(Math.abs((ch[i] - ch[i + 1])));
		}
		stringBuffer.append(ch[size]);
		
		return Integer.parseInt(stringBuffer.toString());
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = scanner.nextInt();
		System.out.println("Modified Number  : " + modifyNumber(String.valueOf(number)));
		scanner.close();
	}
}
