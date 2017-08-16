package main.config;

public class Config {
	
	protected final String url;
	protected final int port;
	
	public Config(String url, int port) {
		
		this.url = url;
		this.port = port;
	}
	
	public String getURL()  {	return url;		}
	public int getPort()	{	return port;	}
}
