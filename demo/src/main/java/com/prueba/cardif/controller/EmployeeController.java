package com.prueba.cardif.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.cardif.dto.EmployeeDto;
import com.prueba.cardif.dto.Mensaje;
import com.prueba.cardif.entity.Employee;
import com.prueba.cardif.repository.EmployeeRepository;
import com.prueba.cardif.service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
   
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@GetMapping("/findAllEmployees")
    public ResponseEntity<List<Employee>> list(){
        List<Employee> list = employeeService.findAllEmployees();
        return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
    }
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> addEmployee(@Valid @RequestBody Employee employeeDto){
		
	    if(StringUtils.isBlank(employeeDto.getEmpName())) {
	    	return new ResponseEntity(new Mensaje("el nombre es obligatorio"), HttpStatus.BAD_REQUEST);
	    }else {
	    	employeeService.save(employeeDto);
	    }
	     
        return new ResponseEntity(new Mensaje("producto creado"), HttpStatus.OK);
		
	}
	
	@PostMapping("/employees")
    public Employee createEmployee(@Valid @RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }
	
	
}
