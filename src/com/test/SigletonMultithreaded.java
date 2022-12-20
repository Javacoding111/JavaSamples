package com.test;

public class SigletonMultithreaded {
	
	private SigletonMultithreaded() {
		
	}
	
	private static SigletonMultithreaded instance;
	
	public static SigletonMultithreaded getInstance() {
		if(instance == null) {
			synchronized (SigletonMultithreaded.class) {
				if(instance == null) {
					instance = new SigletonMultithreaded();
				}
			}
		}
		return instance;
	}

}
