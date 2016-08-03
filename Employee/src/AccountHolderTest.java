/***** Rajesh Azmeera
 * 01/30/2016
 * AccountHolder.java
 * ITMD 510 - LAB 1
 */


/***************** A complete JAVA Program that creates bank account information
 * and executes various transaction details for their clients ******************/


/*********  java. contains several convenient standard methods 
 * such as Scanner, DateFormat, Calendar etc ****/

import java.util.Scanner;  // package java.util.Scanner allows to create Scanner object to read system input
import java.text.SimpleDateFormat; /** package allows to convert strings with date and/or time 
information so that it appears in your desired format ****/

import java.util.Calendar;   

public class AccountHolderTest { // class name AccountHolderTest

	public static void main(String[] args) { 
		
		/* main function  with array of strings as parameters, 
		 * static method is to access with out creating objects ******/
		

		double initbalance;
		double deposit;
		double withdrawl;
		double rateUpdate;
		/*** define class variables *****/
		
		Scanner scan = new Scanner(System.in);   // standard Scanner function to prompt user for input
        System.out.println("enter Initiabl balance Amount: ");   //user prompt to enter initial Amount
		initbalance = scan.nextDouble();  // Read userinput inital balance to variable initbalance
		  
		AccountHolder accountHolder = new AccountHolder();    // AccountHolder instance initialization
		accountHolder.AccountHolder(initbalance); 
		
		/** instantiate construct variable to initialize initial balance ****/
		                                             

		System.out.println("enter deposit amount: ");    // user prompt to enter deposit
		deposit = scan.nextDouble();     // read user input deposit to variable deposit
		accountHolder.deposit(deposit);   // call deposit function
		
		System.out.println("enter withdrawl amount: ");  // user prompt to withdraw amount
		withdrawl = scan.nextDouble();    // read withdraw balance to variable withdrawl
		accountHolder.withdrawal(withdrawl);    // call withdrawl function
		
		/**** Rate of Interest should be 
		 * greater than 0.0 and less than 1.0: ******/
		
		boolean flag = true;
		while (flag) {
			System.out.println("Enter rate of interest: "); //user prompt to enter Rate of Interest
			rateUpdate = scan.nextDouble(); // Read Rate of Interest
			
			if (rateUpdate >= 0.0 && rateUpdate <= 1.0) { // Rate of Interest should be > 0.0 && < 1.0
				flag = false;
				AccountHolder.modifyMonthlyInterest(rateUpdate);
			} else {
				System.out.println("Rate of Interest should be greater than 0.0 and less than 1.0: ");
				flag = true;
			}
		}

		 accountHolder.monthlyInterest(); // call monthlyInterest function
		// System.out.println(accountHolder.toString());
		System.out.println("After setting interest rate to .05 "); 
		AccountHolder.modifyMonthlyInterest(0.05);
		/** print current date, time and name of student ****/
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());  
		System.out.println("Cur dt=" + timeStamp + "\nProgrammed by Rajesh Azmeera Student\n");


			}
}
	
