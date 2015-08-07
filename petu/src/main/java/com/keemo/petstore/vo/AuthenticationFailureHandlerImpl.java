package com.keemo.petstore.vo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class AuthenticationFailureHandlerImpl implements AuthenticationFailureHandler {

	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		request.setAttribute("msg", "error");
		System.out.println(request.getRequestURI());
		HttpSession session=request.getSession();
		session.setAttribute("msg", "error");
		
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	   //response.sendRedirect(request.getContextPath());
		
	}

}
