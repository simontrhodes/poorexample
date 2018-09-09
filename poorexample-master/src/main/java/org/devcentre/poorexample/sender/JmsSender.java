package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;

public class JmsSender {
		
	public void transmit( Alert alert, String server, String port, String queue){
		System.out.println("\nSending Web Service Alert: " + alert.getMessage());
		System.out.println("Server: " + server);
		System.out.println("Port: " + port);
		System.out.println("Queue: " + queue);
	}

}
