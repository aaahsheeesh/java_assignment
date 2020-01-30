package com.library;

import java.util.Scanner;

public class CD  extends MediaItem{

	private String artist;
	private String genre;
	
	public CD() {
		super();
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

	@Override
	public void addItem(Scanner scanner) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
