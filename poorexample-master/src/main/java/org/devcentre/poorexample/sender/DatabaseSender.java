package org.devcentre.poorexample.sender;

import org.devcentre.poorexample.Alert;
import org.devcentre.poorexample.MainApplication;

public class DatabaseSender extends AbstractSender{
		
	//private MainApplication app;
	
	//public DatabaseSender( MainApplication app ){
	//	this.app = app;
	//}
	
	public void submit( Alert alert ){
		display( "Database", alert);
		System.out.println("Server: " + MainApplication.databaseServer);
		System.out.println("User: " + MainApplication.databaseUser);
		System.out.println("Password: " + MainApplication.databasePassword);	
	}
}
