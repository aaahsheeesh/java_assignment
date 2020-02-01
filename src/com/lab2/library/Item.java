package com.lab2.library;

import java.util.Scanner;

public abstract class Item {

	private int uniqueId;
	private String title;
	private int numberOfCopies;

	
	public Item() {
		super();
	}
	
	public void checkIn() {
		this.numberOfCopies +=1;
	}
	
	public void checkOut() {
		this.numberOfCopies -=1;
	}
	
	public void addItem(Scanner scanner) {
		 System.out.println("Enter the item ID");
		 setUniqueId(scanner.nextInt());
		 System.out.println("Enter the item title");
		 setTitle(scanner.next());
		 numberOfCopies++;
	};
	
	public void print() {	
		System.out.println("Id :" + getUniqueId() );
		System.out.println("title :" + getTitle());
		System.out.println("No of Copies :" + getNumberOfCopies() );
	};

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

}
