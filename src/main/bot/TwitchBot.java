package main.bot;

import main.config.IRCConfig;
import main.config.TwitchConfig;
import main.connections.IRCConnection;
import main.connections.TwitchConnection;
import main.mediator.MediatorImpl;


public class TwitchBot extends IRCBot {
	
	protected final TwitchConfig config;
	protected final TwitchConnection connection;
	
	//Default Constructor
	public TwitchBot(TwitchConfig config, MediatorImpl mediator, TwitchConnection connection) {
		
		super((IRCConfig)config, mediator, (IRCConnection)connection);
		
		this.config = config;
		this.connection = connection;
	}
	
	public TwitchConfig getConfig()			{	return config;	}
	public TwitchConnection getConnection()	{	return connection;	}
	
	@Override
	public String toString() {	return config.getUserName();	}
}
