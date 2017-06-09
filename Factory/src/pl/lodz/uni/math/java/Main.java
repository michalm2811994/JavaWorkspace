package pl.lodz.uni.math.java;

import pl.lodz.uni.math.java.factoryData.Factory;
import pl.lodz.uni.math.java.factoryData.FactorySourcesList;
import pl.lodz.uni.math.java.users.User;

public class Main {

	public static void main(String[] args) {
		
		Factory newFactory = new Factory();

		newFactory.setSource(FactorySourcesList.DB);
	    newFactory.selectAllUsers();
	    newFactory.selectUserById(1);
	    
	    newFactory.setSource(FactorySourcesList.XML);
	    newFactory.selectAllUsers();
	    newFactory.selectUserById(1);
	    
	    newFactory.setSource(FactorySourcesList.WebService);
	    newFactory.selectAllUsers();
	    newFactory.selectUserById(1);
	    
	    
	}
	
}

