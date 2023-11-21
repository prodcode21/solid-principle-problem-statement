package com.problemsts.srp;

public class Employee {

	//storing the employee information
	public String empName;
	public String empId;
	public double salary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	 // salary deductions and logic here goes
	
	public void calculateSalary()
	{
		System.out.println(this.salary);
	}
}
