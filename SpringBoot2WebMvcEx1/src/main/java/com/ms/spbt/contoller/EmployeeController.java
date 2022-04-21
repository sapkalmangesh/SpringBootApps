package com.ms.spbt.contoller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/emp")
//@ComponentScan(basePackages = {"com.ms.spbt"})
public class EmployeeController {
	
	@GetMapping("/show")
	public String ShowPage(){
		System.out.println("Get is called");
		return "EmpHome";
	}

}
