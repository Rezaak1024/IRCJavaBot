package main.factory;

import main.bot.TwitchBot;
import main.config.TwitchConfig;
import main.connections.TwitchConnection;
import main.mediator.MediatorImpl;

public class TwitchBotFactory {
	
	public TwitchBot getBot(String name, String OAuth){
		
		MediatorImpl mediator = new MediatorImpl();
		TwitchConfig config = new TwitchConfig(name, OAuth);
		
		TwitchConnection connection = new TwitchConnection(config, mediator);
		
		TwitchBot bot = new TwitchBot(config, mediator, connection);
		
		return bot;
	}

}
