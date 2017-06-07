package pl.lodz.uni.math.java;

import pl.lodz.uni.math.java.bankData.*;
import pl.lodz.uni.math.java.transactions.*;

public class Main {

	public static void main(String[] args) {
		
		Bank gtAccount = Bank.getInstance();
		Client newClient;
		Account newAccount;
		Transaction operation;
		
		newClient = new Client(gtAccount);
		newAccount = new Account(newClient);
		newAccount = new Account(newClient);

		operation = new Deposit(newAccount, 1220);
		operation = new Withdrawal(newAccount, 100);
		
		newClient = new Client(gtAccount);
		newAccount = new Account(newClient);	
		
		operation = new Deposit(newAccount, 1000);
		operation = new Withdrawal(newAccount, 500);
		
		newClient = gtAccount.clientList.get(1);
		newAccount = newClient.accountList.get(0);
		
		gtAccount.showClientList();
		newClient.showAccountList();
		newAccount.showTransactionHistory();

	}
	
}
