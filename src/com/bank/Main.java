package com.bank;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		RBI rbi = new ICICI();
		
		System.out.println("Welcome I&G Banking System");
		System.out.println("Please choose your bank");
		System.out.println("1.ICICI");
		System.out.println("2.SBI");
		System.out.println("3.Axis");
		System.out.println("4.HDFC \n");
		System.out.print("Enter : ");
		
		int selectedValue = scanner.nextInt();
		
		switch(selectedValue) {
			case 1: 
			break;
//			case 2: bank.setBankName("SBI");
//			break;
//			case 3: bank.setBankName("Axis");
//			break;
//			case 4: bank.setBankName("HDFC");
//			break;
		}
		
//		System.out.println("Thank you for choosing " + bank.getBankName());
//		
//		System.out.println("Welcome to "+ bank.getBankName() +" dashboard");
		
		selectedValue = 0;
	    int amount;

		while(selectedValue != 4) {
			System.out.println("1.CheckBalance");
			System.out.println("2.Add");
			System.out.println("3.Withdraw ");
			System.out.println("4.Exit\n");
			System.out.print("Enter : ");
			
			selectedValue = scanner.nextInt();
			
			
			switch(selectedValue) {
				case 1:
					//System.out.println("Your current balance is " + bank.getBalance());
					break;
					
				case 2: 
					System.out.println("Enter the amount to add : ");
					amount =  scanner.nextInt();
					rbi.addAmount(amount);
					System.out.println("Your current balance is "+rbi.getBalance());
					break;
					
				case 3: 
					System.out.println("Enter the amount to withdraw");
					amount =  scanner.nextInt();
					rbi.withdrawAmount(amount);
					System.out.println("Your current balance is " + rbi.getBalance());
					break;
					
				case 4:
					System.out.println("Thank you for using our bank");
					System.exit(0);
			}		

		}
		
		scanner.close();
		
	}

}
