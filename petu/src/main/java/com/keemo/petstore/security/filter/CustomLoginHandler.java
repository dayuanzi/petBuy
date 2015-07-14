package com.keemo.petstore.security.filter;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

/**
 * 
* @ClassName: CustomLoginHandler 
* @Description: 登录成功后的处理类
* @author： yuanchao
* @date： 2015年6月29日 下午7:09:09 
*
 */
public class CustomLoginHandler  extends SavedRequestAwareAuthenticationSuccessHandler{

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.onAuthenticationSuccess(request, response, authentication);
	}
	
	

}
