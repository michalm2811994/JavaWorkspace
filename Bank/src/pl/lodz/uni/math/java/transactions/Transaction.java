package pl.lodz.uni.math.java.transactions;

import java.util.Date;

import pl.lodz.uni.math.java.bankData.Account;


public class Transaction {

	protected String transactionType;
	protected Account senderAccount;
	protected double amount;
	protected boolean status = false;
	protected static int transactionIdCounter = 0;
	protected int transactionId;
	protected Date transactionDate;
	protected double balanceAfterTransaction;
	
	protected void doTransaction() {
		
	}
	
	public void showTransaction() {
		
		System.out.println(this.transactionDate);
		System.out.println("Transaction ID - " + this.transactionId);
		System.out.println("Transaction type - " + this.transactionType);
		System.out.println("Transaction status - " + this.status);
		System.out.println("Amount - " + this.amount);
		System.out.println("Account balance after transaction - " + this.balanceAfterTransaction);
		
	}

}