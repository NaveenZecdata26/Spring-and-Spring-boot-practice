package com.spring.boot.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.jpa.entities.School;

public interface SchoolRepo extends JpaRepository<School, Integer> {

}
