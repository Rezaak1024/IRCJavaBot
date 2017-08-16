package main.mediator;


public interface Mediator {
	
	public abstract void sendOutput(String s);
	public abstract void sendInput(String s);
	
	public abstract String getOutput();
	public abstract String getInput();
	
	public abstract void connect();
	public abstract boolean shouldConnect();
}
