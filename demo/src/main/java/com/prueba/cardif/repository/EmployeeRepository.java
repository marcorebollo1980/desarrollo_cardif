package com.prueba.cardif.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prueba.cardif.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	Optional<Employee> findByEmpName(String empName);
    boolean existsByEmpName(String empName);

}
