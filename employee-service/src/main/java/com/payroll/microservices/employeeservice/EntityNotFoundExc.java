package com.payroll.microservices.employeeservice;

public class EntityNotFoundExc extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundExc(Long id) {
		super("Entity" + id + " not found");
	}	
	

}
