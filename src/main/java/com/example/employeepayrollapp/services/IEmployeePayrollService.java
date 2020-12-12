package com.example.employeepayrollapp.services;

import java.util.List;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import com.example.employeepayrollapp.model.EmployeePayrollData;

public interface IEmployeePayrollService {
	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollDataById(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	EmployeePayrollData updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	void deleteEmployeePayrollData(int empId);
}
