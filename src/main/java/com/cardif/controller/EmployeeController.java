package com.cardif.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cardif.model.Employee;
import com.cardif.service.EmployeeService;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController 
{

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAll() {
		return new ResponseEntity<>( employeeService.findAllEmployees(), HttpStatus.OK );
	}
	
}
