package com.library;

import java.util.Scanner;

public class Video extends MediaItem {

	private String director;
	private String genre;
	private int year;
	
	public Video() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Director :" + getDirector());
		System.out.println("Genre :" + getGenre());
		System.out.println("Year :" + getYear());

	}
	
	@Override
	public void addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.println("Enter the Director name");
		setDirector(scanner.next());
		System.out.println("Enter the Genre name");
		setGenre(scanner.next());
		System.out.println("Enter the Year");
		setYear(scanner.nextInt());
	}
	
	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}	
}
