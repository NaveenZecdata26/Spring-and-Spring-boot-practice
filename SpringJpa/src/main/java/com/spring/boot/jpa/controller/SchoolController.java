package com.spring.boot.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.jpa.entities.School;
import com.spring.boot.jpa.repositories.SchoolRepo;

@RestController
@RequestMapping("/schools")
public class SchoolController {
	@Autowired
	private SchoolRepo schoolRepo;

	@PostMapping("/add")
	public ResponseEntity<School> addSchool(@RequestBody School entity) {
		School school = schoolRepo.save(entity);
		return ResponseEntity.ok(school);
	}

	@GetMapping("/getSchool")
	public ResponseEntity<School> getSchool(@RequestParam int school_id) {
		School school = schoolRepo.findById(school_id)
				.orElseThrow(() -> new RuntimeException("School not found with id : " + school_id));
		return ResponseEntity.ok(school);
	}

	@GetMapping
	public ResponseEntity<List<School>> getSchool() {
		List<School> school = schoolRepo.findAll();
		return ResponseEntity.ok(school);
	}
}
