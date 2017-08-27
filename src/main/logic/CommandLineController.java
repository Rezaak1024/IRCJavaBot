package main.logic;

import main.bot.core.Communicator;
import main.bot.core.util.Message;
import main.bot.mediator.Mediator;

public class CommandLineController implements Communicator{
	
	protected Mediator mediator;
	
	public CommandLineController(Mediator mediator) {
		
		this.mediator = mediator;
	}

	@Override
	public void sendMessage(Message message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Message recieveMessage(Message message) {
		
		System.out.println(message.getRawMessage());
		return null;
	}

	@Override
	public Mediator getMediator() {
		return mediator;
	}

}
