package com.keemo.petstore.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
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

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.keemo.petstore.action.common.RandomCodeAction;
import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.service.AdmManager;
import com.keemo.petstore.service.EmailVerificationCodeService;
import com.keemo.petstore.service.MemManager;
import com.keemo.petstore.service.UserService;
import com.keemo.petstore.util.Util;

/**
 * @author 打水的
 *
 */
@Controller
@ParentPackage("basePackage")
@Namespace("/")

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userName;
	private String password;
//	private String code;// 验证码
	private String repassword;
	private AuthenticationManager authenticationManager;
	private String nickName;

	private EmailVerificationCodeService ema;
	private MemManager mem;
	private UserService userService;
	
	public void setUserService(UserService userService)
	{
		this.userService = userService;
		
	}


	public void setEmailManager(EmailVerificationCodeService ema)
	{
		this.ema = ema;
		
	}


	public void setMemManager(MemManager mem)
	{
		this.mem = mem;
		
	}
	
	/**
	 * @throws IOException 
	 * 
	* @Description: 用户注册 
	* @return
	* @throws
	 */

	@Action(value =  "UserRegisterAction", 
			 results = {@Result(
	        		            name = "success", 
	        		            location = "/login.jsp")},
			 interceptorRefs = {  
				       @InterceptorRef(value = "tokenSession"),
				       @InterceptorRef(value = "defaultStack")})
				       
	public String register() throws IOException {

		/*	HttpSession session = ServletActionContext.getRequest().getSession();
	String radomcode = (String) session.getAttribute(RandomCodeAction.RANDOMCODEKEY);

			if (!radomcode.equalsIgnoreCase(this.getCode())) {
				ServletActionContext.getRequest().setAttribute("msg", "验证码不正确");
				session.removeAttribute(RandomCodeAction.RANDOMCODEKEY);

				return "toregist";
			}
	*/
		if (!password.equals(repassword)) {
		//	ServletActionContext.getRequest().setAttribute("msg", "密码不一致");
			
		    HttpServletResponse response = ServletActionContext.getResponse();
		    response.setContentType("text/json");
		    response.setStatus(403);
		    response.setCharacterEncoding("utf-8");
		    response.getWriter().write("密码不一致");  
			return null;
			
		}

		if (!mem.checkUsername(userName)){
		//	ServletActionContext.getRequest().setAttribute("msg", "邮箱已注册");
			
		    HttpServletResponse response = ServletActionContext.getResponse();
		    response.setContentType("text/json");
		    response.setStatus(403);
		    response.setCharacterEncoding("utf-8");
		    response.getWriter().write("邮箱已注册");  
			return null;
			
		}
		
 try{
	Admin user = new Admin();
	user.setUsername(userName);
	user.setPassword(Util.encodePassword(password, userName));
	user.setPrivileges("ROLE_USER");
	user.setNickname(nickName);
	user.setActive((byte)0);
    Integer userid=ema.save(user);
    String vericode = ema.getRandomString();
    mem.saveVericode(userid, vericode);
	String content = "hello,请点击此处进行邮箱激活，" + "http://localhost:8080/ActiveAction.do" + "?userid=" + String.valueOf(userid)
			+ "&vericode=" + vericode;
	ema.sendEmail(userName, EmailVerificationCodeService.SUBJECT_MAIL_ACTIVE, content);
    
}
catch(Exception e){
	 e.printStackTrace();
	 HttpServletResponse response = ServletActionContext.getResponse();
	 response.setContentType("text/json");
	 response.setStatus(500);
	 response.setCharacterEncoding("utf-8");
	 response.getWriter().write("内部错误"); 
	 //throw e;
	 return null;
}
		
		
		HttpServletResponse response = ServletActionContext.getResponse();
	    response.setContentType("text/json");
	    response.setStatus(200);
	    response.setCharacterEncoding("utf-8");
	    response.getWriter().write("注册成功");  
		
	//	return "success";
	    return null;

	}
	
	
	@Action(value = "UserActiveAction", results = { @Result(name = "success", location = "/login.jsp"),@Result(name = "failed", location = "/activefailed.jsp") })
	public String  activate() {

		ActionContext ctx = ActionContext.getContext();
		String useridStr = ((String[])ctx.getParameters().get("userid"))[0];
		String vericodeStr = ((String[])ctx.getParameters().get("vericode"))[0];
		Integer userid  = Integer.valueOf(useridStr);
		System.out.println(userid);
		System.out.println(vericodeStr);
		List<Activericode> list = mem.checkVericode(userid, vericodeStr);
		
		if(list.size() > 0)
		{
			Admin admin = mem.getAdmin(list.get(0).getUserid());
			admin.setActive((byte)1);
			admin.setPrivileges("ROLE_MEM");
			mem.updateAdmin(admin);
			return "success";
		}
		
		
		return "failed";

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

	/*public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}*/

	public AuthenticationManager getAuthenticationManager() {
		return authenticationManager;
	}

	public void setAuthenticationManager(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

}
