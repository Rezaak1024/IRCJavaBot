package main.logic;

import main.bot.twitch.TwitchBot;
import main.bot.twitch.TwitchBotFactory;

public class Init {

	public static void main(String[] args) {

		TwitchBotFactory botFactory = new TwitchBotFactory();
		TwitchBot bot = botFactory.getBot("rezaakbot", "oauth:Testing");
	}
}
