package main.bot.core.util;


public abstract class Interpreter {
	
	protected Object invoker;
	
	public Interpreter(Object invoker) {
		this.invoker = invoker;
	}
	
	public Object getInvoker() {
		return invoker;
	}
	
	public Message executeMessage(Message message) {
		
		Message response = interpretMessage(message);
		return response;
	}
	
	protected abstract Message interpretMessage(Message message);
}
