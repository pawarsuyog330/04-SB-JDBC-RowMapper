package com.ashokit.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ashokit.jdbc.dao.EmpDAO;
import com.ashokit.jdbc.model.Employee;

@Repository
public class EmpDAOImpl implements EmpDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> fetchEmployees() {
		RowMapper<Employee> rowMapper = (rs, rowNum) -> {
			Employee emp = new Employee();
			emp.setEmpno(rs.getInt(1));
			emp.setEname(rs.getString(2));
			emp.setSal(rs.getDouble(3));
			emp.setDeptno(rs.getInt(4));
			return emp;
		};
		return jdbcTemplate.query("SELECT * FROM EMP", rowMapper);
	}

}
