package com.lab10;

import java.util.Scanner;


interface Power{
	int pow(int x,int y);
}
public class Exercise1 {

	public static void main(String[] args) {
		
		//Taking x & y as input 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any two numbers x & y ");
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		
		//Lambda Expression for x^y
		Power power = (x,y)->{
			return (int) Math.pow(x, y);
		};
		
		scanner.close();
		
		System.out.println(firstNumber+ "^"+secondNumber+" is "+power.pow(firstNumber, secondNumber));
		
	}
}
