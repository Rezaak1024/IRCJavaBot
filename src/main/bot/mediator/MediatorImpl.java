package main.bot.mediator;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

import main.bot.core.Communicator;
import main.bot.core.util.Message;

public class MediatorImpl implements Mediator {
	
	protected ArrayList<Communicator> communicators;
	
	protected Queue<Message> messages;
	protected Queue<Communicator> originators;
	
	public MediatorImpl() {
		
		communicators = new ArrayList<>();
		
		messages = new ArrayDeque<>();
		originators = new ArrayDeque<>();
	}
	
	public MediatorImpl(ArrayList<Communicator> communicators) {
		this.communicators = communicators;
	}

	@Override
	public void addCommunicator(Communicator communicator) {
		communicators.add(communicator);
	}

	@Override
	public void sendMessage(Message message, Communicator originator) {
		
		messages.add(message);
		originators.add(originator);
	}
	
	@Override
	public void relayNextMessage(){
		
		//Adds next message and its originator from the Queue to local scope, or null if nonexistent
		Communicator nextOriginator = originators.poll();
		Message nextMessage = messages.poll();
		
		//Checks to see if there is a message in Queue
		if(nextOriginator != null || nextMessage != null){
			
			//Iterates over communicators
			for(Communicator communicator : communicators) {
				
				//Makes sure the originator isn't sending a message to itself
				if(communicator != nextOriginator){
					
					//Sends message to Communicator and waits for response
					Message response = communicator.recieveMessage(nextMessage);
					
					//Adds response to messages if not null
					if(response != null) {
						sendMessage(response, communicator);
					}
				}
			}
		}
		
		//IF there is no message in Queue, does nothing
	}
}
