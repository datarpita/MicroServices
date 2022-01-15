package com.payroll.microservices.employeeservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="employee")
public class Employee {
	
	@Id
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	private int port;
	
	public Employee() {
		
	}
	
	public Employee(String firstName, String lastName, Long empId, Date dateOfJoining) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
		this.dateOfJoining = dateOfJoining;
	}	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfJoining="
				+ dateOfJoining + ", port=" + port + "]";
	}
	
	

}
