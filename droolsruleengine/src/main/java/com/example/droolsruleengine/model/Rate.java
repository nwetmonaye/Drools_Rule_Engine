package com.example.droolsruleengine.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate {

 public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public double getLoanRate() {
		return loanRate;
	}
	public void setLoanRate(double loanRate) {
		this.loanRate = loanRate;
	}
private String loanStatus;
 private double loanRate;
}