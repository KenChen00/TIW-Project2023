package it.polimi.models;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	private String code;
	private String emailUser;
	private String dateShipping;
	private DateFormat Data = new SimpleDateFormat("dd-MM-yyyy");
	private int quantity;
	private float totalValue;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getEmailUser() {
		return emailUser;
	}
	
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	
	public String getDateShipping() {
		return dateShipping;
	}
	
	public void setDateShipping(Date dateShipping) {
		this.dateShipping = Data.format(dateShipping);
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getTotalValue() {
		return totalValue;
	}
	
	public void setTotalValue(float totalValue) {
		this.totalValue = totalValue;
	}

}
