package BankingSystem;

import java.util.Date;

// Class to implement a user account
// Created on 25 October 2024
// Updated on 30 September 2025
public class ATMAccount {
	
	// Data fields
	private int id;
	private String name;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreated = new Date(2024, 9, 25, 14, 05, 33);
	
	// Default constructor
	public ATMAccount() {
		this(1125, "Teleki", 50000.00, 4.6 );
	}
	
	// Constructor to create an account for the specified values
	public ATMAccount(int id, String name, double balance, double annualInterestRate) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	// Get id
	public int getId() {
		return this.id;
	}
	
	// Get name
	public String getName() {
		return this.name;
	}
	
	// Get balance
	public double getBalance() {
		return this.balance;
	}
	 
	// Get annual interest rate
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	// Get the date on which the account was created
	public Date getDateCreated(){
		return this.dateCreated;
	}
	
	// Get the monthly interest rate
	public double getMonthlyInterestRate() {
		double monthlyInterestRate = this.annualInterestRate / 12;
		return monthlyInterestRate;
	}
	
	// Modify the id
	public void setId(int newId) {
		this.id = newId;
	}
	
	// Modify the balance
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	// Modify the annual interest rate
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		this.annualInterestRate = newAnnualInterestRate;
	}
	
	// Display money withdrew
	public void withdraw(double withdraw) {
		this.balance = this.balance - withdraw;
	}
	
	 
	// Display money deposited
	public void deposit(double deposit) {
		this.balance = this.balance  + deposit;
	}
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
}
