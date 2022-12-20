package com.test;

public class SingletonSample implements Cloneable {
	
	private SingletonSample() {
		
	}
	
	private static SingletonSample instance;
	
	public static SingletonSample getInstance() {
		if(instance == null) {
			instance = new SingletonSample();
		} 
		return instance;
		
	}

}
