package com.payroll.microservice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeePayrollController {

	@Autowired
	EmployeePayrollRepository empPayrollRepo;
	
	//FeignClient
	@Autowired
	EmployeeService empService;
	
	//FeignClient
	@Autowired
	RoleService roleService;
	
	
	
	
	@PostMapping("/api/employee/{empId}/role/{roleName}")
	public EmployeePayroll addEmployeePayrollDetails(@PathVariable Long empId, @PathVariable String roleName) {
		
		System.out.println("empId---->"+empId);
		RestTemplate restTemplate = new RestTemplate();
		//ResponseEntity<EmployeePayroll> epforEmp = restTemplate.getForEntity("http://localhost:8082/api/employee/{empId}", EmployeePayroll.class, empId);
		//ResponseEntity<EmployeePayroll> epforRole = restTemplate.getForEntity("http://localhost:8083/api/role/{roleName}", EmployeePayroll.class, roleName);
		/*EmployeePayroll e = epforEmp.getBody();
		e.setRoleId(epforRole.getBody().getRoleId());
		e.setRoleName(epforRole.getBody().getRoleName());
		e.setRoleDescription(epforRole.getBody().getRoleDescription());*/
		
		EmployeePayroll e = empService.getEmployee(empId);
		System.out.println("Employee partly:::"+ e);
		
		EmployeePayroll epforRole = roleService.getRole(roleName);
		System.out.println("Role partly::::"+ epforRole);
		
		
		
		e.setRoleId(epforRole.getRoleId());
		e.setRoleName(epforRole.getRoleName());
		e.setRoleDescription(epforRole.getRoleDescription());
		empPayrollRepo.save(e);
		return e;
	}
}
