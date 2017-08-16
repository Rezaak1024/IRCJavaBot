package main.mediator;

import java.util.ArrayDeque;
import java.util.Queue;


public class MediatorImpl implements Mediator{
	
	private Queue<String> input = new ArrayDeque<>();
	private Queue<String> output = new ArrayDeque<>();
	
	private boolean shouldConnect = false;
	
	public MediatorImpl() {}
	
	@Override
	public void sendOutput(String s) {	output.add(s);	}	
	@Override
	public void sendInput(String s)  {	input.add(s);	}
	@Override
	public String getOutput() 		 {	return output.poll();	}
	@Override
	public String getInput() 		 {	return input.poll();	}
	
	@Override
	public void connect() 			{ shouldConnect = true; }
	@Override
	public boolean shouldConnect()  { return shouldConnect;	}
}
