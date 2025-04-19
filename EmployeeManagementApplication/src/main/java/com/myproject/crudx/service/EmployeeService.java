package com.myproject.crudx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myproject.crudx.entity.Employee;

@Service
public interface EmployeeService {

	//create ,getemp, getempbyid, delete, update 
	
	public Employee createEmp(Employee emp);
	public List<Employee> getAllemp();
	public Employee getEmployee(int id);
	public Employee updateEmp(Employee emp, int id);
	public void deleteEmployee(int id);
}
