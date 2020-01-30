package com.library;

import java.util.Scanner;

public class Main {
		

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Item item = null;
		System.out.println("Welcome to Library Management System");
		System.out.println("1. Book");
		System.out.println("2. Journal");
		System.out.println("3. CD");
		System.out.println("4. Video");
		System.out.println("Enter : ");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: 
			item = new Book();
			item.addItem(scanner);
			item.print();
			break;
		case 2:
			item = new Journal();
			item.addItem(scanner);
			item.print();
			break;
		case 3:
			item = new CD();
			break;
		case 4:
			item = new Video();
			break;
		}
	
		scanner.close();

	}

}
