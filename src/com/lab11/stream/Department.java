package com.lab11.stream;

public class Department {

	private int deparmentId;
	private String departmentName;
	private int managerId;

	
	public Department(int deparmentId, String departmentName, int managerId) {
		super();
		this.deparmentId = deparmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}

	public Department() {
		super();
	}

	public int getDeparmentId() {
		return deparmentId;
	}

	public void setDeparmentId(int deparmentId) {
		this.deparmentId = deparmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	
}
