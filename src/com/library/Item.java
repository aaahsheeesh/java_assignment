package com.library;

import java.util.Scanner;

public abstract class Item {

	private int uniqueId;
	private String name;
	private int numberOfCopies;

	
	public Item() {
		super();
	}
	
	public void addItem(Scanner scanner) {
		 System.out.println("Enter the book ID");
		 setUniqueId(scanner.nextInt());
		 System.out.println("Enter the book name");
		 setName(scanner.next());
		 System.out.println("Enter the No of Copies");
		 setNumberOfCopies(scanner.nextInt());
	};
	
	public void print() {	
		System.out.println("Id :" + uniqueId );
		System.out.println("Name :" + name);
		System.out.println("No of Copies :" + numberOfCopies );
	};

	public int getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		this.uniqueId = uniqueId;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

}
