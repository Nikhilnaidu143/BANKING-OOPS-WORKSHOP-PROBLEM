package com.banking.problem;

public class SavingsAccountMain {

	public static void main(String[] args) {

		/** Creating objects by passing parameters in construtor. **/
		SavingsAccount saver_1 = new SavingsAccount(2000);
		SavingsAccount saver_2 = new SavingsAccount(3000);

		/**
		 * calling static modifyIntrestRate method to modify and set annualIntrestRate
		 * for 4%.
		 **/
		SavingsAccount.modifyIntrestRate();

		saver_1.calculateMonthlyIntrest(); // calling calculateMothlyIntrest method.
		saver_2.calculateMonthlyIntrest();

		/*** Printing new balance of saver_1 and saver_2 ***/
		System.out.println("Saver-1 New Balance :- " + saver_1.getSavingsBalance());        // Output :- 2960.0
		System.out.println("Saver-2 New Balance :- " + saver_2.getSavingsBalance() + "\n"); // Output :- 4440.0

		/**
		 * calling static modifyIntrestRate method to modify and set next month
		 * annualIntrestRates for 5%.
		 **/
		SavingsAccount.modifyIntrestRate();

		saver_1.calculateMonthlyIntrest(); // calling calculateMothlyIntrest method.
		saver_2.calculateMonthlyIntrest();

		/*** Printing new balance of saver_1 and saver_2 ***/
		System.out.println("Saver-1 Next Month New Balance :- " + saver_1.getSavingsBalance());        // Output :- 4736.0
		System.out.println("Saver-2 Next Month New Balance :- " + saver_2.getSavingsBalance() + "\n"); // Output :-7104.0
	}
}
