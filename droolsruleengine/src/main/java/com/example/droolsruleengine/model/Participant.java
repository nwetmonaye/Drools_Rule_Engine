package com.example.droolsruleengine.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Participant {

 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public long getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}
	public long getExistingDebt() {
		return existingDebt;
	}
	public void setExistingDebt(long existingDebt) {
		this.existingDebt = existingDebt;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
private String name;
 private int age;
 private int creditScore;
 private long annualSalary;
 private long existingDebt;
 private long loanAmount;
}