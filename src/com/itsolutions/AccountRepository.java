package com.itsolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class AccountRepository {
	

	private static Scanner sc = new Scanner(System.in);
	
	private static List<Account> acclist= new ArrayList<>();

	
	
	public static Account AuthenticateAccount(long pin) 
	{
		List<Account> accounts =acclist;
		
		if(!accounts.isEmpty()) {
		for(Account c: accounts) {
			
			if(c.getPin() == pin) 
			{
				return c;
			}else 
			{
				return null;

			}
		}
		}else 
		{
			System.out.println("No Record Found !");
		}
		return null;
		
	}
	public static void accDeposit(Account acc) 
	{
		
		printData(acc);
		System.out.println();
		System.out.println("Enter Amount to Deposit: ");
		double inputAmount = sc.nextDouble();
		
		double balance = acc.getBalance() + inputAmount;
		
		acc.setBalance(balance);
		
		System.out.println("successfully Deposited amount: " + inputAmount);
		System.out.println();
		
		printData(acc);
		

	}

	private static void printData(Account acc) {


		System.out.println("===================================");
		System.out.println("====Current Account information====");
		System.out.println("===================================");
		System.out.println("========Account Number: "+ acc.getAccNo() +"=====");
		System.out.println("===================================");
		System.out.println("=========Balance: "+ acc.getBalance() +"============");
		System.out.println("===================================");

		
	}

	public static void accwithDraw(Account acc) 
	{
		printData(acc);
		System.out.println();
		System.out.println("Enter Amount to Withdraw: ");
		double inputAmount = sc.nextDouble();
		
		if(inputAmount < acc.getBalance()) {
		
		double balance = acc.getBalance() - inputAmount;
		
		acc.setBalance(balance);
		System.out.println("Cash Withdrawal Successful: " + inputAmount);

		}else 
		{
			System.out.println("You are trying to withdraw \nmore than what you have in your account");

		}
		
		System.out.println();
		
		printData(acc);

	}
	
	public static void accBalance(Account acc) 
	{

		System.out.println("===================================");
		System.out.println("====Current Account information====");
		System.out.println("===================================");
		System.out.println("========Account Number: "+ acc.getAccNo() +"=====");
		System.out.println("===================================");
		System.out.println("=========Balance: "+ acc.getBalance() +"============");
		System.out.println("===================================");
	}
	
	
	
	public static void NewAccount() 
	{
		double intialbalance = 0.0;
		Account ac = new Account();
		
	   ac.setAccNo(generateAccNo());
	   ac.setPin(generatePin());
	   ac.setBalance(intialbalance);
	   acclist.add(ac);

	   System.out.println("Account was successfully created");
	   System.out.println();
	   System.out.println("Your Account Details are AccNo: "+ ac.getAccNo() + " Account Pin: " +ac.getPin());
	   
	}
	
	public static int generatePin() 
	{
		int pin =(int) (Math.random() * 1000 ) + 1000;
		
		return pin;
	}
	public static int generateAccNo() 
	{
		
		do{
			
			
			int generatedValue =(int) (Math.random() * 1000000 ) + 1000;
			System.out.println("Do you want to create new Account  \n (Y) OR (N) ? press (E) to Exit");
			String input = sc.next();
			switch(input) 
			{
			case "Y":
				return generatedValue;
			case "N":
				System.out.println("Account cannot be created");
				break;
			case "E":
				System.out.println("Main menu");

				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
		}while(true);
	}
	
}
