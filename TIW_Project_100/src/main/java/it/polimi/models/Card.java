package it.polimi.models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Card {
	private String number;
	private String holder;
	private String dateExpiration;
	private DateFormat Data = new SimpleDateFormat("dd-MM-yyyy");
	private String cvv;
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public String getDateExpiration() {
		return dateExpiration;
	}
	
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = Data.format(dateExpiration);
	}
	
	public String getCvv() {
		return cvv;
	}
	
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
