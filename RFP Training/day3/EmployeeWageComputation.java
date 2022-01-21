/* Employee Wage Computation Program*/

package com.bridgelabz.demo;

import java.lang.Math;

public class EmployeeWageComputation {
	public static final int WAGE_PER_HOUR = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_HOURS = 100;

	public static void main(String[] args) {
		int workHours = 0, totalWorkHours = 0, workingdaysPerMonth = 0;
		System.out.println("Employee Wage Computaion Program On Master Branch");
		while (totalWorkHours <= MAX_HOURS && workingdaysPerMonth < WORKING_DAYS) {
			workingdaysPerMonth++;
			/* employee attendance check */
			int empCheck = (int) (Math.random() * 10 % 2);

			switch (empCheck) {
			case 0:
				workHours = 8;
				// Employee is present full time
				break;
			case 1:
				workHours = 4;
				// Employee is present full time
				break;
			default:
				workHours = 0;
				// Employee is absent
				break;
			}
			totalWorkHours += workHours;
		}
		/* employee Wage computation */
		int empWage = totalWorkHours * WAGE_PER_HOUR;
		System.out.println("Employee Wage = " + empWage);
	}
}
