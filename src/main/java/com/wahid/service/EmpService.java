package com.wahid.service;

import java.util.List;

import javax.management.MXBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wahid.entity.Employee;
import com.wahid.repository.EmpRepo;

@Service
public class EmpService {
	
	@Autowired
	private EmpRepo repo;
	
	public void addEmployee(Employee e)
	{
		repo.save(e);
	}
	public List<Employee> getAllEmployee()
	{
		
		return repo.findAll();
		
		
	}

}
