package com.bank;

public class RBI {
	
	private static int MINIMUM_BALANCE = 2000;
	private double balance;
	private double interestRate;
	private  double taxRate; 
	private int counter = 3;
	
	
	
	public RBI(double interestRate, double taxRate) {
		super();
		this.interestRate = interestRate;
		this.taxRate = taxRate;
	}

	public void withdrawAmount(double amount) {

		if (balance - amount > MINIMUM_BALANCE) {
			if (counter > 0) {
				balance = balance - amount;
			} else {

				balance = balance - amount - (amount * taxRate);
			}
		}else {
			System.out.println("Insufficient Balance");
		}

		counter -= 1;
	}
	
	public void addAmount(double amount) {
		if (counter > 0) {
			balance = balance + amount;
		} else {
			balance = balance + amount + (amount * interestRate);
		}

		counter -= 1;
	}

	public double getBalance() {
		return balance;
	}

	
}
