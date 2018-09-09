package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;

/**
 * JMS Sender class
 * Simulates connection to a JMS server
 * @author	Simon Rhodes 
 * @version 1.0
 * @since 	9/9/2018
 */

public class JmsSender {
	
	/**
	 * Transmit alert message, to JMS server
	 * @param server Server name
	 * @param port Server port in a String
	 * @param queue Server queue name
	 * @return Nothing
	 */
	public void transmit( Alert alert, String server, String port, String queue){
		System.out.println("\nSending Web Service Alert: " + alert.getMessage());
		System.out.println("Server: " + server);
		System.out.println("Port: " + port);
		System.out.println("Queue: " + queue);
	}

}
