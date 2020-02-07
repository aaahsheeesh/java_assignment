package com.lab8.exercise1;

public class FileProgram {

	public static void main(String[] args) {
		CopyDataThread copyThread = new CopyDataThread("source.txt","target.txt");
		copyThread.start();
	}
}
