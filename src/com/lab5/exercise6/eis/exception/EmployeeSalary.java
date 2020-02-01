package com.lab5.exercise6.eis.exception;

import java.util.Scanner;

public class EmployeeSalary {

	public static void checkSalary(int salary) throws SalaryException {

		if (salary < 3000) {
			throw new SalaryException("salary too low");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your salary : ");
		int salary = scanner.nextInt();
		try {
			checkSalary(salary);
			System.out.println("Your is salary is good to go");
		} catch (SalaryException e) {
			System.out.println("SalaryException : " + e.getMessage());
		}
		scanner.close();
	}
}
