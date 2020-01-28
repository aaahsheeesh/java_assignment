	package com.lab1;

import java.util.Scanner;

public class Exercise2 {

	private int sumSquare = 0;
	private int squareSum = 0;
	
	public int calculateDifference(int n) {
		
		for(int i = 1; i<=n; i++ ) {
			
			sumSquare = sumSquare + i; 
			squareSum =(int) (squareSum + Math.pow(i, 2));
		}
		
		sumSquare = (int)Math.pow(sumSquare, 2);
		
		return (sumSquare - squareSum);
	}
	public static void main(String[] args) {
		
		Exercise2 ex = new Exercise2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		sc.close();
		System.out.print("Difference = " + ex.calculateDifference(n));
		
	}

}
