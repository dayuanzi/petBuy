package com.keemo.petstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;


public class AdminLogin
	extends AdmBaseAction
{
	//定义一个常量作为员工登录成功的Result名
	private final String ADM_RESULT = "adm";
	
	private final String Catt_List = "catterylist";
	//定义一个常量作为经理登录成功的Result名
	//private final String MGR_RESULT = "mgr";
	//封装请求参数
	private Admin admin;
	//登录的验证码
	//private String vercode;
	//处理登录后的提示信息
	private String tip;
	//manager属性的setter和getter方法
	private List<Cat> catlist;
	private List<Cattery> catterylist;
	
	
	private Integer pagenow = 0;
	private Integer pagesize = 2;
	public void setAdmin(Admin admin)
	{
		this.admin = admin;
	}
	public Admin getAdmin()
	{
		return this.admin;
	}
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	public void setCatterylist(List<Cattery> catterylist)
	{
		this.catterylist = catterylist;
	}
	public List<Cattery> getCatterylist()
	{
		return this.catterylist;
	}
	
	//vercode属性的setter和getter方法
	/*public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
	}*/

	//tip属性的setter和getter方法
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	//处理用户请求
	public String execute()
		throws Exception
	{
		//创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		
		//System.out.print(getAdmin().getUsername());
	//	Integer pageNo = Integer.valueOf( (String)ctx.getParameters().get("pageNo"));
		System.out.println(((String[])ctx.getParameters().get("pageNo"))[0]);
	//	System.out.println((String)ctx.getParameter("pageNo"));
		//获取HttpSession中的rand属性
	//	String ver2 = (String)ctx.getSession().get("rand");
		//if (vercode.equalsIgnoreCase(ver2))
		//{
			//调用业务逻辑方法来处理登录请求
			int result = adm.validLogin(getAdmin());
			//登录结果为普通员工
			if (result == LOGIN_SUC)
			{
				ctx.getSession().put(WebConstant.USER 
					, admin.getUsername());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.EMP_LEVEL);
				setTip("您已经成功登录系统");
				//this.catlist = adm.getCatsbyPage(0, 10);
				this.catlist = adm.getCatsbyPage(pagenow,pagesize,1,2,1,1000000);
				return ADM_RESULT;
			}
			//用户名和密码不匹配
			else
			{
				setTip("用户名/密码不匹配");
				return ERROR;
			}
		//验证码不匹配
	//	else
	//	{
	//		setTip("验证码不匹配,请重新输入");
	//		return ERROR;
	//	}
	//}
	
}
	
	
	
	public String getCatteryList() throws Exception
	{
        ActionContext ctx = ActionContext.getContext();
		
    	this.catterylist = adm.getCatterybyPage(0,10);
		
    	return Catt_List;
		
		
	}
	
}