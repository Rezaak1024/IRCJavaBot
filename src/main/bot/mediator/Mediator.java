package main.bot.mediator;

import main.bot.core.Communicator;
import main.bot.core.util.Message;

public interface Mediator {

	public void addCommunicator(Communicator communicator);
	public void sendMessage(Message message, Communicator originator);
	public void relayNextMessage();
}
