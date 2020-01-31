package com.lab3;

import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise4 {

	public static void countChar(char[] ch) {
		HashMap<Character,Integer> mapKey = new HashMap<>();
		for(int i = 0 ; i<ch.length;i++) {
			mapKey.put(ch[i], mapKey.getOrDefault(ch[i],0)+1);
		}
		
		for(Entry mapEntry : mapKey.entrySet()) {
			System.out.println(mapEntry.getKey() + " "+mapEntry.getValue());
		}
	}
	public static void main(String[] args) {
		char[] ch = {'A','b','A','b','a','b'};
		countChar(ch);
	}
}
