package main.connections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import main.config.Config;
import main.config.IRCConfig;
import main.mediator.MediatorImpl;

public class IRCConnection extends Connection{
	
	protected IRCConfig config;
	
	public IRCConnection(IRCConfig config, MediatorImpl mediator) {
		
		super((Config)config, mediator);
		this.config = config;
	}
	
	@Override
	public void connect() {
		
		try(Socket socket = new Socket(config.getURL(), config.getPort());
			BufferedWriter output = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {
			
			isConnected = true;
			
			while(isConnected){
				
				String inputData = new String("");
				String outputData = new String("");
				
				if(input.ready()){
					
					inputData = input.readLine();
					mediator.sendInput(inputData);
				}
				
				outputData = mediator.getOutput();
				
				if(!(outputData == null)) {
					
					output.write(outputData);
					output.flush();
				}
			}
			
		}
		
		catch(IOException e) {
			
		}
	}
	
	public IRCConfig getConfig() {	return config;	}
}
