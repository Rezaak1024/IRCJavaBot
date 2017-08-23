package main.bot.core;

import main.bot.mediator.Mediator;


public abstract class Connection <T extends Configuration> implements Communicator {
	
	protected Mediator mediator; 
	
	public Connection (Mediator mediator){
		this.mediator = mediator;
	}
	
	public abstract T getConfig();
	
	public abstract void connect();
	
	public abstract void disconnect();
}
