package com.hiral.em.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hiral.em.models.Employee;
import com.hiral.em.repository.EmployeeRepository;

@Controller
@RequestMapping("/")
public class EmployeeManager {
	private EmployeeRepository emp;

	public EmployeeManager(EmployeeRepository emp) {
		this.emp = emp;
	}

	@RequestMapping("")
	public void index(Model model) {
		// to get all employees of a manager
		List<Employee> e = emp.findAllEmployeesByManagerId(1);
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i).getFirstName());
		}

		// to get manager of an employee
		Employee em = emp.findOne((long) 10);
		System.out.println(em.getManager().getFirstName());
	}
}
