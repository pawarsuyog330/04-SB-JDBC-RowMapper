package com.ashokit.jdbc.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.jdbc.dao.EmpDAO;
import com.ashokit.jdbc.model.Employee;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Autowired
	EmpDAO dao;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		List<Employee> lstEmps= dao.fetchEmployees();
		if(!lstEmps.isEmpty())
		{
			lstEmps.forEach(System.out::println);
		}

	}

}
