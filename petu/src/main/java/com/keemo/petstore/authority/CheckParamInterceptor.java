package com.keemo.petstore.authority;

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
		System.out.println(invocation.getAction().toString());
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
public boolean isContain(String container, String[] str) {

	for (int i = 0; i < str.length; i++) {
		if (container.indexOf(str[i]) != -1) {

			return true;
		}
	}
	return false;
}


}