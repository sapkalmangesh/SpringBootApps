package com.mauli.ms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mauli.ms.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
