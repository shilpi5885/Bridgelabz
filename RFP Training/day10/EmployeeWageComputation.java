/*Employee Wage Computation*/

package com.bridgelabz.demo;
import java.lang.Math;

public class EmployeeWageComputation {

	public static int calculateEmpWage() {
		System.out.println("Employee Wage Computaion Program On Master Branch");

		int totalWorkHours = 0, workingdaysPerMonth = 0, workHours = 0;

		EmpWageBuilder company = new EmpWageBuilder("XYZ", 120, 25, 26);

		while (totalWorkHours <= company.totalWorkHours && workingdaysPerMonth < company.workingdaysPerMonth) {
			workingdaysPerMonth++;
			int empCheck = (int) (Math.random() * 10 % 2);
			switch (empCheck) {
			case 0:
				workHours = 8;
				// System.out.println("Employee is present full time");
				break;
			case 1:
				workHours = 4;
				// System.out.println("Employee is present full time");
				break;
			default:
				workHours = 0;
				// System.out.println("Employee is absent");
				break;
			}
			totalWorkHours += workHours;
		}
		int empWage = totalWorkHours * company.wagePerHour;
		return empWage;
	}

	public static void main(String[] args) {
		System.out.println("Employee Wage = " + calculateEmpWage());
	}
}
