package com.jsp.employeemanagementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.employeemanagementsystem.dao.EmployeeDao;
import com.jsp.employeemanagementsystem.dto.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	// All employee
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllEmployees();
	}

	// Save Employee
	public Employee saveEmployee(Employee employee) {
		return employeeDao.saveEmployee(employee);
	}

	// Get By Id Employee
	public Employee getByIdEmployee(int id) {
		return employeeDao.getByIdEmployee(id);
	}

	// Update Employee
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

	// Delete Employee
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);
	}

}
