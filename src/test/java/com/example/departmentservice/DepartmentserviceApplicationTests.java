package com.example.departmentservice;

import com.example.departmentservice.models.Department;
import com.example.departmentservice.models.Employee;
import com.example.departmentservice.models.Project;
import com.example.departmentservice.repositories.DepartmentRepository;
import com.example.departmentservice.repositories.EmployeeRepository;
import com.example.departmentservice.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DepartmentserviceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createDepartmentAndEmployeeAndProject() {
		Department department = new Department("Front End");
		departmentRepository.save(department);
		Project project = new Project("Feature Line", 3);
		projectRepository.save(project);
		Employee employee = new Employee("Liliana", "Everett", 2344, department);
		employee.addProject(project);
		employeeRepository.save(employee);

	}

}
