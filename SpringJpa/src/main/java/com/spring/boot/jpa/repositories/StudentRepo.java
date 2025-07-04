package com.spring.boot.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.jpa.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
