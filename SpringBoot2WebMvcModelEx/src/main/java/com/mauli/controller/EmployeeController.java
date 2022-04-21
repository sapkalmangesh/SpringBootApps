package com.mauli.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@GetMapping("/show")
	public String ShowData(Model model) {
		String title = "Naresh i Technology";
		 LocalDateTime ldt = LocalDateTime.now();  
		 System.out.println("Date and time is "+ldt);
		
		int eid = 101;
		model.addAttribute("title", title);
		model.addAttribute("date",ldt);
		model.addAttribute("no",eid);
		return"EmpData";
	}
}
