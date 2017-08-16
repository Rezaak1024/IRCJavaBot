package main.connections;

import main.config.Config;
import main.mediator.MediatorImpl;


public abstract class Connection {
	
	protected final Config config;
	protected final MediatorImpl mediator;
	
	protected boolean isConnected;
	
	public Connection(Config config, MediatorImpl mediator){
		
		this.config = config;
		this.mediator = mediator;
	}
	
	public Config getConfig() 			{	return config;		}
	public MediatorImpl getMediator()	{	return mediator;	}
	
	public abstract void connect();
	
}
