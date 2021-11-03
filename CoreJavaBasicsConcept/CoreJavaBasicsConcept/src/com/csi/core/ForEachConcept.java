package com.csi.core;

import java.util.LinkedList;
import java.util.List;

class Employee {
	private int empId;

	private String empName;

	private double empSalary;

	public Employee(int empId, String empName, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
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

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

}

public class ForEachConcept {

	public static void main(String[] args) {

		List<Employee> empList = new LinkedList<>();

		empList.add(new Employee(121, "SWARA", 5465466.89));
		empList.add(new Employee(122, "BINU", 34545.89));
		empList.add(new Employee(123, "MANI", 44354354.89));
		empList.add(new Employee(127, "VENKAT", 43545.89));
		empList.add(new Employee(129, "LAKSHMI", 543545.89));

		// System.out.println(empList);
		// empList.forEach(System.out::println);
		// empList.forEach(emp->System.out.println(emp));

		for (Employee e : empList) {
			if (e.getEmpId() == 123) {
				System.out.println(e);
			}
		}
	}
}
