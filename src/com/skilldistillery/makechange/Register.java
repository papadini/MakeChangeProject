package com.skilldistillery.makechange;

public class Register {
	double newAmt;


	public void checkMoney(double amount) {
		amount = newAmt;
		System.out.println("Your change is: ");
		if (newAmt >= 20) {
			newAmt = (amount % 20);
			int twentyCount = (int) ((amount - newAmt) / 20);
			System.out.println("Twenties: " + twentyCount); // amount of 20s in change
			amount = amount - (twentyCount * 20);
		}
		if (newAmt >= 10) {
			newAmt = (amount % 10);
			int tenCount = (int) ((amount - newAmt) / 10);
			System.out.println("Tens: " + tenCount); // amount of 10s in change
			amount = amount - (tenCount * 10);
		}
		if (newAmt >= 5) {
			newAmt = (amount % 5);
			int fiveCount = (int) ((amount - newAmt) / 5);
			System.out.println("Fives: " + fiveCount); // amount of 5s in change
			amount = amount - (fiveCount * 5);
		}
		if (newAmt >= 1) {
			newAmt = (amount % 1);
			int oneCount = (int) (amount - newAmt);
			System.out.println("ones: " + oneCount); // amount of 1s in change
			amount = amount - (oneCount * 1);
		}
		if (newAmt >= .25) {
			newAmt = (amount % .25);
			int quarterCount = (int) ((amount - newAmt) / .25);
			System.out.println("Quaters: " + quarterCount); // amount of .25 in change
			amount = amount - (quarterCount * .25);
		}
		if (newAmt >= .10) {
			newAmt = (amount % .10);
			int dimeCount = (int) ((amount - newAmt) / .10);
			System.out.println("dims: " + dimeCount); // amount of .10 in change
			amount = amount - (dimeCount * .10);
		}
		if (newAmt >= .049) {
			if (newAmt >= .05) {
				newAmt = (amount % .05);
				int nickelCount = (int) ((amount - newAmt) / .05);
				System.out.println("nickels: " + nickelCount); // amount of .5 in change
				amount = amount - (nickelCount * .05);
			} else {
				System.out.println("nickels: 1");
				return;
			}
		}
		if (newAmt >= .009) {
			if (newAmt >= .01) {
				newAmt = (amount % .01);
				int pennyCount = (int) ((amount - newAmt) / .01);
				System.out.println("pennies: " + pennyCount); // amount of .01 in change
			} else {
				System.out.println("pennies: 1");
			}
		}

	}	

}


