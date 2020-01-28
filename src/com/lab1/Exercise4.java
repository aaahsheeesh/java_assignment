package com.lab1;

import java.util.Scanner;

public class Exercise4 {

	public boolean checkNumber(int number) {
		
		while(number > 1) {
			if(number%2 != 0) {
				return false;
			}
			number = number/2;
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		Exercise4 ex = new Exercise4();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		if(ex.checkNumber(number)) {
			System.out.print(number + " is power of 2");
		}else {
			System.out.print(number + " is not power of 2");
		}
		sc.close();
	}

}
