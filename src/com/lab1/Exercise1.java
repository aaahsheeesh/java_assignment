package com.lab1;

import java.util.Scanner;

public class Exercise1 {

	private int sum = 0;
	
	public int calculateSum(int n) {
		
		for(int i = 3; i<=n; i++) {
			if(i%3 == 0 || i%5 == 0) {
				sum = sum+i;
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Exercise1 ex = new Exercise1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Sum = "+ ex.calculateSum(n));
		sc.close();
	}

}
