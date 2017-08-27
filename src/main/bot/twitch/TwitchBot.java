package main.bot.twitch;

import java.util.ArrayList;

import main.bot.core.Bot;
import main.bot.core.Communicator;
import main.bot.core.channel.Channel;
import main.bot.core.channel.User;
import main.bot.core.util.Interpreter;
import main.bot.core.util.Message;
import main.bot.mediator.Mediator;

public class TwitchBot extends Bot<TwitchConfiguration> implements Communicator {
	
	protected ArrayList<Channel> channels;
	protected TwitchConfiguration config;
	
	protected boolean membershipStatus;
	protected boolean tagsStatus;
	protected boolean commandsStatus;

	public TwitchBot(TwitchConfiguration config, Mediator mediator) {

		super(mediator);
		
		this.config = config;
		
		channels = new ArrayList<>();
		mediator.addCommunicator(this);
	}
	
	@Override
	public void start() {
		
		
	}

	@Override
	public TwitchConfiguration getConfig() {
		return config;
	}

	@Override
	public Mediator getMediator() {
		return mediator;
	}

	@Override
	public ArrayList<Channel> getChannels() {
		return channels;
	}

	@Override
	public ArrayList<User> getUsers(Channel channel) {
		
		if(channels.contains(channel)) {
			return channel.getUsers();
		}
		
		else {
			return null;
		}
	}

	@Override
	public void sendMessage(Message message) {
		mediator.sendMessage(message, this);
	}

	@Override
	public Message recieveMessage(Message message) {
		return messageInterpreter.executeMessage(message);
	}
	
	@Override
	public String toString(){
		return "TwitchBot: " + config.getUsername();
	}

	@Override
	protected Interpreter createInterpreter(Object invoker) {
		return messageInterpreter;
	}
}
