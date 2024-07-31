package com.revature.java;

public class SalaryEmp extends Employee implements EmpBenifits{
	public double calcSalary(int days) {
		 return 1500*days;
	 }

	@Override
	public String getBenifits() {
		// TODO Auto-generated method stub
		return "Travel || Food one time || Insurance";
	}
	
	

}
