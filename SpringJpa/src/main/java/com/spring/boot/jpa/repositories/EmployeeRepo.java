package com.spring.boot.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.jpa.entities.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
