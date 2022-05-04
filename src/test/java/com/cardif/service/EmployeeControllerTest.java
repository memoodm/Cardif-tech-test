package com.cardif.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.cardif.dao.EmployeeDao;
import com.cardif.model.Employee;
import com.cardif.service.EmployeeService;
import com.cardif.service.EmployeeServiceImpl;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {
	
	private EmployeeService employeeService;
	
	@Mock
	private EmployeeDao employeeDao;
	
	@BeforeEach
    void setUp()
	{
		employeeService = new EmployeeServiceImpl(employeeDao);
    }
	
	@Test
    public void canGetAll()
    {
		Employee employee1 = Employee.builder()
				.id(1)
				.name("Test1")
				.build();
		Employee employee2 = Employee.builder()
				.id(2)
				.name("Test2")
				.build();
		List<Employee> employeesEntites = Arrays.asList(employee1, employee2);;
		given(employeeDao.findAll()).willReturn(employeesEntites);
		
		List<Employee> employees = employeeService.findAllEmployees();
		
		assertThat(employees).isNotNull();
		assertThat(employees).isEqualTo(employeesEntites);
		assertThat(employees.size()).isEqualTo(2);
		
    }



}
