package com.skilldistillery.makechange;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("00.00");
		String answer;
		double total = 0.00, price = 0.00, tax, grandTotal;

		greeting();
		do {
			price = itemPrice();
			total = total + price;
			System.out.println("Want to enter another item or are you \"DONE\" ");
			answer = kb.next();
		} while (!answer.equals("DONE"));

		System.out.println("total: $" + total);
		System.out.print("Next, enter dollar amount: $");
		double userMoney = kb.nextDouble();
		notEnoughOrEqual(userMoney, total);
		double change = (userMoney - total);
		RegisterArry regArry = new RegisterArry(); // fix format to the change
		System.out.println("Change total: $" + df.format(change));
		regArry.moneyArray(change);

		kb.close();
	}

	public static void notEnoughOrEqual(double money, double price) {

		if (money < price) {
			System.out.println("Sorry, that is not enough.");
			return;
		} else if (money == price) {
			System.out.println("Wow exact change, you rock!");
		}
	}

	public static double itemPrice() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Item Price: $");
		double itemPrice = (double) (keyboard.nextDouble());
		// keyboard.close();

		return itemPrice;

	}

	public static void greeting() {
		System.out.println("Hello shopper, welcome to Papas Pantry!");
		System.out.println("You are about to enter the register, continue to enter ");
		System.out.println("items, after your all done type \"DONE\" and ");
		System.out.println("you will be given your total and asked to pay Papa!");
		System.out.println("Change will be provided down to the penny!");
		System.out.println("Thats Papa's Promise!");

	}

}
