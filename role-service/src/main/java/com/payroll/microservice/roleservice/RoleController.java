package com.payroll.microservice.roleservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {

	@Autowired
	RoleRepository roleRepo;
	
	@GetMapping("/api/role/{roleName}")
	public Role getRole(@PathVariable("roleName") String roleName) {
		Role role = roleRepo.findByRoleName(roleName);
		System.out.println("Role found:::"+ role);
		return role;
		//return new Role("R001","HR","Human Resources");
	}
	
}
	