package main.config;

public class IRCConfig extends Config{
	
	protected final String username;
	
	public IRCConfig(String name, String ircURL, int port){
		
		super(ircURL, port);
		this.username = name;
	}
	
	public String getUserName()  {	return username;	}
}
