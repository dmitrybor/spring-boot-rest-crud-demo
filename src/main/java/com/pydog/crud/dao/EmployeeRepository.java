package com.pydog.crud.dao;

import com.pydog.crud.entity.Employee;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

@Profile("spring-jpa")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
