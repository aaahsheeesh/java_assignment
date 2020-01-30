package com.bank;

public class SBI extends RBI{

	private static final double TAXRATE = 0.025;
	private static final double INTERESTRATE = 0.015;
	
	public SBI() {
		super(TAXRATE,INTERESTRATE);
	}
}
