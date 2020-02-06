package com.lab7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise2 {

	public static void countChar(char[] ch) {
		HashMap<Character, Integer> mapKey = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			mapKey.put(ch[i], mapKey.getOrDefault(ch[i], 0) + 1);
		}

		for (Entry<Character, Integer> mapEntry : mapKey.entrySet()) {
			System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the characters without space: ");
		String str = scanner.next();
		char ch[] = str.trim().toCharArray();
		countChar(ch);
		scanner.close();
	}
}
