package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;
import org.devcentre.poorexample.MainApplication;

public class EmailSender extends AbstractSender{
	
	public void send( Alert alert ){
		display( "Email", alert);
		System.out.println("Host: " + MainApplication.emailServer);
		System.out.println("Port: " + MainApplication.emailPort);
	}
}
