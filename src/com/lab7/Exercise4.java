package com.lab7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise4 {

	public static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> studentMarksMap) {
		HashMap<Integer, String> studentMedalMap = new HashMap<>();

		for (Entry<Integer, Integer> studentMark : studentMarksMap.entrySet()) {
			String medal = null;
			if (studentMark.getValue() > 90) {
				medal = "Gold";
			} else if (studentMark.getValue() >= 80 && studentMark.getValue() < 90) {
				medal = "Silver";
			} else if (studentMark.getValue() >= 70 && studentMark.getValue() < 80) {
				medal = "Bronze";
			}

			if (medal != null) {
				studentMedalMap.put(studentMark.getKey(), medal);
			}
		}
		return studentMedalMap;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> studentMarksMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i!=0) {
			System.out.println("Enter your registration number : ");
			int registrationNumber = scanner.nextInt();
			System.out.println("Enter your marks : ");
			int marks = scanner.nextInt();
			studentMarksMap.put(registrationNumber, marks);
			System.out.println("Do you want to add more press 1 / 0 Exit : ");
			i = scanner.nextInt();
		}

		HashMap<Integer, String> studentMedalMap = getStudents(studentMarksMap);
		System.out.println(studentMedalMap);
		scanner.close();
	}
}
