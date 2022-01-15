package com.payroll.microservices.employeeservice;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository empRepo;
	@Autowired
	Environment environment;
	
	@GetMapping("/api/employee/{empId}")
	public Employee getEmployee(@PathVariable("empId") Long empId) throws EntityNotFoundExc {
		//return new Employee("Arpita", "Datta",101L, new Date());
		Employee e = empRepo.findOne(empId);
		System.out.println("In employee service: Employee:"+e);
		e.setPort(Integer.parseInt(environment.getProperty("local.server.port")));		
		return e;
	}

}
