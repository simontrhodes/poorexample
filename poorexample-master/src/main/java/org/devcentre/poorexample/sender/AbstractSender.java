package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;

public abstract class AbstractSender {
	
	protected void display( String type, Alert alert ){
		System.out.println("\nSending " + type + " Alert: " + alert.getMessage());
	}

}
