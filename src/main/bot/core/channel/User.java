package main.bot.core.channel;

//User in IRC channels
public class User {

	protected String name;
	protected boolean isMod;

	public User(String name) {

		this.name = name;
	}

	public boolean getModStatus() {
		return isMod;
	}

	public String getName() {
		return name;
	}
}
