package main.logic;

import main.bot.TwitchBot;
import main.factory.TwitchBotFactory;



public class Init {
	
	public static void main(String[] args){
		
		TwitchBotFactory botFactory = new TwitchBotFactory();
		TwitchBot bot = botFactory.getBot("rezaakbot", "oauth:Testing");
	}
}
