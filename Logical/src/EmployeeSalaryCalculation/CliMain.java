package EmployeeSalaryCalculation;

import java.util.Scanner;

public class CliMain {
	
	public static void getEmployeeDetails(Employee emp) {
		System.out.println("emp id = "+emp.getEmpId());
		System.out.println("emp name = "+emp.getEmployeeName());
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee(101, "Anubhav", 15000);
		emp.calculateNetSalary(12);
		System.out.println(emp.getNetSalary());

	}

}
