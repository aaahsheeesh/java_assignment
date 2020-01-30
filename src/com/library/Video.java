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

	@Override
	public void addItem(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
