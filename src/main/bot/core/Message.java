package main.bot.core;

import main.bot.core.channel.Channel;
import main.bot.core.channel.User;

public class Message {
	
	protected String contents;
	protected User user;
	protected Channel channel;
	
	protected String rawMessage;
	
	public Message(String rawMessage) {
		
		this.rawMessage = rawMessage;
		parseString(rawMessage);
	}
	
	public String getRawMessage() {
		return rawMessage;
	}
	
	protected void parseString(String rawMessage) {
		
	}
}
