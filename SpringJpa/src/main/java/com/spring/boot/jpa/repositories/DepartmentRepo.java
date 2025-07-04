package com.spring.boot.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.jpa.entities.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
