package org.mm.service;

import org.mm.dao.EmployeeRepostiory;
import org.mm.dto.EmployeeDto;
import org.mm.entities.EmployeeEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepostiory employeeRepostiory;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeDto save(EmployeeDto employeeDto)
	{
		EmployeeEntity employeeEntity = employeeRepostiory.save(convertDtotoEntity(employeeDto));
		return convertEntitytoDto(employeeEntity);
	}
	
	private EmployeeEntity convertDtotoEntity(EmployeeDto employeeDto)
	{
		return modelMapper.map(employeeDto, EmployeeEntity.class);
	}
	
	private EmployeeDto convertEntitytoDto(EmployeeEntity employeeEntity)
	{
		return modelMapper.map(employeeEntity, EmployeeDto.class);
	}
}
