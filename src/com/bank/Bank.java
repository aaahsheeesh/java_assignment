package com.bank;

public class Bank {

	private double balance = 0;
	private static final int MINIMUM_BALANCE = 2000;
	private String bankName ;
	private int counter = 3;
	
	public double getBalance() {
		return balance;
	}
	
	public String getBankName() {
		return bankName;
	}
	
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public void withdrawAmount(int amount) {

		if (balance - amount > MINIMUM_BALANCE) {
			if (counter > 0) {
				balance = balance - amount;
			} else {

				balance = balance - amount - (amount * 0.025);
			}
		}else {
			System.out.println("Insufficient Balance");
		}

		counter -= 1;
	}

	public void addAmount(int amount) {
		if (counter > 0) {
			balance = balance + amount;
		} else {
			balance = balance + amount + (amount * 0.015);
		}

		counter -= 1;
	}

}
