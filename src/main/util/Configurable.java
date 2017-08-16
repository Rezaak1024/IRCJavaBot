package main.util;

import main.config.Config;

public interface Configurable <T extends Config>{
	
	public T getConfig();
}
