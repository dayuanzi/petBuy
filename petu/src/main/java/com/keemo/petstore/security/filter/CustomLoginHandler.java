package com.keemo.petstore.security.filter;

import java.io.IOException;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.dao.AdminDao;

/**
 * 
* @ClassName: CustomLoginHandler 
* @Description: 登录成功后的处理类
* @author： yuanchao
* @date： 2015年6月29日 下午7:09:09 
*
 */
public class CustomLoginHandler  extends SavedRequestAwareAuthenticationSuccessHandler{

	private AdminDao adminDao;
	
	public void setAdminDao(AdminDao adminDao){
		
		this.adminDao = adminDao;
		
	}
 
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.onAuthenticationSuccess(request, response, authentication);
		HttpSession session = request.getSession();
		String username = authentication.getName();
		Admin admin = adminDao.findByName(username).get(0);
		session.putValue("userid", admin.getId());
		
	}
	
	

}
