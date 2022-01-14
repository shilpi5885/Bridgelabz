package com.bridgelabz.demo;

import java.lang.Math;

public class EmployeeWageComputation {
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_HOURS = 100;

	public static void main(String[] args) {
		int workHours = 0, totalWorkHours = 0, workingdaysPerMonth =0; 
		System.out.println("Employee Wage Computaion Program On Master Branch");
		while (totalWorkHours <= MAX_HOURS && workingdaysPerMonth < WORKING_DAYS) {
			workingdaysPerMonth++;
			int empCheck = (int) (Math.random()*10 % 2);
			switch (empCheck)
			{
			case 0:
				workHours=8;
				//System.out.println("Employee is present full time");
				break;
			case 1:
				workHours=4;
				//System.out.println("Employee is present full time");
				break;
			default:
				workHours=0;
				//System.out.println("Employee is absent");
				break;
			}
			totalWorkHours += workHours;
		}
		int empWage = totalWorkHours * WAGE_PER_HOUR;
		System.out.println("Total Employee Wage = "+empWage);
	}
	
}
