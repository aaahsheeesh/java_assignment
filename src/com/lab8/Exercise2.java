package com.lab8;

import java.time.LocalTime;

class Timer implements Runnable {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Current Time " + LocalTime.now()); //Printing Current time after every 10sec
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.err.println("Error : " + e.getMessage());
		}
	}

}

public class Exercise2 {

	public static void main(String[] args) {
		new Thread(new Timer()).start();
	}
}
