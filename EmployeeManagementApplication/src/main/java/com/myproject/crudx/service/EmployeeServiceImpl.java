package com.myproject.crudx.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.crudx.entity.Employee;
import com.myproject.crudx.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repo;
	
	public Employee createEmp(Employee emp) {
		return repo.save(emp);
	}
	
	public List<Employee> getAllemp() {
		return repo.findAll();
	}
	
	public Employee getEmployee(int id) {
		return repo.findById(id).orElse(null);
	}

	public Employee updateEmp(Employee emp, int id) {
		Employee oldEmp = repo.findById(id).orElse(null);
		oldEmp.setName(emp.getName());
		oldEmp.setSalary(emp.getSalary());
		oldEmp.setMail(emp.getMail());
		repo.save(oldEmp);
		return oldEmp;
	}

	public void deleteEmployee(int id) {
	    repo.deleteById(id);
	}
}
