package com.lab9;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lab9.exercise1.CopyDataThread;

class Timer implements Runnable {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Current Time " + LocalTime.now()); // Printing Current time after every 10sec
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.err.println("Error : " + e.getMessage());
		}
	}

}

public class Exercise2 {

	public static void main(String[] args) {
		// Implementing multi threading using executor interface
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Timer task = new Timer();
		executor.execute(task);
	}
}
