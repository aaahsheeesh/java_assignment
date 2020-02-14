package com.layered.pl;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import com.layered.bean.Employee;
import com.layered.service.EmployeeInsauranceSystem;

public class Executor {
	private EmployeeInsauranceSystem instance;
	private static HashMap<Integer, Employee> employeeData = new HashMap<Integer, Employee>();

	public Executor() {
		instance = EmployeeInsauranceSystem.getInstance();
	}

	public long uuid() {
		return Long.parseLong(String.format("%s%s%s%s%s%s%s%s", new Random().nextInt(9), new Random().nextInt(9),
				new Random().nextInt(9), new Random().nextInt(9), new Random().nextInt(9), new Random().nextInt(9),
				new Random().nextInt(9), new Random().nextInt(9)));
	}

	public void addEmployee(String name, double salary) {
		int uid = (int) uuid();
		Employee emp = new Employee(uid, name, salary, instance.getDesignation(salary),
				instance.getInsauranceScheme(salary));
		employeeData.put(uid, emp);
	}

	public void displayUsers() {
		if (employeeData != null && !employeeData.isEmpty()) {
			employeeData.forEach((key, employee) -> {
				System.out.println(employee.toString());
			});
		}else {
			System.out.println("No Employee Added");
		}
	}

	public void run(Scanner scanner) {
		int i = 0;
		while (i != 4) {
			System.out.println("Insurance menu\n1)Add Employee\n2)Get Insurance Scheme\n3)Display Users\n4)Exit");
				i = scanner.nextInt();
				String name;
				String designation;
				double salary;
				switch (i) {
				case 1:
					System.out.println("Enter Name");
					name = scanner.next();
					System.out.println("Enter Salary");
					salary = scanner.nextDouble();
					addEmployee(name, salary);
					System.out.println("Employee Added");
					break;
				case 2:
					System.out.println("Enter Salary");
					salary = scanner.nextDouble();
					System.out.println("Insurance Scheme : "+instance.getInsauranceScheme(salary) + " Designation : " + 
							instance.getDesignation(salary));
					break;
				case 3:
					System.out.println("all users details:\n");
					displayUsers();
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.println("invalid option");
					break;

				}
		}
		
	}
	
}
