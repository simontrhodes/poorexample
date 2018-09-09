package org.devcentre.poorexample;

import java.util.List;

import org.devcentre.poorexample.sender.DatabaseSender;
import org.devcentre.poorexample.sender.EmailSender;
import org.devcentre.poorexample.sender.JmsSender;
import org.devcentre.poorexample.sender.WebServiceSender;


public class MainApplication {
		
	public static String emailServer;
	public static String emailPort;
	
	public static String databaseServer;
	public static String databaseUser;
	public static String databasePassword;
	
	public static String webServiceUrl;
	public static String webServiceService;
	
	public static String jmsServer;
	public static String jmsPort;
	public static String jmsQueue;
	
	
	private List<Alert> alerts;
	private List<String> notifications;
	
	private EmailSender emailSender = new EmailSender();
	private DatabaseSender databaseSender = new DatabaseSender();	
	private WebServiceSender webServiceSender = new WebServiceSender();
	private JmsSender jmsSender = new JmsSender();
			
	public void run() {
		
		for( String notification : notifications ){
			Alert alert = findAlert( notification );
			
			if( alert.isSendToDatabase()){
				this.databaseSender.submit( alert );
			}

			if( alert.isSendToEmail()){
				this.emailSender.send( alert ); 
				
			}

			if( alert.isSendToWebService()){
				this.webServiceSender.transmit( alert, webServiceUrl, webServiceService );
			}
			
			if( alert.isSendToJms()){
				this.jmsSender.transmit( alert, jmsServer, jmsPort, jmsQueue );
			}
		}		
	}
	
	public Alert findAlert( String code ){
		for( Alert alert: alerts){
			if( alert.getCode().equals( code)){
				return alert;
			}
		}
		return null;
	}


	public void setAlerts(List<Alert> alerts) {
		this.alerts = alerts;
	}

	public List<Alert> getAlerts() {
		return alerts;
	}

	public void setNotifications(List<String> notifications) {
		this.notifications = notifications;
	}

	public List<String> getNotifications() {
		return notifications;
	}
	
	public void setEmailServer(String server) {
		emailServer = server;
	}

	public void setEmailPort(String port) {
		emailPort = port;
	}

	public void setDatabaseServer(String server) {
		databaseServer = server;
	}

	public void setDatabaseUser(String user) {
		databaseUser = user;
	}

	public void setDatabasePassword(String password) {
		databasePassword = password;
	}

	public void setWebServiceUrl(String url) {
		webServiceUrl = url;
	}

	public void setWebServiceService(String service) {
		webServiceService = service;
	}

	public void setEmailSender(EmailSender sender) {
		emailSender = sender;
	}

	public void setDatabaseSender(DatabaseSender sender) {
		databaseSender = sender;
	}

	public void setWebServiceSender(WebServiceSender sender) {
		webServiceSender = sender;
	}
	
	public void setJmsServer(String server) {
		jmsServer = server;
	}
	
	public void setJmsPort(String port) {
		jmsServer = port;
	}
	
	public void setJmsQueue(String queue) {
		jmsServer = queue;
	}
	
}
