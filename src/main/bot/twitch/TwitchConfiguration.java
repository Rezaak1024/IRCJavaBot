package main.bot.twitch;

import main.bot.core.Configuration;


public class TwitchConfiguration implements Configuration {

	protected final static String IRC_URL = "irc.chat.twitch.tv";
	protected final static String RESPONSE_URL = "tmi.twitch.tv";

	protected final static int port = 6667;

	protected String OAuth;
	protected String username;

	public TwitchConfiguration(String username, String OAuth) {
		
		this.username = username;
		this.OAuth = OAuth;
	}

	public String getUsername() {
		return username;
	}
	
	public String getOAuth() {
		return OAuth;
	}

	public String getResponseURL() {
		return RESPONSE_URL;
	}

	@Override
	public String getURL() {
		return IRC_URL;
	}

	@Override
	public int getPort() {
		return port;
	}
}
