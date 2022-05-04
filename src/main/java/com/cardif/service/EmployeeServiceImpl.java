package com.cardif.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardif.dao.EmployeeDao;
import com.cardif.model.Employee;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService
{
	
	@Autowired
	private EmployeeDao employeDao;

	@Override
	public List<Employee> findAllEmployees() {
		return employeDao.findAll();
	}

}
