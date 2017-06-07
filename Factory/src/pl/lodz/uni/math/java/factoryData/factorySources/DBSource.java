package pl.lodz.uni.math.java.factoryData.factorySources;


import pl.lodz.uni.math.java.factoryData.FactoryInterface;
import pl.lodz.uni.math.java.users.User;
import java.util.ArrayList;
import java.util.List;


public class DBSource implements FactoryInterface {
	
	private static FactoryInterface instance = new DBSource();
	List<User> userList = new ArrayList<User>();
	
	
	private DBSource() {
		
		for(int i = 0; i < 5; i++) {
			
			
			User newUser = new User("Jan Kowalski");
			userList.add(newUser);
			
		}
		
	}
	
	public static FactoryInterface getInstance() {
		
		return instance;
		
	}

	@Override
	public List<User> selectAllUsers() {
		
		for (int i = 0; i < userList.size(); i++) {
			
			System.out.println(userList.get(i).showUserDetails());
			
		}
		
		return userList;
		
	}

	@Override
	public User selectUserById(int userID) {
		
			for (int i = 0; i < userList.size(); i++) {
			
				if(userList.get(i).userID == userID) {
				
					System.out.println(userList.get(i).showUserDetails());
					
					return userList.get(i);
				} 
				
			}
			
		System.out.println("Selected user does not exist");
		return null;
		
	}
	
}
