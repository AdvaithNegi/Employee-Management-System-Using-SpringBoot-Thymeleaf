package com.jsp.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.employeemanagementsystem.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
