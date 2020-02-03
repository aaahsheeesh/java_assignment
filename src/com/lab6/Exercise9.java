package com.lab6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Exercise9 {

	public static void diffInDate(Date inputDate, Date currentDate) {
		long diff = currentDate.getTime() - inputDate.getTime();
		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000);
		System.out.println("Time in seconds: " + diffSeconds + " seconds.");
		System.out.println("Time in minutes: " + diffMinutes + " minutes.");
		System.out.println("Time in hours: " + diffHours + " hours.");
	}

	public static void main(String[] args) {

		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
//		Scanner scanner = new Scanner(System.in);
//		Calendar calendar = Calendar.getInstance();
//		System.out.println("Enter the date in format (dd-MM-yyyy) : ");
//		String tempDate = scanner.nextLine();
		try {
			Date inputDate = format.parse("20-02-2020");
			Date currentDate = format.parse("25-02-2020");
			diffInDate(inputDate, currentDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		//scanner.close();
	}
}
