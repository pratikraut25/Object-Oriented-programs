package com.bridelabz.accountmanagement;

import java.util.*;

public class Account {

	Scanner sc = new Scanner(System.in);

	static String name;
	private static int balance = 10000;

	public void viewBalnce() {
		System.out.println(balance); // show the balance
	}
	public void addBalnce() {
		System.out.println("Please enter the valid amount to add : ");
		int amount = sc.nextInt(); 

		balance = balance + amount;// adding amount to balance

		System.out.println("The updated account balance is : " + balance);
	}
	public void withdrawBalance() {
		System.out.println("Enter the amount to be withdrawn : ");
		int amount = sc.nextInt();
		if (amount <= 0) {
			System.out.println("Enter valid amount for withdraw : ");

		} else if (amount <= balance) {
			System.out.println("withdrawn is under process \nWithdrawn process is successfull..!!");
			balance = balance - amount; // substracting amount to balance
			System.out.println("Updated balance is = " + balance);
		} else {
			System.out.println("Insufficient balance....!!");
		}
	}

}