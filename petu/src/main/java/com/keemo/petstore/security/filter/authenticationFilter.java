package com.keemo.petstore.security.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import javax.servlet.http.HttpSession;

import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;


/**
 * 
* @ClassName: authenticationFilter 
* @Description: 判断用户是否是自动登录，对于一些受保护的资源需要用户重新登录
* @author： yuanchao
* @date： 2015年7月2日 下午3:29:29 
*
 */
public class authenticationFilter implements Filter {

	private FilterConfig filterConfig = null;

	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;
	}
	

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);
		HttpSession session = httpRequest.getSession();
		
		
		System.out.println("这里是remember me的过滤器==========");
		
		String loginStr = filterConfig.getInitParameter("loginStr");
		String filterStr = filterConfig.getInitParameter("filterStr");
		String redirectPath = httpRequest.getContextPath() + filterConfig.getInitParameter("redirectPath");

		if (!this.isContain(httpRequest.getRequestURI(), filterStr.split(";"))) {
			filterChain.doFilter(request, response);
			return;
		}

		if (this.isContain(httpRequest.getRequestURI(), loginStr.split(";"))) {
			filterChain.doFilter(request, response);
			return;
		}


		if (isRememberMeAuthenticated()) {
			wrapper.sendRedirect(redirectPath);
			return;
		} else {
			filterChain.doFilter(request, response);
			return;
		}

	}

	
	public void destroy() {
		// TODO Auto-generated method stub
		this.filterConfig = null;
	}

	/**
	 * 
	* @Description: 判断用户是否从Remember Me Cookie自动登录 
	* @return
	* @throws
	 */
	public boolean isRememberMeAuthenticated() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return false;
		}

		return RememberMeAuthenticationToken.class.isAssignableFrom(authentication.getClass());
	}
	
	/**
	 * 
	* @Description: 判断某字符串中是否包含特点字符
	* @param container
	* @param str
	* @return
	* @throws
	 */
	public boolean isContain(String container, String[] str) {

		for (int i = 0; i < str.length; i++) {
			if (container.indexOf(str[i]) != -1) {
				return true;
			}
		}
		return false;
	}

}
