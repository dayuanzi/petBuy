/**
 * 
 */
package com.keemo.petstore.security.filter;

/**
 * @author 打水的
 *
 */

import java.io.IOException;
import java.nio.file.AccessDeniedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.bridge.Message;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

/**
 * @author 打水的
 *
 */


public class CustomLoginFailureHandler implements AuthenticationFailureHandler{

	/* (non-Javadoc)
	 * @see org.springframework.security.web.authentication.AuthenticationFailureHandler#onAuthenticationFailure(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.core.AuthenticationException)
	 */
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		if(exception.getMessage().equals("error code:1")){
			
		    response.setContentType("text/json");
		    response.setStatus(401);
		    response.getWriter().write("failed:username is not found");  
			
		}
		else if(exception.getMessage().equals("error code:2")){
			
		    response.setContentType("text/json");
		    response.setStatus(401);
		    response.getWriter().write("failed:privilege is not correct");  		
		    
		}
		else {
			
		    response.setContentType("text/json");
		    response.setStatus(401);
		    response.getWriter().write("failed:password is not found");  			
			
		}
		
		
		
		
	}  
	  
   
  
}  
