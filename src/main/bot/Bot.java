package main.bot;

import main.config.Config;
import main.connections.Connection;
import main.mediator.MediatorImpl;
import main.util.Configurable;
import main.util.Connectable;


public class Bot implements Connectable<Connection>, Configurable<Config>{
	
	protected final Config config;
	protected final MediatorImpl mediator;
	protected final Connection connection;
	
	public Bot(Config config, MediatorImpl mediator, Connection connection) {
		
		this.config = config;
		this.mediator = mediator;
		this.connection = connection;
	}
	
	public Config getConfig() 			{ 	return config; 		}
	public MediatorImpl getMediator() 	{	return mediator;	}
	public Connection getConnection()	{	return connection;	}
}
