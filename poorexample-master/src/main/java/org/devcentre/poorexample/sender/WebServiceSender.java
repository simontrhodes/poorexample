package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;

public class WebServiceSender {
		
	public void transmit( Alert alert, String url, String service ){
		System.out.println("\nSending Web Service Alert: " + alert.getMessage());
		System.out.println("URL: " + url);
		System.out.println("Service: " + service);		
	}

}
