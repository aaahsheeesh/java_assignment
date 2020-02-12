package com.lab11.stream;

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
		
		employeeData.add(new Employee(1,"Gautam","Mishra","gauti783@gmail.com","7042312283",
				LocalDate.of(2001,12,12),"Analyst",20000,15,new Department(1,"Developer",15)));
		employeeData.add(new Employee(2,"Akash","Kumar","akash@gmail.com","9958784577",
				LocalDate.of(2017, 5, 24),"Senior Analyst",40000,15,new Department(1,"Developer",15)));
		employeeData.add(new Employee(3,"Amit","Tripathi","amit@gmail.com","9958974906",
				LocalDate.of(2017, 1, 13),"Curator",30000,20,new Department(2,"Graphics",20)));
		employeeData.add(new Employee(4,"Ritesh","Saxxena","ritesh@gmail.com","7042312283",
				LocalDate.of(2020, 1, 13),"Manager",50000,23,new Department(1,"Graphics",23)));
		employeeData.add(new Employee(5,"Ashish","Mishra","ashish@gmail.com","7894561230",
				LocalDate.of(2014,2,24),"Analyst",20000,24,new Department(3,"HR",24)));
		employeeData.add(new Employee(6,"Shailza","Rawat","shailza@gmail.com","7042312283",
				LocalDate.of(2017,9,21),"Analyst",20000,15,null));
		employeeData.add(new Employee(7,"Himanshi","Sandhu","himanshi@gmail.com","9958784577",
				LocalDate.of(2017, 5, 24),"Senior Analyst",40000,15,new Department(1,"Developer",15)));
		employeeData.add(new Employee(8,"Rajan","Singh","rajan@gmail.com","9958974906",
				LocalDate.of(2017, 1, 13),"Curator",30000,20,new Department(2,"Graphics",20)));
		employeeData.add(new Employee(9,"Monika","Jha","ritesh@gmail.com","7042312283",
				LocalDate.of(2020, 1, 13),"Manager",50000,23,null));
		employeeData.add(new Employee(10,"Vardan","Mishra","vardan@gmail.com","7894561230",
				LocalDate.of(2000,12,31),"CEO",20000,24,new Department(3,"CEO",24)));
	}

	public List<Employee> getEmployeeData() {
		return employeeData;
	}
	

	
}
