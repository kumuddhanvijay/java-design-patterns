package org.tektutor;

public class FacadePattern {
	public static void main(String[] args) {

	    TravelPackageFacade travelPackageFacade=new TravelPackageFacadeImpl();
	    travelPackageFacade.book();
	  }
}
