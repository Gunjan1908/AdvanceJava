package com.app;
public class Vodafone implements Sim{
	
	public Vodafone()
	{
		System.out.println("Vodafone Constructor Called..");
	}
	
	@Override
	public void calling() {
		System.out.println("Calling using Vodafone");
	}

	@Override
	public void data() {
		System.out.println("Browsing data using Vodafone");
	}
}
