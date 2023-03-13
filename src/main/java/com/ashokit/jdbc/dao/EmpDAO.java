package com.ashokit.jdbc.dao;

import java.util.List;

import com.ashokit.jdbc.model.Employee;

public interface EmpDAO {

	List<Employee> fetchEmployees();
	
}
