package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	


	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> departments = new ArrayList<>();
		String selectAllDepartments = "SELECT * FROM department";
		SqlRowSet result = jdbcTemplate.queryForRowSet(selectAllDepartments);
		
		while(result.next()) {
		departments.add(mapRowToDepartment(result));
		
	}
		return departments;
	}
private Department mapRowToDepartment(SqlRowSet result) {
	Department department = new Department();
	department.setId(result.getLong("department_id"));
	department.setName(result.getString("name"));
	return department;
}
	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		return new ArrayList<>();
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		return null;
	}

	@Override
	public Department getDepartmentById(Long id) {
		return null;
	}

}
