package main.util;

import main.connections.Connection;

public interface Connectable <T extends Connection>{
	
	public T getConnection();
}
