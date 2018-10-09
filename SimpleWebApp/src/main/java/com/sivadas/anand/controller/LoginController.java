package com.sivadas.anand.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sivadas.anand.service.UserAuthenticationService;

@WebServlet(urlPatterns = "/login.do")
public class LoginController extends HttpServlet {

	private static final long serialVersionUID = -7297287819100669130L;
	
	UserAuthenticationService service = new UserAuthenticationService();

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	@Override
	  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("name");
		String password = request.getParameter("password");
		boolean isValid = service.validateUserCredentials(userName, password);
		request.setAttribute("user", userName);
		if (isValid) {
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "Invalid Credentials");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
	
}
