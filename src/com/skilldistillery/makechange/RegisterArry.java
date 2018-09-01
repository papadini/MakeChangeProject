package com.skilldistillery.makechange;

import java.text.DecimalFormat;

public class RegisterArry {
	double newAmt;
	DecimalFormat df = new DecimalFormat("###.##");
	
	public void moneyArray(double amount) {
		 newAmt = amount;
		double[] moneyArr = { 20, 10, 5, 1, .25, .10, .05, .01 };
		String[] nameArr = { "Twenty: ", "Ten: ", "Fives: ", "Ones: ", "Quarters: ",
				"Dimes: ", "Nickels: ", "Pennies: " };

		for (int i = 0; i < moneyArr.length; i++) {
			amount = newAmt;
			if (newAmt >= moneyArr[i]) {
				newAmt = (amount % moneyArr[i]);
				int moneyCount = (int) ((amount - newAmt) / moneyArr[i]);
				System.out.println(nameArr[i] + moneyCount); // amount of 20s in change
				amount = amount - (moneyCount * moneyArr[i]);
			}
		}
		if (amount <= .5 && amount > .01) {
			System.out.println("Nickels: 1");
		}
		if (amount <= .01 && amount > .008) {
			System.out.println("Pennies: 1");
		}

	}

}
