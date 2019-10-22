package com.example.departmentservice;

import com.example.departmentservice.models.Department;
import com.example.departmentservice.repositories.DepartmentRepository;
import com.example.departmentservice.repositories.EmployeeRepository;
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

	@Test
	void contextLoads() {
	}

	@Test
	void createDepartmentAndEmployee() {
		Department department = new Department("Front End");
		departmentRepository.save(department);
	}
}
