package pl.lodz.uni.math.java.bankData;

import java.util.ArrayList;
import java.util.List;

public class Client {

	protected int clientId;
	protected String firstName;
	protected String lastName;
	protected String city;
	protected String state;
	protected String zip;
	protected String street;
	protected String streetNumber;
	protected String phoneNumber;
	protected static int clientCounter = 0;
	public  List<Account> accountList;
	
	public Client (Bank bank) {
		
		clientCounter++;
		addDetails();
		this.accountList = new ArrayList<Account>();
		bank.clientList.add(this);
		
	}
	
	public void addDetails() {
		
		this.clientId = clientCounter;
	//	this.firstName = "Jan";
	//	this.lastName = "Kowalski";
	//	this.city = "Warsaw";
	//	this.state = "Mazowieckie";
	//	this.zip = "01-003";
	//	this.street = "Prosta";
	//	this.streetNumber = "12";
	//	this.phoneNumber = "999 444 123";
		
	}
	
	public void showDetails() {
		
		System.out.println("Client ID - " + this.clientId);
	//	System.out.println("Client Name - " + this.firstName + " " + this.lastName);
	//	System.out.println("Phone number -  - " + this.phoneNumber);
	//	System.out.println("Address - " + this.city + " " + this.zip + " " + this.state + ", " + this.street + " " + this.streetNumber + "\n");
		
	}
	
	public void showAccountList() {
		
		System.out.println("Client ID - " + this.clientId);
		System.out.println("Account list: ");
		for(int i = 0; i < this.accountList.size(); i++) {
			
			this.accountList.get(i).showAccount();
			
		}
		
		System.out.println();
		
	}
	
}