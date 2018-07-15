package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;
import com.techelevator.projects.model.jdbc.JDBCProjectDAO;

public class JDBCProjectDAOIntegrationTest {
	
	private static SingleConnectionDataSource dataSource;
	private JDBCProjectDAO dao;
	private JDBCEmployeeDAO daoEmployee;
	
	
	@BeforeClass
	public static void setupDataSource() {
		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		dataSource.setAutoCommit(false);
	}
	@AfterClass
	public static void closeDataSource() throws SQLException {
		dataSource.destroy();
	}
	@Before
	public void setUp() {
		dao = new JDBCProjectDAO(dataSource);
		daoEmployee = new JDBCEmployeeDAO(dataSource);
	}
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	@Test
	public void return_active_projects() {
		List<Project> projects = dao.getAllActiveProjects();
		assertEquals(1, projects.size());
		assertEquals(Long.valueOf(6), projects.get(0).getId());
	}
	@Test
	public void remove_employee_id_6_from_project_id_4() {
		dao.removeEmployeeFromProject(4l, 6l);
		List<Employee> employees = daoEmployee.getEmployeesByProjectId(4l);
		assertEquals(1, employees.size());
	}
	@Test
	public void add_employee_to_project() {
		List<Employee> employees = daoEmployee.getEmployeesByProjectId(4l);
		assertEquals(2, employees.size());
		
		dao.addEmployeeToProject(4l, 9l);
		List<Employee> employeesNew = daoEmployee.getEmployeesByProjectId(4l);
		assertEquals(3, employeesNew.size());
	}

}