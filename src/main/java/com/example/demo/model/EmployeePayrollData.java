package com.example.demo.model;

import com.example.demo.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
	private int employeeId;
	private String name;
	private long salary;

	public EmployeePayrollData() {
	}

	public EmployeePayrollData(int empId, EmployeePayrollDTO empPayRollDTO) {
		super();
		this.employeeId = empId;
		this.name = empPayRollDTO.name;
		this.salary = empPayRollDTO.salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayrollData [employeeId=\" + employeeId + \", name=\" + name + \", salary=\" + salary + \"]";
		}
}