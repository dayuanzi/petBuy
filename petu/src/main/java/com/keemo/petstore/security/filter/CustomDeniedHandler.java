/**
 * 
 */
package com.keemo.petstore.security.filter;

import java.io.IOException;
import java.nio.file.AccessDeniedException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.aspectj.bridge.Message;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * @author 打水的
 *
 */


public class CustomDeniedHandler implements AccessDeniedHandler {  
	  
    /* (non-Javadoc) 
     * @see org.springframework.security.web.access.AccessDeniedHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.access.AccessDeniedException) 
     */  
    private String errorPage;  
  
    //~ Methods ========================================================================================================  
  
  
    /** 
     * The error page to use. Must begin with a "/" and is interpreted relative to the current context root. 
     * 
     * @param errorPage the dispatcher path to display 
     * 
     * @throws IllegalArgumentException if the argument doesn't comply with the above limitations 
     */  
    public void setErrorPage(String errorPage) {  
        if ((errorPage != null) && !errorPage.startsWith("/")) {  
            throw new IllegalArgumentException("errorPage must begin with '/'");  
        }  
  
        this.errorPage = errorPage;  
    }

	/* (non-Javadoc)
	 * @see org.springframework.security.web.access.AccessDeniedHandler#handle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, org.springframework.security.access.AccessDeniedException)
	 */
	public void handle(HttpServletRequest request, HttpServletResponse response,
			org.springframework.security.access.AccessDeniedException exception)
			throws IOException, ServletException {
		
		
		HttpSession session = request.getSession();
		String privileges = (String) session.getAttribute("privileges");
		if (privileges.equals("ROLE_USER"))
		{
			response.sendRedirect("/login.jsp");
		}
		
		// TODO Auto-generated method stub
		
	}  
  
}  