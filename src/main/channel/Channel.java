package main.channel;

import java.util.ArrayList;
import java.util.List;


public class Channel {
	
	protected List<User> userList = new ArrayList<>();
	
	protected final String name;
	
	public Channel(String name) {
		
		this.name = name;
	}
	
	public void addUser(User user){
		
		userList.add(user);
	}
	
	public List<User> getUsers() {	return userList;	}
	@Override
	public String toString() 	 {	return name;		}
}
