package com.hibernate.HQL;

// default package
// Generated Sep 21, 2015 12:46:49 PM by Hibernate Tools 4.3.1

/**
 * Employee generated by hbm2java
 */
public class Employee implements java.io.Serializable {

	private Integer empId;
	private String empName;
	private Integer empSalray;

	public Employee() {
	}

	public Employee(String empName, Integer empSalray) {
		this.empName = empName;
		this.empSalray = empSalray;
	}

	public Integer getEmpId() {
		return this.empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSalray() {
		return this.empSalray;
	}

	public void setEmpSalray(Integer empSalray) {
		this.empSalray = empSalray;
	}

}
