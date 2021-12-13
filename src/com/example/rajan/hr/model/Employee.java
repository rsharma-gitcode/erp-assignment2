package com.example.rajan.hr.model;

import java.time.LocalDate;

public class Employee {
	private static final int FullTimeHoursPerWeekCompanyPolicy = 40;
	private int id;
	private boolean managerFlag;
	private String name;
	private LocalDate dateHired;
	private int minMandatoryWorkingHoursPerWeek;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isManagerFlag() {
		return managerFlag;
	}
	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}	

	public int getMinMandatoryWorkingHoursPerWeek() {
		return minMandatoryWorkingHoursPerWeek;
	}
	public void setMinMandatoryWorkingHoursPerWeek(int minMandatoryWorkingHoursPerWeek) {
		this.minMandatoryWorkingHoursPerWeek = minMandatoryWorkingHoursPerWeek;
	}
	boolean isPartTime() {

		return minMandatoryWorkingHoursPerWeek < FullTimeHoursPerWeekCompanyPolicy;

	}

}
