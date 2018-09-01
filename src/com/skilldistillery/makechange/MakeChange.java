package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {
	// multiple price of item and users money by 100 the  turn back into change.

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//The user is prompted asking for the price of the item.
		System.out.println("Hello shopper, enter price of your item.");
		System.out.print("Item Price: $");
		double itemPrice = kb.nextDouble();
		System.out.print("Next, enter dollar amount: $");
		double userMoney = kb.nextDouble();
//		double itemPrice = 9.99;
//		double userMoney = 20.00;		// change = 2x $20, 1 x $10, 0 x $5, 2 x $1, 1 x 25c, 2x 10c,0x5c, 3x1c
		
		
		if ( userMoney < itemPrice ) {
			System.out.println("Sorry, that is not enough.");
			return;
		}
		double change = Math.round((userMoney - itemPrice)*100.00)/100.00;
		
		Register register = new Register();
		double newAmt = register.changeMoney(change);
		register.checkMoney(newAmt);
		
		
		kb.close();
		

	}

}
