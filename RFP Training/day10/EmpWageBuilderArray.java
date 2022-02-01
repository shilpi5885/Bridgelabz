package com.bridgelabz.demo;

public class EmpWageBuilderArray {

	public int numOfCompany = 0;
	public CompanyEmpWage[] companyEmpWageArray;

	public EmpWageBuilderArray() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}

	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,
				maxHoursPerMonth, maxHoursPerMonth);
		numOfCompany++;
	}

	public void computeEmpWage() {
		for (int i = 0; i < numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		System.out.println("Employee Wage Computaion Program On Master Branch");

		int totalWorkHours = 0, workingdaysPerMonth = 0, workHours = 0;

		while (totalWorkHours <= companyEmpWage.maxHoursPerMonth
				&& workingdaysPerMonth < companyEmpWage.numOfWorkingDays) {
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
		int empWage = totalWorkHours * companyEmpWage.empRatePerHour;
		return empWage;
	}

	public static void main(String[] args) {
		EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
		empWageBuilder.addCompanyEmpWage("Amazon", 30, 5, 12);
		empWageBuilder.computeEmpWage();
	}

}
