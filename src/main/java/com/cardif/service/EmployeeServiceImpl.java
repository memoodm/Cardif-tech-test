package com.cardif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardif.dao.EmployeDao;
import com.cardif.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	
	@Autowired
	private EmployeDao employeDao;

	@Override
	public List<Employee> findAllEmployees() {
		return employeDao.findAll();
	}

}
