package com.techelevator.projects.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.jdbc.JDBCEmployeeDAO;

public class JDBCEmployeeDAOIntegrationTest {
	
	private static SingleConnectionDataSource dataSource;
	private JDBCEmployeeDAO dao;
	
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
		String sqlInsertEmployee = "insert into employee (department_id, first_name, last_name, birth_date, gender, hire_date) values (3, 'John', 'Doe', '994-08-31', 'M', '2018-06-26')";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertEmployee);
		dao = new JDBCEmployeeDAO(dataSource);
	}
	@After
	public void rollback() throws SQLException {
		dataSource.getConnection().rollback();
	}
	@Test
	public void return_all_departments() {
		List<Employee> results = dao.getAllEmployees();
		assertNotNull(results);
		assertEquals(13, results.size());
	}
	 
	@Test
	public void return_searched_employees() {
		
		List<Employee> employees = dao.searchEmployeesByName("F", "T");
		Employee actual = employees.get(0);
		LocalDate birth = LocalDate.of(1980, 7, 14);
		LocalDate hire = LocalDate.of(1998, 9, 1);
		char c = 'M';
		Employee expected = getEmployee(3l, 11l, "Franklin", "Trumbauer", birth, c, hire);
		assertEmployeesAreEqual(expected, actual);
		
	}
	@Test
	public void return_employees_by_dept() {
		
		List<Employee> employees = dao.getEmployeesByDepartmentId(11l);
		assertEquals(4, employees.size());
		
	
		LocalDate birth = LocalDate.of(1980, 7, 14);
		LocalDate hire = LocalDate.of(1998, 9, 1);
		char c = 'M';
		Employee expected = getEmployee(3l, 11l, "Franklin", "Trumbauer", birth, c, hire);
		
		assertEmployeesAreEqual(expected, employees.get(0));
		assertEquals(Long.valueOf(4), employees.get(1).getId());
		
	}
	
	@Test
	public void return_employees_without_project() {
		List<Employee> employees = dao.getEmployeesWithoutProjects();
		assertEquals(0, employees.size());
	}
	@Test
	public void return_employees_by_project_id() {
		List<Employee> employees = dao.getEmployeesByProjectId(6l);
		assertEquals(Long.valueOf(5), employees.get(0).getId());
		assertEquals(Long.valueOf(10), employees.get(1).getId());
		assertEquals(Long.valueOf(11), employees.get(2).getId());
	}
	@Test
	public void change_employee_department() {
		dao.changeEmployeeDepartment(8l, 1l);
		char c = 'M';
		Employee expected = getEmployee(8l, 1l, "Neville", "Zellers", LocalDate.of(1983, 04, 04), c, LocalDate.of(2013, 07, 01));
		List<Employee> employees = dao.searchEmployeesByName("Neville", "Zellers");
		Employee actual = employees.get(0);
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getDepartmentId(), actual.getDepartmentId());
	}
	
	
	
	
	private void assertEmployeesAreEqual(Employee expected, Employee actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getFirstName(), actual.getFirstName());
		assertEquals(expected.getLastName(), actual.getLastName());
		assertEquals(expected.getBirthDay(), actual.getBirthDay());
		assertEquals(expected.getGender(), actual.getGender());
		assertEquals(expected.getDepartmentId(), actual.getDepartmentId());
	}
	
	private Employee getEmployee(Long id, Long dept_id, String first, String last, LocalDate birth, char gender, LocalDate hireDate) {
		Employee employee = new Employee();
		employee.setId(id);
		employee.setDepartmentId(dept_id);
		employee.setFirstName(first);
		employee.setLastName(last);
		employee.setBirthDay(birth);
		employee.setGender(gender);
		employee.setHireDate(hireDate);;
		return employee;
	}
	
	
	
	

}