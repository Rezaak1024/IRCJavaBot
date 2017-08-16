package main.connections;

import main.config.IRCConfig;
import main.config.TwitchConfig;
import main.mediator.MediatorImpl;

public class TwitchConnection extends IRCConnection{
	
	protected TwitchConfig config;
	
	public TwitchConnection(TwitchConfig config, MediatorImpl mediator){
		
		super((IRCConfig)config, mediator);
		this.config = config;
	}
}
