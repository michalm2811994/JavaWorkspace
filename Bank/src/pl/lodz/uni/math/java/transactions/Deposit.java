package pl.lodz.uni.math.java.transactions;

import java.util.Date;

import pl.lodz.uni.math.java.bankData.Account;


public class Deposit extends Transaction {
	
	public Deposit(Account senderAccount, double amount) {
		
		transactionIdCounter++;
		this.transactionId = transactionIdCounter;
		this.amount = amount;
		this.transactionType = "Deposit";
		this.transactionDate = new Date();
		this.senderAccount = senderAccount;
		doTransaction();
		senderAccount.transactionHistory.add(this);
		
	}
	
	@Override 
	protected void doTransaction() {
	
		this.senderAccount.accountBalance  += this.amount;
		this.status = true;
		this.balanceAfterTransaction = this.senderAccount.accountBalance;
		
	}

}
