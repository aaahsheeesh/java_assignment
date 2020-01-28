package com.lab1;

import java.util.Scanner;

public class Exercise3 {

	public boolean checkNumber(int number) {
		
		int nextValue = 0;
		int previousValue = Integer.MAX_VALUE;
		
		while(number > 0) {
			nextValue = number % 10;
			number = number/10;
			if(nextValue > previousValue){
				return false;
			}
			previousValue = nextValue;
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		
		Exercise3 ex = new Exercise3();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int number = sc.nextInt();
		if(ex.checkNumber(number)) {
			System.out.print(number + " is increasing number");
		}else {
			System.out.print(number + " is not increasing number");
		}
		sc.close();
	}

}
