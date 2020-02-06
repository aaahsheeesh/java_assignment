package com.lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise1 {

	public static ArrayList<String> getValue(HashMap<Integer, String> value) {
		ArrayList<String> nameList = new ArrayList<>();
		for (Entry<Integer, String> name : value.entrySet()) {
			nameList.add((String) name.getValue());
		}
		Collections.sort(nameList);
		return nameList;
	}

	public static void main(String[] args) {
		HashMap<Integer, String> nameMap = new HashMap<>();
		nameMap.put(1, "Gautam");
		nameMap.put(2, "Akash");
		nameMap.put(3, "Amit");
		nameMap.put(5, "Karan");
		System.out.println(getValue(nameMap));
	}
}
