package com.keemo.petstore.filter;

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

/**
 * 
 * @ClassName: CheckLoginFilter
 * @Description: 判断用户是否登陆过滤器
 * @author： yuanchao
 * @date： 2015年6月26日 下午6:53:00
 *
 */
public class CheckLoginFilter implements Filter {

	private FilterConfig filterConfig = null;

	public void destroy() {
		// TODO Auto-generated method stub
		this.filterConfig = null;

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);
		HttpSession session = httpRequest.getSession();

		// * 请求 http://127.0.0.1:8080/webApp/home.jsp?&a=1&b=2 时
		// * request.getRequestURL()： http://127.0.0.1:8080/webApp/home.jsp
		// * request.getContextPath()： /webApp
		// * request.getServletPath()：/home.jsp
		// * request.getRequestURI()： /webApp/home.jsp
		// * request.getQueryString()：a=1&b=2

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

		String user = (String) httpRequest.getSession().getAttribute("userLogin");
		
		if (session == null || user == null) {
			wrapper.sendRedirect(redirectPath);
			return;
		} else {
			filterChain.doFilter(request, response);
			return;
		}

	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig = filterConfig;

	}

	/**
	 * 
	 * @Title: isContain
	 * @Description: TODO
	 * @param container
	 * @param str
	 * @return boolean
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
