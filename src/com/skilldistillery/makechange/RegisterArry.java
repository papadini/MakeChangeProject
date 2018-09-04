package com.skilldistillery.makechange;

import java.text.DecimalFormat;

public class RegisterArry {
	double newAmt;
	DecimalFormat df = new DecimalFormat("00.00");

	public void moneyArray(double amount) {
		newAmt = amount * 100;
		int moneyCount;
		double[] moneyArr = { 2000, 1000, 500, 100, 25, 10, 5, .9 };
		String[] nameArr = { "Twenties: ", "Tens: ", "Fives: ", "Ones: ", "Quarters: ", "Dimes: ", "Nickels: ",
				"Pennies: " };

		for (int i = 0; i < moneyArr.length; i++) {
			amount = newAmt;
			if (newAmt >= moneyArr[i]) {
				newAmt = (amount % moneyArr[i]);
				moneyCount = (int) ((amount - newAmt) / moneyArr[i]);
				System.out.println(nameArr[i] + moneyCount ); 
				amount = amount - (moneyCount * moneyArr[i]);
			}
		}

	}

}
