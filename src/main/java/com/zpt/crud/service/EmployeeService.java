package com.zpt.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zpt.crud.bean.Employee;
import com.zpt.crud.dao.EmployeeMapper;

public interface EmployeeService {

	public List<Employee> getEmployees();
	
}
