package weka_atm;

import java.util.Scanner;

public class SimpleATM {

	
	private double balance;
	
	//constructor
	public SimpleATM(double initialBalance) 
	{
		balance = initialBalance;
	}
	
	//deposit money
	public void deposit(double amount)
	{
		if(amount > 0)
		{
			balance += amount;
			System.out.println("Successfully deposited: TSh" + amount);
			
		}
		else {
			System.out.println("Invalid Amount");
		}
		
	}
	
	
	//withdraw money
	public void withdraw(double amount)
	{
		if(amount > 0)
		{
			if(amount <= balance)
			{
				balance -= amount;
				System.out.println("Successfully withdraw: TSh" + amount);
			}
			else {
				System.out.println("Insufficient balance");
			}
		}
		else {
			System.out.println("Invalid withdraw amount");
		}
	}
	
	
	// check balance
	public void checkBalance() 
	{
		System.out.println("Your current balance is: " + balance);
	}
	
	
	public static void main(String[] agrs)
	{
		Scanner scanner = new Scanner(System.in); //get user inputs
		SimpleATM atm = new SimpleATM(200000.0); //initial balance
		
		//display menu
		while(true)
		{
			
			 System.out.println("\nWelcome to Weka ATM");
	         System.out.println("1. Check Balance");
	         System.out.println("2. Deposit Money");
	         System.out.println("3. Withdraw Money");
	         System.out.println("4. Exit");

	         System.out.print("Choose an option: ");
	         
	         int choice = scanner.nextInt();
	         
	         switch(choice) 
	         {
	         
	         case 1:
                 atm.checkBalance();
                 break;
                 
             case 2:
                 System.out.print("Enter amount to deposit: TSH");
                 double depositAmount = scanner.nextDouble();
                 atm.deposit(depositAmount);
                 break;
                 
             case 3:
                 System.out.print("Enter amount to withdraw: TSH");
                 double withdrawAmount = scanner.nextDouble();
                 atm.withdraw(withdrawAmount);
                 break;
                 
             case 4:
                 System.out.println("Thank you for using Weka ATM. Goodbye!");
                 scanner.close();
                 return;
                 
             default:
                 System.out.println("Invalid option. Please try again.");
	         
	         }
			
			
			
		}
		
	}
	

}
