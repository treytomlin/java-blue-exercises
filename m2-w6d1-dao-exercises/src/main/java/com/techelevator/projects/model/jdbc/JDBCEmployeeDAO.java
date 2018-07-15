package com.techelevator.projects.model.jdbc;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		String selectAllEmployees = "select * from employee";
		SqlRowSet result = jdbcTemplate.queryForRowSet(selectAllEmployees);
		
		while(result.next()) {
			employees.add(mapRowToEmployee(result));
		}
		return employees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> Employees = new ArrayList<Employee>();
		String findEmployeeByName = "select * from employee where first_name like ? and last_name like ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(findEmployeeByName, "%" + firstNameSearch + "%", "%" + lastNameSearch + "%");
		
		while(results.next()) {
			Employee Employee = mapRowToEmployee(results);
			Employees.add(Employee);
		}
		return Employees;
		
	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		List<Employee> Employees = new ArrayList<Employee>();
		String employeeByDept = "select * from employee where department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(employeeByDept, id);
		
		while(results.next()) {
			Employee Employee = mapRowToEmployee(results);
			Employees.add(Employee);
		}
		return Employees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> Employees = new ArrayList<Employee>();
		String findEmployeeNoProjects = "select * from employee\n" + 
									"join project_employee on employee.employee_id = project_employee.employee_id\n" + 
									"where project_employee.employee_id is null";
		SqlRowSet results = jdbcTemplate.queryForRowSet(findEmployeeNoProjects);
		
		while(results.next()) {
			Employee Employee = mapRowToEmployee(results);
			Employees.add(Employee);
		}
		return Employees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		List<Employee> Employees = new ArrayList<Employee>();
		String getEmployeeByProject = "select * from employee\n" + 
									  "  join project_employee on employee.employee_id = project_employee.employee_id" + 
									  " where project_employee.project_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(getEmployeeByProject, projectId);
		
		while(results.next()) {
			Employee Employee = mapRowToEmployee(results);
			Employees.add(Employee);
		}
		return Employees;
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {
		
		String changeDept = "update employee set department_id = ? where employee_id = ?";
		jdbcTemplate.update(changeDept, departmentId, employeeId);
	}
	private Employee mapRowToEmployee(SqlRowSet result) {
		Employee employee = new Employee();
		employee.setId(result.getLong("employee_id"));
		employee.setDepartmentId(result.getLong("department_id"));
		employee.setFirstName(result.getString("first_name"));
		employee.setLastName(result.getString("last_name"));
		employee.setBirthDay(result.getDate("birth_date").toLocalDate());
		employee.setGender(result.getString("gender").charAt(0));
		employee.setHireDate(result.getDate("hire_date").toLocalDate());
		return employee;
	}

}