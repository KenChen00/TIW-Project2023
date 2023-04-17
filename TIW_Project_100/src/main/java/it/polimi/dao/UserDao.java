package it.polimi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polimi.beans.User;

public class UserDao {
	private Connection connection;
	
	public UserDao(Connection connection) {
		this.connection=connection;
	}
	
	public User checkCredentials(String email, String password) throws SQLException{
		String queryCheckCredentials = "SELECT email FROM Web100.User WHERE email=? AND password=?";
		try(PreparedStatement ps = connection.prepareStatement(queryCheckCredentials);){
			ps.setString(1,email);
			ps.setString(2,password);
			try(ResultSet result = ps.executeQuery();){
				if(!result.isBeforeFirst())
					return null;
				else {
					result.next();
					User user = new User();
				
					return user;
				}
			}
		}
	}

}
