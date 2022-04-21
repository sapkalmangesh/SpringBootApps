package com.mauli.ms.service;

import java.util.List;

import com.mauli.ms.Entity.Employee;

public interface IEmployeeService {
	
	Integer saveEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deletEmployee(Integer id);
	
	Employee getOneEmployee(Integer id);
	
	List<Employee> getAllEmployee();

}
