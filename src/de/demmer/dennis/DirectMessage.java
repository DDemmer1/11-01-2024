package de.demmer.dennis;

public class DirectMessage extends Message {
	
	private int recieverPhoneNumber;

	
	public DirectMessage(String text, String date, int recieverPhoneNumber) {
		super(text, date);
		setRecieverPhoneNumber(recieverPhoneNumber);
	}


	public int getRecieverPhoneNumber() {
		return recieverPhoneNumber;
	}


	public void setRecieverPhoneNumber(int recieverPhoneNumber) {
		if( recieverPhoneNumber < 0 ) {
			recieverPhoneNumber = 0;
		}
		this.recieverPhoneNumber = recieverPhoneNumber;
	}



	
	

}
