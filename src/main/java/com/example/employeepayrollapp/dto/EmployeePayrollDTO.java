package com.example.employeepayrollapp.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class EmployeePayrollDTO {

	@Pattern(regexp = "^[A-Z]{1}[A-Za-z\\s]{2,}$", message = "Employee name Invalid")
	public String name;

	@Min(value = 500, message = "Minimum Wage should be more than 500")
	public long salary;

	public EmployeePayrollDTO(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return "name=" + name + ":salary=" + salary;
	}
}
