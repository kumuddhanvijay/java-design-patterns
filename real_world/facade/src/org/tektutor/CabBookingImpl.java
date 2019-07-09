package org.tektutor;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class CabBookingImpl implements CabBooking {

	@Override
	public void book() {
		System.out.println("Request for the cab booking is made.");
		cabArrived();
	}

	private void cabArrived() {
		System.out.println("Your cab is arrived");
		welcomeMessage();
	}
	
	private void welcomeMessage() {
		System.out.println("Welcome and have a great journey!");
	}
	
}
