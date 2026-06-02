package com.wipro.crm.entity;

public class Interaction {
		private String interactionId;
	    private String customerId;
	    private String date;
	    private String notes;
	    public Interaction(String interactionId,String customerId,String date,String notes) {
	        this.interactionId=interactionId;
	        this.customerId=customerId;
	        this.date=date;
	        this.notes=notes;
	}
	    public String getInteractionId(){
	    	return interactionId;
	}
	    public void setInteractionId(String interactionId) {
	    	this.interactionId=interactionId;
	}
	    public String getCustomerId(){
	    	return customerId;
	}
	    public void setCustomerId(String customerId) {
	    	this.customerId=customerId;
	}
	    public String getDate(){
	    	return date;
	}
	    public void setDate(String date) {
	    	this.date=date;
	}
	    public String getNotes(){
	    	return notes;
	}
	    public void setNotes(String notes) {
	    	this.notes=notes;
	}
}
