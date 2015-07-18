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
 * @ClassName: CheckParamFilter
 * @Description: 判断用户是否登陆过滤器
 * @author： yuanchao
 * @date： 2015年6月26日 下午6:53:00
 *
 */
public class CheckParamFilter implements Filter {

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

		String paramStr = filterConfig.getInitParameter("paramStr");
		String redirectPath = httpRequest.getContextPath() + filterConfig.getInitParameter("redirectPath");

		if (this.isContain(httpRequest.getRequestURI(), paramStr.split(";"))) {
			filterChain.doFilter(request, response);
			return;
		}
		else
		{
			wrapper.sendRedirect(redirectPath);
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
