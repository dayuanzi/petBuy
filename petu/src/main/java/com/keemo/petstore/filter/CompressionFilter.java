package com.keemo.petstore.filter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: CompressionFilter
 * @Description: TODO
 * @author： yuanchao
 * @date： 2015年6月27日 下午2:35:12
 *
 */
public class CompressionFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		if (!this.isGzipSupported(httpServletRequest)) {
			filterChain.doFilter(request, response);
			return;
		}

		CompressionResponseWrapper respWrapper = new CompressionResponseWrapper(httpServletResponse);
		// 将响应头信息中的内容编码格式设置为gzip
		httpServletResponse.setHeader("Content-Encoding", "gzip");
		filterChain.doFilter(httpServletRequest, respWrapper);

		
		// 得到GZIPOutputStream输出流对象
		GZIPOutputStream gzipos = respWrapper.getGZIPOutputStream();
		// 调用GZIPOutputStream输出流对象的finish()方法完成将压缩数据写入
		gzipos.finish();
		// 响应输出流的操作,无需关闭输出流
	

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @Title: isGzipSupported
	 * @Description: 判断浏览器是否支持gzip压缩格式
	 * @param req
	 * @return boolean
	 * @throws
	 */
	@SuppressWarnings("unused")
	private boolean isGzipSupported(HttpServletRequest req) {
		String browserEncodings = req.getHeader("Accept-Encoding");
		return ((browserEncodings != null) && (browserEncodings.indexOf("gzip") != -1));
	}

}
