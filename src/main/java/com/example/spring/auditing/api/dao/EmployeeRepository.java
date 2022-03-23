package com.example.spring.auditing.api.dao;

import com.example.spring.auditing.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
