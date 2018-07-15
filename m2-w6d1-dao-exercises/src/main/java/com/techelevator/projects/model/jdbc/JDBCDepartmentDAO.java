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
		
		List<Department> departments = new ArrayList<Department>();
		String selectAllDepartments = "select * from department";
		SqlRowSet result = jdbcTemplate.queryForRowSet(selectAllDepartments);
		
		while(result.next()) {
			departments.add(mapRowToDepartment(result));
		}
		
		return departments;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		List<Department> departments = new ArrayList<Department>();
		String findDepartmentByName = "select * from department where name like ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(findDepartmentByName, "%" + nameSearch + "%");
		
		while(results.next()) {
			Department theDepartment = mapRowToDepartment(results);
			departments.add(theDepartment);
		}
		return departments;
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {
		String sqlUpdateDepartmentName = "update department set name= ? where department_id = ?";
		jdbcTemplate.update(sqlUpdateDepartmentName, updatedDepartment.getName(), updatedDepartment.getId());
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		String sqlInsertDepartment = "INSERT INTO department(department_id, name) VALUES(?, ?)";
		newDepartment.setId(getNextDepartmentId());
		jdbcTemplate.update(sqlInsertDepartment, newDepartment.getId(), newDepartment.getName());
		return newDepartment;
	}

	@Override
	public Department getDepartmentById(Long id) {
		String sqlSelectById = "select department_id, name from department where department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectById, id);
			while(results.next()) { //was getting error without this
				Department theDepartment = mapRowToDepartment(results);
				return theDepartment;
			}
return null;
			
		}
		
		
	
	
	private Department mapRowToDepartment(SqlRowSet results) {
		Department theDepartment;
		theDepartment = new Department();
		theDepartment.setId(results.getLong("department_id"));
		theDepartment.setName(results.getString("name"));
		return theDepartment;
	}
	
	private long getNextDepartmentId() {
		SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_department_id')");
		if(nextIdResult.next()) {
			return nextIdResult.getLong(1);
		} else {
			throw new RuntimeException("Something went wrong while getting an id for the new city");
		}
	}

}