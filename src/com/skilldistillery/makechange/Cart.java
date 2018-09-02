package com.skilldistillery.makechange;

//import java.util.Scanner;

public class Cart {
	double cart [] = {};
	int i;
	double newItem;
	
	public void saveCart (double item) {
		 newItem = item;
		for( i = 0; i < cart.length; i++) {
			cart[i] = newItem;
			System.out.println("hello");
		}
		i++;
	}
	public void showCart (double cart []) {
		for (int i = 0; i < cart.length; i++) {
			System.out.println(cart[i]);
		}
	}
	
	

}
