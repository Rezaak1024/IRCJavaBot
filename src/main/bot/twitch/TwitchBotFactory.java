package main.bot.twitch;

import main.bot.mediator.Mediator;
import main.bot.mediator.MediatorImpl;

public class TwitchBotFactory {

	public TwitchBot getBot(String name, String OAuth) {

		Mediator mediator = new MediatorImpl();
		
		TwitchConfiguration config = new TwitchConfiguration(name, OAuth);
		TwitchConnection connection = new TwitchConnection(config, mediator);
		TwitchBot bot = new TwitchBot(config, mediator);
		
		mediator.addCommunicator(connection);
		mediator.addCommunicator(bot);

		return bot;
	}

}
