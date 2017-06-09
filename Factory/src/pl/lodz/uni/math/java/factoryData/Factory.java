package pl.lodz.uni.math.java.factoryData;

import pl.lodz.uni.math.java.factoryData.factorySources.DBSource;
import pl.lodz.uni.math.java.factoryData.factorySources.WebService;
import pl.lodz.uni.math.java.factoryData.factorySources.XMLSource;
import pl.lodz.uni.math.java.users.User;
import java.util.HashMap;
import java.util.List;

public class Factory implements FactoryInterface {

	
	FactoryInterface selectedFactory = null;
	HashMap<FactorySourcesList, FactoryInterface> sourceMapHashMap = new HashMap<>(); {
		
		sourceMapHashMap.put(FactorySourcesList.DB, DBSource.getInstance());
		sourceMapHashMap.put(FactorySourcesList.XML, XMLSource.getInstance());
		sourceMapHashMap.put(FactorySourcesList.WebService, WebService.getInstance());
		
	}	
	
	public void setSource(FactorySourcesList sourceName) {
		
		System.out.println(sourceName);
		selectedFactory = sourceMapHashMap.get(sourceName);
		
	}

	@Override
	public List<User> selectAllUsers() {
		
		return selectedFactory.selectAllUsers();
		
	}

	@Override
	public User selectUserById(int userID) {
		
		return selectedFactory.selectUserById(userID);
		
	}
	
}
