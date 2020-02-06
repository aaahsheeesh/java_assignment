package com.lab7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise6 {

	public static int calAge(String date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date inputDate = new Date();
		Date currentDate = new Date();
		try {
			inputDate = sdf.parse(date);
		} catch (ParseException e) {
			System.out.println("Error : " + e.getMessage());
		}
		return Math.abs(inputDate.getYear() - currentDate.getYear());
	}

	public static ArrayList<Integer> voterList(HashMap<Integer, String> voterDetailsMap) {
		ArrayList<Integer> voterList = new ArrayList<>();
		for (Entry<Integer, String> voter : voterDetailsMap.entrySet()) {
			int age = calAge(voter.getValue());
			if (age >= 18 && age < 100) {
				voterList.add(voter.getKey());
			}
		}
		return voterList;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> voteDetailsMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i != 0) {
			System.out.println("Enter your Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter your dob in format dd-MM-yyyy : ");
			String dob = scanner.next();
			voteDetailsMap.put(id, dob);
			System.out.println("Do you want to add more press 1 / 0 Exit : ");
			i = scanner.nextInt();
		}

		ArrayList<Integer> voterList =  voterList(voteDetailsMap);
		if(!voterList.isEmpty()) {
			System.out.println("Voter List Id : " + voterList);
		}
		else {
			System.out.println("No one is eligible for voting");
		}
		scanner.close();
	}
}
