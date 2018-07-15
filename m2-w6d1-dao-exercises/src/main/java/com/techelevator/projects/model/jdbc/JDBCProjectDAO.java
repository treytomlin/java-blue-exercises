package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {
		List<Project> activeProjects = new ArrayList<Project>();
		String sqlActiveProjects = "select * from project where from_date <= now() and to_date >= now()";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlActiveProjects);
		
		while(results.next()) {
			Project project = mapRowToProject(results);
			activeProjects.add(project);
		}
		return activeProjects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) { 
		String sqlDelete = "delete from project_employee where project_id = ? and employee_id = ?";
		jdbcTemplate.update(sqlDelete, projectId, employeeId);
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {
		String sqlInsertEmployee = "insert into project_employee(project_id, employee_id) values(?, ?)";
		jdbcTemplate.update(sqlInsertEmployee, projectId, employeeId);	
	}
	private Project mapRowToProject(SqlRowSet result) {
		Project project = new Project();
		project.setId(result.getLong("project_id"));
		project.setName(result.getString("name"));
		project.setStartDate(result.getDate("to_date").toLocalDate());
		project.setStartDate(result.getDate("from_date").toLocalDate());
		return project;
	}
}