package com.spring.boot.jpa.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")

public class Department {
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentId, String department_name, Employee emp) {
		super();
		this.departmentId = departmentId;
		this.department_name = department_name;
		this.emp = emp;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", department_name=" + department_name + ", emp=" + emp
				+ "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String department_name;
	@OneToOne(mappedBy = "department", fetch = FetchType.EAGER, orphanRemoval = true)
	@JsonBackReference
	private Employee emp;

}
