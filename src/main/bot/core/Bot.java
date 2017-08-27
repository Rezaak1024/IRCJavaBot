package main.bot.core;

import java.util.ArrayList;

import main.bot.core.channel.Channel;
import main.bot.core.channel.User;
import main.bot.core.util.Interpreter;
import main.bot.mediator.Mediator;

public abstract class Bot <T extends Configuration> implements Communicator{
	
	protected final Mediator mediator;
	
	protected ArrayList<Channel> channels;
	
	protected Interpreter messageInterpreter;
	
	public Bot(Mediator mediator) {
		
		this.mediator = mediator;
		
		channels = new ArrayList<>();
		messageInterpreter = createInterpreter(this);
	}

	public abstract T getConfig();
	
	public ArrayList<Channel> getChannels() {
		return channels;
	}
	
	public ArrayList<User> getUsers(Channel channel) {
		
		if(channels.contains(channel)) {
			return channel.getUsers();
		}
		
		else {
			return null;
		}
	}
	
	public abstract void start();
	
	protected abstract Interpreter createInterpreter(Object invoker);
}
