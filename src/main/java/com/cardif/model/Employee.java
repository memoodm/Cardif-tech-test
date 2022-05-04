package com.cardif.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
public class Employee 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="emp_name", length=20, nullable=false, unique=false)
	private String name;
	
	@Column(name="password", length=20, nullable=false, unique=false)
	private String password;
	
	@Column(name="gender", length=20, nullable=false, unique=false)
	private String gender;
	
	@Temporal(TemporalType.DATE)
	@Column(name="birthday", nullable=false, unique=false)
	private Date birthday;
	
	@Column(name="dep_id", nullable=false, unique=false)
	private Integer departmentId;
	
	@Column(name="imp_role_id", nullable=false, unique=false)
	private Integer implementedRoleId;
	
	@Column(name="rank", nullable=false, unique=false)
	private Integer rank;
	
	@Column(name="tel", length=20, nullable=false, unique=false)
	private String phone;
	
	@Column(name="email", length=30, nullable=false, unique=true)
	private String email;
	
	@Column(name="info", length=300, nullable=false, unique=false)
	private String information;

}
