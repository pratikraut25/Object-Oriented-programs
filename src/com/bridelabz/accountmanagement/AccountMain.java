package com.bridelabz.accountmanagement;

import java.util.*;

public class AccountMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. To view current balance \n2. To add balance \n3. To withdraw balance");
		Account account = new Account();
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("The balance is:");
			account.viewBalnce();
			break;
		case 2:
			account.addBalnce();
			break;
		case 3:
			account.withdrawBalance();
			break;
		}
	}
}