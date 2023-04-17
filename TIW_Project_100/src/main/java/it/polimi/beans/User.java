package it.polimi.beans;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private String email;	
	private String name;
	private String surname;
	private String password;
	private String address;
	private String nickname;
	private String birthday;
	private DateFormat Data = new SimpleDateFormat("dd-MM-yyyy");
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickName(String nickname) {
		this.nickname = nickname;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = Data.format(birthday);
	}

}
