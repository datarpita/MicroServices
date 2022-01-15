package com.payroll.microservice.roleservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RoleRepository extends JpaRepository<Role, Long> {
	
	public Role findByRoleName(String roleName);

}
