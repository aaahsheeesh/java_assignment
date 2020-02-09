package com.lab9.exercise1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		
		//Implementing multi threading using executor interface
		ExecutorService executor = Executors.newSingleThreadExecutor();
		CopyDataThread task = new CopyDataThread("source.txt","target.txt");
		executor.execute(task);
	}
}
