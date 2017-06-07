package pl.lodz.uni.math.java.transactions;

import pl.lodz.uni.math.java.bankData.Account;

import java.util.Date;


public class Withdrawal extends Transaction {
	
	public Withdrawal(Account senderAccount, double amount) {
		
		transactionIdCounter++;
		this.transactionId = transactionIdCounter;
		this.amount = amount;
		this.transactionType = "Withdrawal";
		this.transactionDate = new Date();
		this.senderAccount = senderAccount;
		doTransaction();
		senderAccount.transactionHistory.add(this);
		
	}
	
	@Override 
	protected void doTransaction() {
		
		if (senderAccount.accountBalance >= this.amount) {
		
			this.senderAccount.accountBalance  -= this.amount;
			this.status = true;
			this.balanceAfterTransaction = this.senderAccount.accountBalance;
			
		}
		
	}
	
}
