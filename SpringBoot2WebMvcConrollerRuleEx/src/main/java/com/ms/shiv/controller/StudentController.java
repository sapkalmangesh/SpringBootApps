package com.ms.shiv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/std")
public class StudentController {
	@GetMapping("/show")
	public String ShowData() {
		return "StdData";

	}
}