package main.bot.twitch;

import main.bot.core.Connection;
import main.bot.core.Message;
import main.bot.mediator.Mediator;

public class TwitchConnection extends Connection <TwitchConfiguration> {
	
	protected final TwitchConfiguration config;

	public TwitchConnection(TwitchConfiguration config, Mediator mediator) {

		super(mediator);
		
		this.config = config;
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
	public void connect() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "TwitchConnection: " + config.getUsername();
	}

	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message recieveMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}
}
