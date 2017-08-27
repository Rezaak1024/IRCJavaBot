package main.bot.core;

import main.bot.core.util.Message;
import main.bot.mediator.Mediator;

public interface Communicator {
	
	//Send message from Communicator to Mediator
	public void sendMessage(Message message);
	
	//Send message from Mediator to Communicator
	//Returns a response, null if no response
	public Message recieveMessage(Message message);
	
	public Mediator getMediator();
}
