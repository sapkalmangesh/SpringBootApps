package com.mauli.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mauli.ms.Entity.Employee;
import com.mauli.ms.exception.EmployeeNotFoundException;
import com.mauli.ms.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeContoller {
	@Autowired
	private IEmployeeService service;

	//1)show regester page
	@GetMapping("register")
	public String showReg() {
		return"EmployeeRegister";

	}
	
	//2)Read form data and save(on submiit)
	@PostMapping("/save")
	public String saveEmp(@ModelAttribute Employee employee, Model model) {
		Integer id = service.saveEmployee(employee);
		String msg = "Employee '"+id+"' created......";
		model.addAttribute("message", msg);
		return"EmployeeRegister";

	}

	//3)show all employees
	@GetMapping("/all")
	public String ViewAll(@RequestParam(value="message",required = false)String message,
			Model model) {
		List<Employee> list = service.getAllEmployee();
		model.addAttribute("list", list);
		model.addAttribute("message", message);
		return"EmployeeData";
	}

	//4)Delete Employee by id
	@GetMapping("/delete")
	public String delete(
			@RequestParam("id")Integer id,
			RedirectAttributes attributes) 
	{
		String message = null;
		try {
			service.deletEmployee(id);
			message = id+" - deleted";
			
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			message = e.getMessage();
		}
		attributes.addAttribute("message", message);
		return "redirect:all";
		
	}

	//5)Show Employee data on edit page by id
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam("id")Integer id,
			Model model,
			RedirectAttributes attributes
			) 
	{
		String page = null;
		try {
			Employee emp = service.getOneEmployee(id);
			model.addAttribute("employee",emp);
			page = "EmpEditPage";
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
			attributes.addAttribute("message",e.getMessage());
			page= "redirect:all";
		}
		return page;
		
	}

	//6)Edit employee data on update (submit)
	@PostMapping("/update")
	public String update(
			@ModelAttribute Employee employee,
			RedirectAttributes attributes) {
		service.updateEmployee(employee);
		String message = "Employee "+employee.getEmpId()+" is updated";
		attributes.addAttribute("message", message);
		return "redirect:all";
	}
	

}
