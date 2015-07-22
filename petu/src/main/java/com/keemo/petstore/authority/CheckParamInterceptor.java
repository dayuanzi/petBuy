package com.keemo.petstore.authority;

import java.util.Enumeration;

import org.apache.struts2.ServletActionContext;

import com.keemo.petstore.action.WebConstant;
import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;



public class CheckParamInterceptor
	extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation) 
		throws Exception
	{
		
		//创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取HttpSession中的level属性
	    
	    System.out.println("执行了拦截器");
		return invocation.invoke();
	
		
		
		
		

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
public boolean isContain(String container, String str) {

		if (container.indexOf(str) != -1) {

			return true;

	}
	return false;
}


}