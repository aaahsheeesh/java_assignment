package com.stream;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

	private List<Employee> employeeData = new ArrayList<>();
	private static EmployeeRepository repository;

	public EmployeeRepository() {
		super();
	}

	public static EmployeeRepository getInstance() {
		if (repository == null) {
			repository = new EmployeeRepository();
		}
		return repository;
	}

	public void setEmployeeData() {
		
		List<Department> departmentList = getDepartmentList();
		
		employeeData.add(new Employee(1,"Gautam","Mishra","gauti783@gmail.com","7042312283",
				LocalDate.of(2001,12,12),"Analyst",20000,15,departmentList.get(0)));
		employeeData.add(new Employee(2,"Akash","Kumar","akash@gmail.com","9958784577",
				LocalDate.of(2017, 5, 24),"Senior Analyst",40000,15,departmentList.get(5)));
		employeeData.add(new Employee(3,"Amit","Tripathi","amit@gmail.com","9958974906",
				LocalDate.of(2017, 1, 13),"Curator",30000,20,departmentList.get(4)));
		employeeData.add(new Employee(4,"Ritesh","Saxxena","ritesh@gmail.com","7042312283",
				LocalDate.of(2020, 1, 13),"Manager",50000,23,departmentList.get(2)));
		employeeData.add(new Employee(5,"Ashish","Mishra","ashish@gmail.com","7894561230",
				LocalDate.of(2014,2,24),"Analyst",20000,24,departmentList.get(0)));
		employeeData.add(new Employee(6,"Shailza","Rawat","shailza@gmail.com","7042312283",
				LocalDate.of(2017,9,21),"Analyst",20000,15,departmentList.get(5)));
		employeeData.add(new Employee(7,"Himanshi","Sandhu","himanshi@gmail.com","9958784577",
				LocalDate.of(2017, 5, 24),"Senior Analyst",40000,15,departmentList.get(5)));
		employeeData.add(new Employee(8,"Rajan","Singh","rajan@gmail.com","9958974906",
				LocalDate.of(2017, 1, 13),"Curator",30000,20,departmentList.get(4)));
		employeeData.add(new Employee(9,"Monika","Jha","ritesh@gmail.com","7042312283",
				LocalDate.of(2020, 1, 13),"Manager",50000,23,departmentList.get(1)));
		employeeData.add(new Employee(10,"Vardan","Mishra","vardan@gmail.com","7894561230",
				LocalDate.of(2000,12,31),"CEO",20000,24,departmentList.get(7)));
	}
	
	public List<Department> getDepartmentList(){
		List<Department> departmentList = new ArrayList<>();
		
		departmentList.add(new Department(1,"Developer",15));
		departmentList.add(new Department(2,"Financial",20));
		departmentList.add(new Department(3,"Consultancy",23));
		departmentList.add(new Department(4,"Marketing",16));
		departmentList.add(new Department(5,"Admin",31));
		departmentList.add(new Department(6,"HR",45));
		departmentList.add(new Department(7,"R&D",02));
		departmentList.add(new Department(8,"Learning",30));
		
		return departmentList;
	}

	public List<Employee> getEmployeeData() {
		return employeeData;
	}
	

	
}
