package com.bridgelabz.demo;

import java.lang.Math;

public class EmployeeWageComputation {
	
	public static void main(String[] args) {
		System.out.println("Employee Wage Computaion Program On Master Branch");
		int checkAttendance = (int) (Math.random()*10 % 2);
		System.out.println(checkAttendance);
	
		switch (checkAttendance)
		
		{
		case 0:
			int workHours=8;
			System.out.println("Employee is present full time");
			int empWage = dailyEmployeeWage(8,20,20);
			System.out.println("Employee Wage = "+empWage);
			break;
		case 1:
			workHours=4;
			System.out.println("Employee is present full time");
			empWage = dailyEmployeeWage(4,20,20);
			System.out.println("Employee Wage = "+empWage);
			break;
		default:
			workHours=0;
			System.out.println("Employee is absent");
			break;
		}
	}
	
	private static int dailyEmployeeWage( int workHours, int wagePerHour, int workingDaysPerMonth) {
		return workHours * wagePerHour * workingDaysPerMonth ;
	}
	
}
