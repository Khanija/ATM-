package com.project;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation op = new Technique();
		
		int atmnumber = 98765;
		int pin = 9898;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM machine!!");
		System.out.println("Enter your ATM number : ");
		int AtmNumber = sc.nextInt();
		System.out.println("Enter your pin : ");
		int PinNumber = sc.nextInt();
		
		if((AtmNumber==atmnumber)&&(PinNumber==pin))
		{
			while(true)
			{
				System.out.println("1.Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.Mini statement\n5.Exit");
				System.out.println("Enter your choice ");
				int ch = sc.nextInt();
				if(ch==1) {
					op.AvailableBalance();
					
					
				}
				else if(ch==2) {
					System.out.println("Enter amount to withdraw : ");
					double WithDrawAmount = sc.nextDouble();
					op.WithDrawAmmount(WithDrawAmount);
					
					
				}
				else if(ch==3) {
					System.out.println("Enter Amount to deposit : ");
					double DepositAmount = sc.nextDouble();
					op.DepositAmount(DepositAmount);
					
					
				}
				else if(ch==4) {
					op.MiniStatement();
					
				}
				else if(ch==5) {
					System.out.println("Thankyou for using ATM!");
					System.out.println("Collect your ATM card");
					System.exit(0);
				}
				else {
					System.out.println("Please enter correct choice");
					
				}
			}
			
		}
		else
		{
			System.out.println("Incorrect ATM number or pin");
			System.exit(0);
		}
	}

}
