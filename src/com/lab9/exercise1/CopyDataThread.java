package com.lab9.exercise1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyDataThread implements Runnable {

	private String sourceFileName;
	private String targetFileName;
	private static final String PATH = "D:\\capgemini\\Programs\\java_assignment\\src\\com\\lab9\\exercise1\\";

	public CopyDataThread(String sourceFileName, String targetFileName) {
		super();
		this.sourceFileName = sourceFileName;
		this.targetFileName = targetFileName;
	}

	@Override
	public void run() {

		try {
			FileInputStream readFile = new FileInputStream(PATH + sourceFileName);
			FileOutputStream writeFile = new FileOutputStream(PATH + targetFileName, true);
			int i;
			for (int j = 1; (i = readFile.read()) != -1; j++) {
				writeFile.write(i);
				if (j % 10 == 0) {
					Thread.sleep(5000);
					System.out.println("10 characters are copied");
				}
			}
			readFile.close();
			writeFile.close();
		} catch (IOException e) {
			System.err.println("Error : " + e);
		} catch (InterruptedException e) {
			System.err.println("Error : " + e);
		}
	}

}
