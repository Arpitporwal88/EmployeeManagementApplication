package com.myproject.crudx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.crudx.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
