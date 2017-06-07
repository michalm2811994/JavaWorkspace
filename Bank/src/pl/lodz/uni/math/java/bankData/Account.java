package pl.lodz.uni.math.java.bankData;

import pl.lodz.uni.math.java.transactions.Transaction;
import java.util.ArrayList;
import java.util.List;

public class Account {

	protected static int accountNumberCounter = 1441002500;
	protected long accountNumber;
	public double accountBalance;
	protected Client accountOwner;
	public List<Transaction> transactionHistory;
	
	public Account(Client client) {
		
		transactionHistory = new ArrayList<Transaction>();
		accountNumberCounter++;
		this.accountOwner = client;
		accountNumber = accountNumberCounter;
		accountOwner.accountList.add(this);
		
	}
	
	public void showAccount() {
		
		System.out.println(this.accountNumber + " - " + accountBalance + " PLN");
		
	}
	
	public void showTransactionHistory() {
		
		
		this.showAccount();
		System.out.println("Transaction History: ");
		System.out.println();
		for(int i = 0; i < this.transactionHistory.size(); i++) {
			
			this.transactionHistory.get(i).showTransaction();
			
			System.out.println();
		}
		
	}	

}