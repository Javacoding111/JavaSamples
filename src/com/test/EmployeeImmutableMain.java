package com.test;

import java.util.Date;

public class EmployeeImmutableMain {

	public static void main(String[] args) {
		String name = "Swarupa";
		long salary = 1000;
		Date date = new Date();
		EmployeeImmutable immutable = new EmployeeImmutable(name, salary, date);
		System.out.println(immutable.getEmpName());
		name = "Paruchuri";
		salary = 2000;
		date = new Date();
//		
		System.out.println(immutable.getEmpName());
	}
}
