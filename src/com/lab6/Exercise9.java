package com.lab6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise9 {

	public static void diffInDate(Date inputDate, Date currentDate) {
		int year = Math.abs(inputDate.getYear() - currentDate.getYear());
		int month = Math.abs(inputDate.getMonth() - currentDate.getMonth());
		int days = Math.abs(inputDate.getDate() - currentDate.getDate());

		System.out.println(
				"Difference between input and current date is Year " + year + " Month " + month + " Days " + days);

	}

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the date in format (dd-MM-yyyy) : ");
		String tempDate = scanner.nextLine();
		try {
			Date inputDate = format.parse(tempDate);
			System.out.println("Inputed Date : " + inputDate);
			Date currentDate = new Date();
			System.out.println("Current Date : " + currentDate);
			diffInDate(inputDate, currentDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		scanner.close();
	}
}
