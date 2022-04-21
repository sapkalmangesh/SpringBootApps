package com.mauli.ms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauli.ms.Entity.Employee;
import com.mauli.ms.exception.EmployeeNotFoundException;
import com.mauli.ms.repo.EmployeeRepository;
import com.mauli.ms.service.IEmployeeService;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private EmployeeRepository repo;

	@Override
	public Integer saveEmployee(Employee emp) {
		emp =repo.save(emp);
		return emp.getEmpId();
	}

	@Override
	public void updateEmployee(Employee emp) {
		if(emp.getEmpId()==null||!repo.existsById(emp.getEmpId())){
			throw new EmployeeNotFoundException(emp.getEmpId()+" - not exist");
		}else
		{
			repo.save(emp);
		}

	}

	@Override
	public void deletEmployee(Integer id) {
		// TODO exist or not?
		repo.deleteById(id);

	}

	@Override
	public Employee getOneEmployee(Integer id) {
		Optional<Employee> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		else {
			// TODO exist or not?
			return null;
		}
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = repo.findAll();
		return list;
	}

}
