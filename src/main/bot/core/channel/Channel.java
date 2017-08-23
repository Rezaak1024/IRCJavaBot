package main.bot.core.channel;

import java.util.ArrayList;

public class Channel {

	protected ArrayList<User> userList = new ArrayList<>();

	protected final String name;

	public Channel(String name) {

		this.name = name;
	}

	public void addUser(User user) {

		userList.add(user);
	}

	public ArrayList<User> getUsers() {
		return userList;
	}

	@Override
	public String toString() {
		return name;
	}
}
