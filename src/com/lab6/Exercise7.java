package com.lab6;

import java.io.File;
import java.util.Scanner;

public class Exercise7 {

	public static String getFileExtension(File file) {
		String fileName = file.getName();
		if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
			return fileName.substring(fileName.lastIndexOf(".") + 1);
		else
			return "";
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file name : ");
		String fileName = scanner.nextLine();
		String path = "D:\\capgemini\\Programs\\java_assignment\\src\\com\\lab6\\" + fileName;
		File file = new File(path);

		if (file.exists()) {
			if (file.canRead() && file.canWrite()) {
				System.out.println("File exists");
				System.out.println("File is readable and writable");
			} else if (file.canRead()) {
				System.out.println("File is only readable");
			} else if (file.canWrite()) {
				System.out.println("File is only writable");
			}
			System.out.println("File length : " + file.length());
			System.out.println("File type : "+ getFileExtension(file) );
		} else {
			System.out.println("File doesnot exits");
		}
		scanner.close();
	}
}
