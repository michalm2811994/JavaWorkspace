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

		
		operation = new Deposit(gtAccount.clientList.get(0).accountList.get(0), 1220);
		operation = new Withdrawal(gtAccount.clientList.get(0).accountList.get(0), 100);
		
		newClient = new Client(gtAccount);
		newAccount = new Account(newClient);	
		
		operation = new Deposit(gtAccount.clientList.get(1).accountList.get(0), 1000);
		operation = new Withdrawal(gtAccount.clientList.get(1).accountList.get(0), 50440);
		
		gtAccount.showClientList();
		gtAccount.clientList.get(0).showAccountList();
		gtAccount.clientList.get(1).showAccountList();
		gtAccount.clientList.get(1).accountList.get(0).showTransactionHistory();

	}
	
}
