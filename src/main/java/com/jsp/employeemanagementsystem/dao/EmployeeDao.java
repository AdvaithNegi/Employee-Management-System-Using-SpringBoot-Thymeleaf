package com.jsp.employeemanagementsystem.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.employeemanagementsystem.dto.Employee;
import com.jsp.employeemanagementsystem.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;

	// All Records
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// Save Record
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// Get By Id Record
	public Employee getByIdEmployee(int id) {
		return employeeRepository.findById(id).get();
	}

	// Update Record
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// Delete Record
	public void deleteEmployee(int id) {
		employeeRepository.deleteById(id);
	}

}
