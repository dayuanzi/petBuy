package com.keemo.petstore.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: ForceNoCacheFilter
 * @Description: 使浏览器不缓存页面信息的过滤器
 * @author： yuanchao
 * @date： 2015年6月26日 下午6:05:24
 *
 */
public class ForceNoCacheFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Cache-Control", "no-cache");
		httpResponse.setHeader("Pragma", "no-cache");
		httpResponse.setDateHeader("Expires", -1);
		filterChain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
