package BankingSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// Begin Program Execution
		System.out.println("\n---------- Begin Program Execution ----------\n");
		ATMAccount account1 = new ATMAccount(1121, "Teleki Mahlalela", 20000, 3.5);
		ATMAccount account2 = new ATMAccount(1125, "Lerato Malatji", 50000, 2.8);
		ATMAccount account3 = new ATMAccount(1136, "Khosi Nkhosi", 100000, 5.2);
		
		System.out.println("WELCOME TO MANKWENG ATM MACHINE.\n");
		
		// Enter user-specific account id
		System.out.print("Enter the account ID: ");
		int id = input.nextInt();
		input.nextLine();
		
		// Enter the user name
		System.out.print("Enter the account user name: ");
		String name = input.nextLine();
		
		// if account id and name correspond to account 1
		if (id == account1.getId() && name.equalsIgnoreCase(account1.getName())) {
			System.out.println("Welcome, " + account1.getName() + ". How can we assist you today?");
			
			int choice;
			
			do {
					
				// Provide the user with a set of options to choose from
				System.out.println("\t1. Get balance\n\t2. Deposit money into account\n\t3. Withdraw money from account\n\t4. Get monthly interest rate\n\t5. Get account details\n\t0. Exit");
				
				// Prompt the user to enter an option of choice
				System.out.print("Enter the option of your choice: ");
				choice = input.nextInt();
				
				if(choice == 1) {
					System.out.println("Your current balance is R" + account1.getBalance() + "\n");
				}
				
				else if(choice == 2) {
					System.out.print("Enter the amount of money you want to deposit: " );
					double deposit = input.nextDouble();
					if(deposit < 0) {
						System.out.println("Cannot deposit a negative amount into account!!! Re-enter amount.");
					}
					
					else {
					account1.deposit(deposit);
					System.out.print("You have successfully deposited R" + deposit + " Your new balance is R" + account1.getBalance());
					System.out.println("\n");
					}
				}
				
				else if(choice == 3) {
					System.out.print("Enter the amount of money you want to withdraw: ");
					double withdraw = input.nextDouble();
					if(withdraw > account1.getBalance()) {
						System.out.println("Cannot withdraw money larger than the current balance!!! Re-enter amount.\n" );
					}
					else {
					account1.withdraw(withdraw);
					System.out.print("You have successfully withdrawn R" + withdraw + ".");
					System.out.println("Your new balance is R" + account1.getBalance() + "\n");
					}
				}
				else if(choice == 4) {
					System.out.println("The monthly interest rate is " + account1.getMonthlyInterestRate() + "%\n");
				}
				
				else if(choice == 5) {
					System.out.println("========== Account Details ==========");
					System.out.println("Created on: " + account1.getDateCreated());
					System.out.println("ID: " + account1.getId());
					System.out.println("Account user: " + account1.getName());
					System.out.println("Current balance: "  + account1.getBalance());
					System.out.println("Annul Interest Rate: " + account1.getAnnualInterestRate());
					System.out.println("Monthly Interest Rate: " + account1.getMonthlyInterestRate());
					System.out.println("======================================\n");
				}
				else if(choice == 0) {
					System.out.println("Thank you for using this account. Bye and we hope to see you soon.\n");
					System.out.println("---------- Program Executed Successfully ----------");
				}
				
				else {
					System.out.println("Option not available!!! Choose an option from the provided set of options\n");
				}
				
				
			} 
			
		while(choice != 0);
			
		}
		
		
		
		// If account id corresponds to account 2
		else if (id == account2.getId()) {
			System.out.println("Welcome, " + account2.getName() + ". How can we assist you today?");
			
			int choice;
			
			do {
					
				// Provide the user with a set of options to choose from
				System.out.println("\t1. Get balance\n\t2. Deposit money into account\n\t3. Withdraw money from account\n\t4. Get monthly interest rate\n\t5. Get account details\n\t0. Exit");
				
				// Prompt the user to enter an option of choice
				System.out.print("Enter the option of your choice: ");
				choice = input.nextInt();
				
				if(choice == 1) {
					System.out.println("Your current balance is R" + account2.getBalance() + "\n");
				}
				
				else if(choice == 2) {
					System.out.print("Enter the amount of money you want to deposit: " );
					double deposit = input.nextDouble();
					if(deposit < 0) {
						System.out.println("Cannot deposit a negative amount into account!!! Re-enter amount.");
					}
					
					else {
					account2.deposit(deposit);
					System.out.print("You have successfully deposited R" + deposit + " Your new balance is R" + account2.getBalance());
					System.out.println("\n");
					}
				}
				
				else if(choice == 3) {
					System.out.print("Enter the amount of money you want to withdraw: ");
					double withdraw = input.nextDouble();
					if(withdraw > account2.getBalance()) {
						System.out.println("Cannot withdraw money larger than the current balance!!! Re-enter amount.\n" );
					}
					else {
					account1.withdraw(withdraw);
					System.out.print("You have successfully withdrawn R" + withdraw + ".");
					System.out.println("Your new balance is R" + account2.getBalance() + "\n");
					}
				}
				else if(choice == 4) {
					System.out.println("The monthly interest rate is " + account2.getMonthlyInterestRate() + "%\n");
				}
				
				else if(choice == 5) {
					System.out.println("========== Account Details ==========");
					System.out.println("Created on: " + account2.getDateCreated());
					System.out.println("ID: " + account2.getId());
					System.out.println("Account user: " + account2.getName());
					System.out.println("Current balance: "  + account2.getBalance());
					System.out.println("Annul Interest Rate: " + account2.getAnnualInterestRate());
					System.out.println("Monthly Interest Rate: " + account2.getMonthlyInterestRate());
					System.out.println("======================================\n");
				}
				else if(choice == 0) {
					System.out.println("Thank you for using this account. Bye and we hope to see you soon.\n");
					System.out.println("---------- Program Executed Successfully ----------");
				}
				
				else {
					System.out.println("Option not available!!! Choose an option from the provided set of options\n");
				}
				
			}
			
		while(choice != 0);
			System.out.println("Account summary: ");
			
		}
		
		// If account id corresponds to account 3
	else if (id == account3.getId()) {
				System.out.println("Welcome, " + account3.getName() + ". How can we assist you today?");
			
			int choice;
			
			do {
					
				// Provide the user with a set of options to choose from
				System.out.println("\t1. Get balance\n\t2. Deposit money into account\n\t3. Withdraw money from account\n\t4. Get monthly interest rate\n\t5. Get account details\n\t0. Exit");
				
				// Prompt the user to enter an option of choice
				System.out.print("Enter the option of your choice: ");
				choice = input.nextInt();
				
				if(choice == 1) {
					System.out.println("Your current balance is R" + account3.getBalance() + "\n");
				}
				
				else if(choice == 2) {
					System.out.print("Enter the amount of money you want to deposit: " );
					double deposit = input.nextDouble();
					if(deposit < 0) {
						System.out.println("Cannot deposit a negative amount into account!!! Re-enter amount.");
					}
					
					else {
					account3.deposit(deposit);
					System.out.print("You have successfully deposited R" + deposit + " Your new balance is R" + account3.getBalance());
					System.out.println("\n");
					}
				}
				
				else if(choice == 3) {
					System.out.print("Enter the amount of money you want to withdraw: ");
					double withdraw = input.nextDouble();
					if(withdraw > account3.getBalance()) {
						System.out.println("Cannot withdraw money larger than the current balance!!! Re-enter amount.\n" );
					}
					else {
					account3.withdraw(withdraw);
					System.out.print("You have successfully withdrawn R" + withdraw + ".");
					System.out.println("Your new balance is R" + account3.getBalance() + "\n");
					}
				}
				else if(choice == 4) {
					System.out.println("The monthly interest rate is " + account3.getMonthlyInterestRate() + "%\n");
				}
				
				else if(choice == 5) {
					System.out.println("========== Account Details ==========");
					System.out.println("Created on: " + account3.getDateCreated());
					System.out.println("ID: " + account3.getId());
					System.out.println("Account user: " + account3.getName());
					System.out.println("Current balance: "  + account3.getBalance());
					System.out.println("Annul Interest Rate: " + account3.getAnnualInterestRate());
					System.out.println("Monthly Interest Rate : " + account3.getMonthlyInterestRate());
					System.out.println("======================================\n");
				}
				else if(choice == 0) {
					System.out.println("Thank you for using this account. Bye and we hope to see you soon.\n");
					System.out.println("---------- Program Executed Successfully ----------");
				}
				
			  	else {
					System.out.println("Option not available!!! Choose an option from the provided set of options\n");
				}
				
			}
			
		while(choice != 0);
		}
		
		// If account id is incorrect
	else {
		System.out.println("Incorrect account ID or name. Please make sure that the ID and/or name is/are correct");
	}
		
		
		
		
		
			
			
		
		
		input.close();
	}
	
}
