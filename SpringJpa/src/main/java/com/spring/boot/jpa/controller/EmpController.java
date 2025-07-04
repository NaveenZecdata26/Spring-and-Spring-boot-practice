package com.spring.boot.jpa.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.jpa.entities.Employee;
import com.spring.boot.jpa.repositories.EmployeeRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	private EmployeeRepo employeeRepo;

	private static final Logger log = LoggerFactory.getLogger(EmpController.class);

	@PostMapping("/add")
	public ResponseEntity<Employee> postMethodName(@RequestBody Employee entity) {
		log.info("employee :{}", entity);

		Employee employee = employeeRepo.save(entity);
		log.info("employee :{}", employee);
		return ResponseEntity.ok(employee);
	}

	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> getEmployeeById(@RequestParam int emp_id) {
		Employee employee = employeeRepo.findById(emp_id)
				.orElseThrow(() -> new RuntimeException("Employee not found with id : " + emp_id));

		return ResponseEntity.ok(employee);
	}

}
