package pl.lodz.uni.math.java.users;

public class User {
		
		public int userID;
		private String userName;
		private static int IDNumberCounter = 0;
		public String userDetails;
		
		public User(String name) {
			
			IDNumberCounter++;
			this.userID = IDNumberCounter;
			this.userName = name; 
			
		}
		
		public String showUserDetails() {
			
			userDetails = this.userID + " - " + this.userName;
			return userDetails;
			
		}

}


