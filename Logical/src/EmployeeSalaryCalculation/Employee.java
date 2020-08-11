package EmployeeSalaryCalculation;

public class Employee {

	private int empId;
	private String employeeName;
	private double salary;
	private double netSalary;

	public Employee() {

	}

	public Employee(int empId, String employeeName, double salary) {

		this.empId = empId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	public void calculateNetSalary(int pf) {
		double temp = this.salary*pf;
		double pfamount = temp/100;
		this.netSalary = this.salary-pfamount;
//		setNetSalary(this.netSalary);
		
	}

}
