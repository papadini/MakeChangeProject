package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello shopper, enter price of your item.");
		double price = itemPrice();
		System.out.print("Next, enter dollar amount: $");
		double userMoney = kb.nextDouble();
		notEnoughOrEqual(userMoney, price);
		double change = (userMoney - price);

		//Register register = new Register();
		//register.checkMoney(change);
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
