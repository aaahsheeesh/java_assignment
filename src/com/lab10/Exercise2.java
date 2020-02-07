package com.lab10;

import java.util.Scanner;

interface CharacterSpace {
	String spaceAfterCharacter(String str);
}

public class Exercise2 {

	public static void main(String[] args) {

		//Taking input string
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString = scanner.next();
		
		//Lambda expression to add space after every character
		CharacterSpace cs = (str)->{
			StringBuffer strBuffer = new StringBuffer();
			for(char ch : str.toCharArray()) {
				strBuffer.append(ch+" ");
			}
			return strBuffer.toString();
		};
		
		System.out.println(inputString + " after manipulation "+ cs.spaceAfterCharacter(inputString));
		scanner.close();
	}
}
