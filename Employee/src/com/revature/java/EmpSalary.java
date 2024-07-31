package com.revature.java;

public class EmpSalary {
	public static void main(String [] args) {
		SalaryEmp se=new SalaryEmp();
		se.setEmpId(101);
		se.setEmpName("Vilas");
		se.setDaysPresents(20);
		System.out.println(se);
		System.out.println(se.calcSalary(se.getDaysPresents()));
		System.out.println(se.getBenifits());
		
		ContractEmp ce=new ContractEmp(202,"Vibhore",120);
		System.out.println(ce);
		System.out.println(ce.calcSalary(ce.getDaysPresents()));
		
	}

}
