package com.zpt.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpt.crud.bean.Employee;
import com.zpt.crud.bean.EmployeeExample;
import com.zpt.crud.dao.EmployeeMapper;
import com.zpt.crud.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
