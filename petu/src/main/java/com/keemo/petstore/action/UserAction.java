package com.keemo.petstore.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.keemo.petstore.action.common.RandomCodeAction;
import com.keemo.petstore.bean.Admin;
//import com.keemo.petstore.model.User;
import com.keemo.petstore.service.EmailVerificationCodeService;
import com.keemo.petstore.service.UserService;
import com.keemo.petstore.util.Util;

@Controller
@ParentPackage("basePackage")
@Namespace("/")
public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
	private String code;// 验证码
	private String repassword;
	private AuthenticationManager authenticationManager;
	private String email;


	private UserService userService;
	
	public void setUserService(UserService userService)
	{
		this.userService = userService;
		
	}


	private EmailVerificationCodeService ema;
	public void setEmailManager(EmailVerificationCodeService ema)
	{
		this.ema = ema;
		
	}
	/**
	 * 
	* @Description: 用户注册 
	* @return
	* @throws
	 */
	@Action(value = "user-register", results = { @Result(name = "success", params = { "actionName", "AutoLogin" }, type = "chain") })
	public String register() {

		HttpSession session = ServletActionContext.getRequest().getSession();
		String radomcode = (String) session.getAttribute(RandomCodeAction.RANDOMCODEKEY);

		
	
			if (!radomcode.equalsIgnoreCase(this.getCode())) {
				ServletActionContext.getRequest().setAttribute("msg", "验证码不正确");
				session.removeAttribute(RandomCodeAction.RANDOMCODEKEY);

				return "toregist";
			}
		
			
		
		

		if (!password.equals(repassword)) {
			ServletActionContext.getRequest().setAttribute("msg", "密码不一致");
			return "toregist";
		}

		Admin user = new Admin(userName,Util.encodePassword(password, userName),"ROLE_USER",email,(byte)0);
		

	    ema.save(user);

		//Admin userTemp = ema.getByEmailAndPassword(userName, Util.encodePassword(password, userName));
     //   System.out.println(userTemp.getUsername());
		String content = "hello,请点击此处进行邮箱激活，" + "localhost:8080/login.jsp" + "?username=" + userName
				+ "&email=" + getEmail() + "&password=" + getPassword() + "&active=1";
	
		ema.sendEmail(email, EmailVerificationCodeService.SUBJECT_MAIL_ACTIVE, content);
		
		return "success";

	}

	/**
	 * 
	* @Description: 注册后自动登录，action chain链式action 
	* @return
	* @throws
	 */
	@Action(value = "AutoLogin", results = { @Result(name = "success", type = "redirect", location = "/index.jsp") })
	public String AutoLogin() {
	/*	UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(userName, password);

		HttpServletRequest request = ServletActionContext.getRequest();
		// generate session if one doesn't exist
		request.getSession();

		token.setDetails(new WebAuthenticationDetails(request));
		Authentication authenticatedUser = authenticationManager.authenticate(token);

		SecurityContextHolder.getContext().setAuthentication(authenticatedUser);

		System.out.println("autologin终于被执行到了");

		// 用于获取登录用户的信息，一旦用户登录成功可以在代码的任意位置使用
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			String username = ((UserDetails) principal).getUsername();
			System.out.println(username);
		} else {
			String username = principal.toString();
		}
*/
		return "success";
		
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}
}
