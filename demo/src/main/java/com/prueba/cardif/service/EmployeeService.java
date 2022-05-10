package com.prueba.cardif.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.cardif.entity.Employee;
import com.prueba.cardif.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> findAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getOne(int id){
        return employeeRepository.findById(id);
    }

    public Optional<Employee> getByNombre(String nombre){
        return employeeRepository.findByEmpName(nombre);
    }

    public void  save(Employee employee){
    	employeeRepository.save(employee);
    }

    public void delete(int id){
    	employeeRepository.deleteById(id);
    }

    public boolean existsById(int id){
        return employeeRepository.existsById(id);
    }

    public boolean existsByEmpNombre(String nombre){
        return employeeRepository.existsByEmpName(nombre);
    }

}
