package pl.lodz.uni.math.java.factoryData;

import java.util.List;

import pl.lodz.uni.math.java.users.*;

public interface FactoryInterface {
	
	public List<User> selectAllUsers();
	public User selectUserById(int userID); 
	
}


