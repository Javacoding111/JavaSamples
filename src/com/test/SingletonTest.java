package com.test;

public class SingletonTest {
	public static void main(String[] args) {
//		SingletonSample sample = SingletonSample.getInstance();
//		System.out.println(sample.hashCode());
//		SingletonSample sample1 = SingletonSample.getInstance();
//		System.out.println(sample1.hashCode());
		
		SigletonMultithreaded instance1 = SigletonMultithreaded.getInstance();
		SigletonMultithreaded instance2 = SigletonMultithreaded.getInstance();
		SigletonMultithreaded instance3 = SigletonMultithreaded.getInstance();
		
		System.out.println(instance1);
		System.out.println(instance2);
		System.out.println(instance3);
	}

}
