package com.payroll.microservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="role-service", url="localhost:8083")
//@FeignClient(name="role-service") // not needed as Zuul server will be used
@FeignClient(name="zuul-edge-server")
//@RibbonClient(name="role-service")
public interface RoleService {
	
	@GetMapping("/role-service/api/role/{roleName}")
	public EmployeePayroll getRole(@PathVariable("roleName") String roleName);

}
