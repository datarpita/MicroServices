package com.payroll.microservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="employee_payroll")
public class EmployeePayroll {
	
	@Id
	@Column(name="payroll_id")
	@GeneratedValue
	private Long payrollId;
	
	@Column(name="emp_id")
	private Long empId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="date_of_joining")
	private Date dateOfJoining;
	
	private int port;
	
	@Column(name="role_id")
	private Long roleId;
	@Column(name="role_name")
	private String roleName;
	@Column(name="description")
	private String roleDescription;
	
	public EmployeePayroll() {}

	public EmployeePayroll(Long payrollId, Long empId, String firstName, String lastName, Date dateOfJoining,
			Long roleId, String roleName, String roleDescription) {
		super();
		this.payrollId = payrollId;
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.roleId = roleId;
		this.roleName = roleName;
		this.roleDescription = roleDescription;
	}

	public Long getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(Long payrollId) {
		this.payrollId = payrollId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
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

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [payrollId=" + payrollId + ", empId=" + empId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfJoining=" + dateOfJoining + ", port=" + port + ", roleId="
				+ roleId + ", roleName=" + roleName + ", roleDescription=" + roleDescription + "]";
	}
}
