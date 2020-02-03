package com.lab6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("D:\\capgemini\\Programs\\java_assignment\\src\\com\\lab6\\Test.txt");
			Scanner scanner = new Scanner(file);
			int i = 0;
			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(i + " : " + data);
				i++;
			}
			file.close();
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error : " + e.getLocalizedMessage());
		} catch (IOException e) {
			System.out.println("Error : " + e.getLocalizedMessage());
		}
	}
}
