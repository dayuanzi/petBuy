package com.keemo.petstore.filter;

import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CompressionResponseWrapper extends HttpServletResponseWrapper {

	private GZIPServletOutputStream gzipsos;
	private PrintWriter pw;
	private CharArrayWriter charWriter;

	public CompressionResponseWrapper(HttpServletResponse response) throws IOException {
		super(response);
		// TODO Auto-generated constructor stub
		gzipsos = new GZIPServletOutputStream(response.getOutputStream());
		pw = new PrintWriter(gzipsos);
		charWriter = new CharArrayWriter();

	}

	/**
	 * 过滤器调用这个方法来得到GZIPOutputStream对象，以便完成将压缩数据写入输出流的操作
	 */
	public GZIPOutputStream getGZIPOutputStream() {
		return gzipsos.getGZIPOutputStream();
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		// TODO Auto-generated method stub
		return pw;
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		// TODO Auto-generated method stub
		return gzipsos;
	}

	@Override
	public void setContentLength(int len) {
		// TODO Auto-generated method stub
		super.setContentLength(len);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return charWriter.toString();
	}

	public char[] getCharArry() {

		return charWriter.toCharArray();

	}

}
