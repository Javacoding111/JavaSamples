package com.test;

import java.util.Date;

public final class EmployeeImmutable {
	
	private final String empName;
	
	private final long salary;
	
	private final Date date;

	public EmployeeImmutable(String empName, long salary, Date date) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.date = new Date(date.getTime());
	}

	public String getEmpName() {
		return empName;
	}

	public long getSalary() {
		return salary;
	}

	public Date getDate() {
		return new Date(date.getTime());
	}

}
