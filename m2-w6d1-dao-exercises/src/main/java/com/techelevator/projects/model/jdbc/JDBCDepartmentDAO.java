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
		List<Department> searchDepartments = new ArrayList<>();
		String searchByDepartment = "SELECT * FROM department WHERE name LIKE ?";
		SqlRowSet searchResult = jdbcTemplate.queryForRowSet(searchByDepartment, "%" + nameSearch + "%");

		
		while(searchResult.next()) {
		searchDepartments.add(mapRowToDepartment(searchResult));
		
	}
		return searchDepartments;
	}
	@Override
	public void saveDepartment(Department updatedDepartment) {
		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		List<Department> createdDepartments = new ArrayList<>();
		String createdDepartment = "SELECT * FROM department WHERE name LIKE ?";
		SqlRowSet createdDepartment = jdbcTemplate.queryForRowSet(createdDepartment, "%" + newDepartment + "%");

		
		while(newDepartment.next()) {
		createdDepartments.add(mapRowToDepartment(createdDepartment));
		
	}
		return createdDepartments;
	}

	@Override
	public Department getDepartmentById(Long id) {
		return null;
	}

}
