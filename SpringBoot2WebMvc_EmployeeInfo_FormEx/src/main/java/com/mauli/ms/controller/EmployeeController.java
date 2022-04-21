package com.mauli.ms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mauli.ms.entity.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	@GetMapping("/register")
	public String EmployeeDetails() {
		return"EmpRegister";
	}
	//2. TO READ FORM DATA ON SUBMIT
			@PostMapping("/save")
			public String readData(
					@ModelAttribute Employee employee,
					Model model
					)
			{
				System.out.println("Data is => " + employee);
				model.addAttribute("emp", employee);
				return "EmpData";
			}

}
