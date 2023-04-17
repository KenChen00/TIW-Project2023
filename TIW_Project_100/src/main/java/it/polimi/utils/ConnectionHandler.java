package it.polimi.utils;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionHandler {

	//initialize the connection
	public static Connection getConnection(ServletContext context) throws UnavailableException {		
		Connection connection = null;
		try {

			String driver = context.getInitParameter("com.mysql.cj.jdbc.Driver");
			String url = context.getInitParameter("jdbc:mysql://localhost:3306/Web100?serverTimezone=UTC");
			String user = context.getInitParameter("root");
			String password = context.getInitParameter("Mao31101999");
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			throw new UnavailableException("Can't load database driver");
		} catch (SQLException e) {
			throw new UnavailableException("Couldn't get database connection");
		}
		return connection;
	}
	//close the connection
	public static void closeConnection(Connection connection) throws SQLException {
		if (connection != null) 
			connection.close();
	}
	
}
