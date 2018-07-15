package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.jdbc.JDBCDepartmentDAO;

import org.springframework.jdbc.core.JdbcTemplate;


public class JDBCDepartmentDAOIntegrationTest {
	
	private static final String TEST_DEPTARTMENT = "XYZ";
	
	private static SingleConnectionDataSource dataSource;
	private JDBCDepartmentDAO dao;
	
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
	public void setup() {
		String sqlInsertDepartment = "insert into department (name) values (?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertDepartment, TEST_DEPTARTMENT);
		dao = new JDBCDepartmentDAO(dataSource);
	}
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	@Test
	public void returns_all_departments() {
		
		List<Department> results = dao.getAllDepartments();
		assertNotNull(results);
		assertEquals(7, results.size());
	}
	
	@Test
	public void returns_searched_department() {
		long id = 1;
		Department theDepartment = dao.getDepartmentById(id);
		assertNotNull(theDepartment);
		assertEquals("Department of Redundancy Department", theDepartment.getName());
	}
	@Test
	public void save_department() {
		Department newDept = getDepartment("first Department");
		newDept.setName("name changed");
		dao.saveDepartment(newDept);
		assertEquals("name changed", newDept.getName());
		
	}
	@Test
	public void create_and_return_new_dept() {
		Department newDepartment = getDepartment("new");
		dao.createDepartment(newDepartment);
		Department createdDept = new Department();
		createdDept = dao.getDepartmentById(newDepartment.getId());
		assertNotEquals(null, newDepartment.getId());
		assertEquals(newDepartment.getId(), createdDept.getId());
		assertEquals(newDepartment.getName(), createdDept.getName());
	}

	private Department getDepartment(String name) {
		Department department = new Department();
		department.setName(name);
		return department;
	}

}