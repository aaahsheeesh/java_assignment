package com.lab6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exercise6 {
	public static void main(String args[]) {
		try {
			int lines = 0;
			int chars = 0;
			int words = 0;

			FileInputStream readFile = new FileInputStream(
					"D:\\capgemini\\Programs\\java_assignment\\src\\com\\lab6\\Test.txt");
			int i;
			while ((i = readFile.read()) != -1) {
				char data = (char) i;
				if (data == '\n') {
					lines++;
				}
				if (data == ' ') {
					words++;
				}
				chars++;
			}
			readFile.close();
			System.out.println("No.of characters = " + chars);
			System.out.println("No.of words = " + (words + 1));
			System.out.println("No.of lines = " + (lines + 1));
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the specified file...");
		} catch (IOException i) {
			System.out.println("Cannot read file...");
		}
	}

}
