package pl.lodz.uni.math.java.bankData;

import java.util.List;
import java.util.ArrayList;

public class Bank {
	
	private String name;
	private String city;
	private String state;
	private String zip;
	private String street;
	private String streetNumber;
	private static Bank instance = new Bank();
	public  List<Client> clientList;
	
	private Bank() {
		
		addDetails();	
		clientList = new ArrayList<Client>();
		
	}
	
	public static Bank getInstance() {
		
		return instance;
		
	}
	
	public void addDetails() {
		
		name = "GTAccount SA";
		city = "Warsaw";
		state = "Mazowieckie";
		zip = "01-002";
		street = "Fabryczna";
		streetNumber = "23";
		
	}
	
	public void showDetails() {
		
		System.out.println("\nBank Name - " + name);
		System.out.println("Address - " + city + " " + zip + " " + state + ", " + street + " " + streetNumber + "\n");
		
	}
	
	public void showClientList() {
		
		System.out.println("Client list:");
		for(int i = 0; i < this.clientList.size(); i++) {
			
			this.clientList.get(i).showDetails();
			
		}
		
		System.out.println();
		
	}
	
}