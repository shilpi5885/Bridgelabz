package com.bridgelabz.demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage {
	private int numOfCompany = 0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	public EmpWageBuilder() {
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		CompanyEmpWage companyEmpWage = new  CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company, companyEmpWage);
	}
	
	public void computeEmpWage() {
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);	
		}	
	}
	
	@Override
	public int getTotalWage(String company) {
		return companyToEmpWageMap.get(company).totalEmpWage;
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
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("Amazon", 30, 24, 80);
		empWageBuilder.computeEmpWage();
		System.out.println("Total wage for Amazon Company "+empWageBuilder.getTotalWage("Amazon"));
	}
}
	
