package com.bridgelabz.demo;

public class EmpWageBuilder {
	String companyName;
	int wagePerHour;
	int workingdaysPerMonth;
	int totalWorkHours;

	EmpWageBuilder(String companyName, int wagePerHour, int workingdaysPerMonth, int totalWorkHours ){
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.workingdaysPerMonth = workingdaysPerMonth;
		this.totalWorkHours = totalWorkHours;
	}
}
