package it.polimi.controllers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.polimi.beans.User;
import it.polimi.dao.UserDao;
import it.polimi.utils.ConnectionHandler;

@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;

	public void init() throws ServletException {
		connection = ConnectionHandler.getConnection(getServletContext());
		ServletContext servletContext = getServletContext();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String email = null;
		String password = null;
		
		email = request.getParameter("email");
		password = request.getParameter("password");	

		// query db to authenticate for user
		UserDao userDao = new UserDao(connection);
		User user = null;
		try {
			user = userDao.checkCredentials(email, password);
			//TODO: the welcome page
			/*RequestDispatcher rd = request.getRequestDispatcher("Home.html");
			 rd.forward(request, response);*/
			
		} catch (SQLException e) {
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
					"Not Possible to check credentials aka BRO STO DATABASE SI FA I CAZZI SUOI");
			return;
		}

		// If the user exists, add info to the session and go to home page, otherwise
		// show login page with error message
		
	}

	public void destroy() {
		try {
			ConnectionHandler.closeConnection(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
