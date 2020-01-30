package com.library;

import java.util.Scanner;

public class CD  extends MediaItem{

	private String artist;
	private String genre;
	
	public CD() {
		super();
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Director :" + getArtist());
		System.out.println("Genre :" + getGenre());
	}

	@Override
	public void addItem(Scanner scanner) {
		super.addItem(scanner);
		System.out.println("Enter the Artist name");
		setArtist(scanner.next());
		System.out.println("Enter the Genre name");
		setGenre(scanner.next());
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
}
