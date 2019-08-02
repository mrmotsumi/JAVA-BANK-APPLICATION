package com.itsolutions;

import java.util.Scanner;

public class Main {
	
	private static  Scanner sc = new Scanner(System.in);
	
	private static Account acc=null;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loginmenu();
		
	}
	
	private static void loginmenu() 
	{
		do {
			System.out.println("Select Approprite action from menu below");
			System.out.println("1) Login  2) New Account");
			int input = sc.nextInt();

			switch(input) 
			{
			case 1:
				System.out.println("Enter your Account pin ");
				
				int pin = sc.nextInt();
				
				acc = AccountRepository.AuthenticateAccount(pin);
				
				if(acc != null) 
				{
					mainmenu();
				}else 
				{
					System.out.println("Account Not Fount ");
				}
				break;
				
			case 2:
				AccountRepository.NewAccount();
				break;
				default:
					System.out.println("Invalid Input ");

					break;
			}
			
			
		}while(true);
		
	}
	
	private static void mainmenu() 
	{
		System.out.println("Welcome to Codebase Bank");
		System.out.println();
		
		do 
		{
			System.out.println("Choose from menu Below");
			System.out.println();

			System.out.println("1) Deposit  2) Withdraw");
			System.out.println();
			System.out.println("3) Balance  4) logout");
			int choice = sc.nextInt();



			
			switch(choice) 
			{
			
			case 1:
				AccountRepository.accDeposit(acc);
				break;
			case 2:
				AccountRepository.accwithDraw(acc);

				break;
			case 3:
				AccountRepository.accBalance(acc);
				break;
			case 4:
				loginmenu();
				break;
			default:
					System.out.println("Enter choice from the menu");
				break;
			}
			

			
		}while(true);
	}
	
}
