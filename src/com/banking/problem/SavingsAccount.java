package com.banking.problem;

import java.util.Scanner;

public class SavingsAccount {
	// instance variables.
	static double annualIntrestRate;
	private double savingsBalance;

	static Scanner input = new Scanner(System.in);

	/*** Parameterized Constructor ***/
	public SavingsAccount(double savingsBalance) {
		super();
		this.savingsBalance = savingsBalance;
	}

	/*** Getter and Setter methods for savingsBalance. ***/
	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	/*** Getter and Setter methods for annualIntrestRate. ***/
	public static double getAnnualIntrestRate() {
		return annualIntrestRate;
	}

	public static void setAnnualIntrestRate(double annualIntrestRate) {
		SavingsAccount.annualIntrestRate = annualIntrestRate;
	}

	/*** Calculate Monthly Intrest Rate and add Intrest to savingsBalance ***/
	public double calculateMonthlyIntrest() {
		savingsBalance = savingsBalance + (savingsBalance * annualIntrestRate) / 100 * 12;
		return savingsBalance;
	}

	/*** Modify Intrest Rate and sets annual intrest rate for all savers. ***/
	public static void modifyIntrestRate() {
		System.out.print("Enter Annual Intrest Rate for all savers :- ");
		double enterIntrestRate = input.nextDouble();
		setAnnualIntrestRate(enterIntrestRate); // setting annualIntrestRate.
	}
}
