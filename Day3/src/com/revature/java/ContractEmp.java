package com.revature.java;

public class ContractEmp extends Employee{
 

public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmp(int empId, String empName, int daysPresents) {
		super(empId, empName, daysPresents);
		// TODO Auto-generated constructor stub
	}

public double calcSalary(int hours) {
	  return 200*hours;
 }
}
