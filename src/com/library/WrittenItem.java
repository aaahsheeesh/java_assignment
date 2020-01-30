package com.library;

import java.util.Scanner;

public abstract class WrittenItem extends Item {

	private String author;

	
	public WrittenItem() {
		super();
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Author :" + author);
	}
	
	@Override
	public void addItem(Scanner scanner) {
		super.addItem(scanner);
		 System.out.println("Enter the author name");
		 setAuthor(scanner.next());
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
