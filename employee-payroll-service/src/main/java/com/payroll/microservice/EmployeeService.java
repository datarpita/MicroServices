package com.payroll.microservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="employee-service", url="localhost:8082")
//@FeignClient(name="employee-service")  //- not needed as Zuul edge server will be used
@FeignClient(name="zuul-edge-server")
//@RibbonClient(name="employee-service")
public interface EmployeeService {
	
	@GetMapping("/employee-service/api/employee/{empId}")
	public EmployeePayroll getEmployee(@PathVariable("empId") Long empId); 

}
