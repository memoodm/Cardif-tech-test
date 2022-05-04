package com.cardif.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardif.model.Employee;

@Repository
public interface EmployeDao extends JpaRepository<Employee,Integer>
{

}
