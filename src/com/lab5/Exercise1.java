package com.lab5;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the traffic light");
		System.out.println("1.Red");
		System.out.println("2.Yellow");
		System.out.println("3.Green");
		System.out.println("Enter : ");
		int choice = scanner.nextInt();
		if(choice == 1) {
			System.out.println("Stop");
		}else if(choice == 2) {
			System.out.println("Wait");
		}else {
			System.out.println("Ready");
		}
		
		scanner.close();
	}
}
