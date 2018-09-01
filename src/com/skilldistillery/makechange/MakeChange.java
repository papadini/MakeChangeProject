package com.skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello shopper, welcome to Papas Pantry!");
		System.out.println("You are about to enter the register, continue to enter ");
		System.out.println("items, after your all done type \"DONE\" and ");
		System.out.println("you will be given your total and asked to pay Papa!");
		System.out.println("Change will be provided down to the penny!");
		System.out.println("Thats Papa's Promise!");
		double total = 0.00, price = 0.00, tax, grandTotal;
		String answer;
		DecimalFormat df = new DecimalFormat("###.##");
		
		do {
			 price = itemPrice();
			total = total + price;
			System.out.println("Want to enter another item or are you \"DONE\" ");
			 answer = kb.next();
			
			
		} while (!answer.equals("DONE"));
		System.out.println("total: $" + total);
		tax = ((total * .08924)*100.0 ) / 100.00;
		System.out.println("tax: $" + df.format(tax));
		grandTotal = total + tax;
		System.out.println("Grand Total: $" + df.format(grandTotal));
		System.out.print("Next, enter dollar amount: $");
		double userMoney = kb.nextDouble();
		notEnoughOrEqual(userMoney, grandTotal);
		double change = (userMoney - grandTotal);
		RegisterArry regArry = new RegisterArry ();
		regArry.moneyArray(change);

		kb.close();
	}
	public static void notEnoughOrEqual (double money, double price) {
		
		if (money < price) {
			System.out.println("Sorry, that is not enough.");
			return;
		}
		else if (money == price ) {
			System.out.println("Wow exact change, you rock!");
		}
	}
	public static double itemPrice ( ) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Item Price: $");
		double itemPrice = keyboard.nextDouble();
		
		//keyboard.close();
		
		return itemPrice;
		
	}
	

}
