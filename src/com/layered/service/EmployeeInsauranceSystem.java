package com.layered.service;

public class EmployeeInsauranceSystem implements EmployeeService {

	private static EmployeeInsauranceSystem service;

	public EmployeeInsauranceSystem() {
		super();
	}

	public static EmployeeInsauranceSystem getInstance() {
		if (service == null) {
			service = new EmployeeInsauranceSystem();
		}
		return service;
	}

	@Override
	public String getInsauranceScheme(double salary) {
		if (salary > 5000 && salary < 20000) {
			return "Scheme C";
		} else if (salary >= 20000 && salary < 40000) {
			return "Scheme B";
		} else if (salary >= 40000) {
			return "Scheme A";
		}
		return "No Scheme";
	}

	@Override
	public String getDesignation(double salary) {
		if (salary > 5000 && salary < 20000) {
			return "System Associate";
		} else if (salary >= 20000 && salary < 40000) {
			return "Programmer";
		} else if (salary >= 40000) {
			return "Manager";
		}
		return "Clerk";
	}

}
