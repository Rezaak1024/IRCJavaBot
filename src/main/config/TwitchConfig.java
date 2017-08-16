package main.config;

public class TwitchConfig extends IRCConfig{
	
	protected final static String IRC_URL = "irc.chat.twitch.tv";
	protected final static String RESPONSE_URL = "tmi.twitch.tv";
	
	protected final static int port = 6667;

	protected String OAuth;
	
	public TwitchConfig(String name, String OAuth) {
		
		super(name, IRC_URL, port);
		
		this.OAuth = OAuth;
	}
	
	public String getOAuth() 		{	return OAuth;			}
	public String getResponseURL()	{	return RESPONSE_URL;	}
}
