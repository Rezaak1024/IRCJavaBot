package main.bot;

import main.config.Config;
import main.config.IRCConfig;
import main.connections.Connection;
import main.connections.IRCConnection;
import main.mediator.MediatorImpl;

public class IRCBot extends Bot{
	
	protected final IRCConfig config;
	protected final IRCConnection connection;
	
	public IRCBot(IRCConfig config, MediatorImpl mediator, IRCConnection connection){
		
		super((Config)config, mediator, (Connection)connection);
		
		this.config = config;
		this.connection = connection;
	}
	
	@Override
	public IRCConfig getConfig() 			{	return config;		}
	@Override
	public IRCConnection getConnection()	{	return connection;	}
}
