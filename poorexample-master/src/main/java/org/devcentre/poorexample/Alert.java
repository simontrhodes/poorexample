package org.devcentre.poorexample;

public class Alert {
	
	private String code;
	private String message;
	private boolean sendToEmail;
	private boolean sendToDatabase;
	private boolean sendToWebService;
	private boolean sendToJms;

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public boolean isSendToEmail() {
		return sendToEmail;
	}
	
	public void setSendToEmail(boolean sendToEmail) {
		this.sendToEmail = sendToEmail;
	}
	
	public boolean isSendToDatabase() {
		return sendToDatabase;
	}
	
	public void setSendToDatabase(boolean sendToDatabase) {
		this.sendToDatabase = sendToDatabase;
	}
	
	public boolean isSendToWebService() {
		return sendToWebService;
	}
	
	public void setSendToWebService(boolean sendToWebService) {
		this.sendToWebService = sendToWebService;
	}
	
	public boolean isSendToJms() {
		return sendToJms;
	}
	
	public void setSendToJms(boolean sendToJms) {
		this.sendToJms = sendToJms;
	}
}
