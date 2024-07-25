package org.mm.controller;

import org.mm.dto.EmployeeDto;
import org.mm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value = "")
	private ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employeeDto)
	{
		return new ResponseEntity<EmployeeDto>(employeeService.save(employeeDto), HttpStatus.CREATED);
	}

	@PostMapping(value = "/api")
	private EmployeeDto savee(@RequestBody EmployeeDto employeeDto)
	{
		return employeeService.save(employeeDto);
	}
}
