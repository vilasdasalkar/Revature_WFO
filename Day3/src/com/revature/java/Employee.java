package com.revature.java;

public abstract class Employee {
	private int empId;
	private String empName;
	private int daysPresents;
	public Employee(int empId, String empName, int daysPresents) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.daysPresents = daysPresents;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDaysPresents() {
		return daysPresents;
	}
	public void setDaysPresents(int daysPresents) {
		this.daysPresents = daysPresents;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", daysPresents=" + daysPresents + "]";
	}
	
	
	

}
