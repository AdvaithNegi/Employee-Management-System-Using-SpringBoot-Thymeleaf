package com.jsp.employeemanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.jsp.employeemanagementsystem.dto.Employee;
import com.jsp.employeemanagementsystem.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public String viewAllEmployee(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}

	@GetMapping("/employees/new")
	public String createEmployee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addemployee";
	}

	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}

	@GetMapping("/employees/update/{id}")
	public String forUpdateEmployee(@PathVariable int id, Model model) {
		model.addAttribute("employee", employeeService.getByIdEmployee(id));
		return "updateEmployee";
	}

	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable int id, @ModelAttribute("employee") Employee employee) {
		Employee employee2 = employeeService.getByIdEmployee(id);

		if (employee.getName() != null)
			employee2.setName(employee.getName());

		if (employee.getEmail() != null)
			employee2.setEmail(employee.getEmail());

		employeeService.updateEmployee(employee2);
		return "redirect:/employees";
	}

	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable int id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}

}
