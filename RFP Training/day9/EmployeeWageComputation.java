/*Employee Wage Computation*/

package com.bridgelabz.demo;

import java.lang.Math;

public class EmployeeWageComputation {

	public static int calculateEmpWage(int wagePerHour, int workingdays, int maxHours) {
		int workHours = 0, totalWorkHours = 0, workingdaysPerMonth =0; 
		System.out.println("Employee Wage Computaion Program On Master Branch");
		while (totalWorkHours <= maxHours && workingdaysPerMonth < workingdays) {
			workingdaysPerMonth++;
			int empCheck = (int) (Math.random()*10 % 2);
			switch (empCheck)
			{
			case 0:
				workHours=8; //Employee is present full time
				break;
			case 1:
				workHours=4;//Employee is present half time
				break;
			default:
				workHours=0;//Employee is absent
				break;
			}
			totalWorkHours += workHours;
		}
		int empWage = totalWorkHours * wagePerHour;
		return empWage;
	}
	public static void main(String[] args) {
		System.out.println("Employee Wage = "+calculateEmpWage(20,20,100));
	}
}
