package de.demmer.dennis;

//POJO = Plain Old Java Object
public class Message {

	// STRG + F + SHIFT
	private String text;
	private String date;
	
	
	
	public Message(String text, String date) {
		super();
		this.text = text;
		this.date = date;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	

}
