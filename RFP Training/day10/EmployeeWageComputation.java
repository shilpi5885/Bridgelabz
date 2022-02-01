package com.bridgelabz.demo;
import java.lang.Math;

public class EmployeeWageComputation {

	public static int calculateEmpWage(int wagePerHour,int workingDays, int maxHHours) { 
		System.out.println("Employee Wage Computaion Program On Master Branch");
		int totalWorkHours =0, workingdaysPerMonth = 0, workHours = 0;
		while (totalWorkHours <= maxHHours && workingdaysPerMonth < workingDays) {
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
		int empWage = totalWorkHours * wagePerHour;
		return empWage;
	}

	public static void main(String[] args) {
		System.out.println("Employee Wage = " + calculateEmpWage(20,22,110));
	}
}

