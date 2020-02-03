package com.lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {

	public static String alterString(String str) {
		ArrayList<Character> vowels = new ArrayList<>();
		Collections.addAll(vowels, 'a', 'i', 'e', 'o', 'u', 'A', 'I', 'E', 'O', 'U');
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (!vowels.contains(ch[i])) {
				ch[i] = (char) (ch[i] + 1);
			}
		}

		return String.valueOf(ch);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = scanner.next();
		System.out.println("Altered String  : " + alterString(str));
		scanner.close();
	}
}
