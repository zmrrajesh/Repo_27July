/** Rajesh Azmeera
 * 01/30/2016
 * AccountHolder.java
 * ITMD 510 - LAB 1
 */


import java.io.*;

/*********  java.io package contains classes that support input and output ***/

public class AccountHolder { // class AccountHolder

	
	double balance ; // Instance variable balance
	static double annualInterestRate = 0.04; // Instance variable annualInterestRate
	static double temp;

	public void AccountHolder(double balance) { // Initialize instance variables with constructor
		this.balance = balance;
		
		 if (balance < 0) {
			System.out.println("Initial balance can't be negative, Plese enter positive Bal"); // Initial balance should not be negative
			System.exit(0);}
		 else {
		  String bal = String.format("$%.2f", balance); // Print balance two digits after decimal points like 2000.00, 1234.00 etc
			System.out.println("Initial balance is set : " + bal);
			
			} // Print initial balance
	}
	 

	public void deposit(double depositAmount) { // deposit function

		this.balance += depositAmount; // add deposit to initial balance
		String bal = String.format("$%.2f", balance); // Print balance two digits after decimal points like 2000.00, 1234.00 etc
	  System.out.println("Current balance is :" + bal);
	  
	}

	public  void withdrawal(double withdrawl) { // Withdraw function
		// double original_balance = balance ;    
		balance = balance - withdrawl; // subtract withdraw amount from balance
		 
		/****** if balance is less than $100, don't allow withdraw , minimum balance should be maintained ****/
		
		if (balance <= 100) { 
			System.out.println(" withdrawl is not possible, Insufficient funds !!!!!");
			System.exit(0);
		}
		
		/* if balance is less than 500 deduct $50 from the balance
		 * 
		 */
		if(balance < 500) {
			balance = balance - 50; 
			String bal = String.format("$%.2f", balance);
			  System.out.println("Transaction fee 50$ deducted, Current balance is :" + bal);
		//  System.out.println("Transaction fee 50$ deducted, Current balance is :" + balance);
		} else  {
            
             // System.out.println("Current balance is:" + balance); 
		String bal = String.format("$%.2f", balance);
		System.out.println("current balance is  : " + bal);
		//balance = original_balance;
         }
	}
	

	public void monthlyInterest() {
		String bal = String.format("$%.2f", balance);
		System.out.println("Monthly Balances for one year " + "at interest rate" +" " + annualInterestRate);
		  System.out.println("Original Principle is " + bal);
		 int month = 1;
		 while (month < 13) { // 1 to 12 months
			 
			 balance += balance * (annualInterestRate / 12.0); // calculate monthly Interest and add to Principle amount
			
			/*** TableBuilder tb = new TableBuilder();
            tb.addRow("Base", "Month", "Principle Amount");
			tb.addRow("-----", "----", "----------------");
			System.out.println(tb.toString()); ***/
			
			 
			 String bal1 = String.format("$%.2f", balance);
			// System.out.println("Initial balance is set : " + bal);
			 
			 System.out.println("Month" + " " + month +"  " + bal1);
			month++;
		}
		temp = balance;
		
		
	}
	
	  
	public  static void modifyMonthlyInterest (double rateUpdate) { // Modify Monthly Interest
		 
	 annualInterestRate = rateUpdate;  
	  // monthlyInterest();
	  dummy(annualInterestRate);
	 }
	public static  void dummy(double rateOfInterest) { // Rate of interest 0.05
		// TODO Auto-generated method stub
	if (annualInterestRate == 0.05) {
		temp += temp * (annualInterestRate / 12.0); 
	 String updatedbalance = String.format("$%.2f",temp);	
	 System.out.println(updatedbalance);
		} 
	}
 
}	 
	
	 