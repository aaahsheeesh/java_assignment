package com.lab2.library;

import java.util.Scanner;

public class Journal extends WrittenItem {

	private int publishedYear;
	
	public Journal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPublishedYear() {
		return publishedYear;
	}

	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Published Year : "+ publishedYear);
	}

	@Override
	public void addItem(Scanner scanner) {
		 super.addItem(scanner);
		 System.out.println("Enter the Published Year");
		 setPublishedYear(scanner.nextInt());
	}

}
