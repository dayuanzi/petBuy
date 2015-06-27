package com.keemo.petstore.authority;

import com.keemo.petstore.action.WebConstant;
import com.opensymphony.xwork2.*;

import com.opensymphony.xwork2.interceptor.*;


public class MgrAuthorityInterceptor
	extends AbstractInterceptor
{
	public String intercept(ActionInvocation invocation) 
		throws Exception
	{
		//创建ActionContext实例
		ActionContext ctx = ActionContext.getContext();
		//获取HttpSession中的level属性
		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);
		//如果level不为null，且level为mgr
		if ( level != null 
			&& level.equals(WebConstant.MGR_LEVEL))
		{
			return invocation.invoke();
		}
		else
		{
			return Action.LOGIN;
		}
	}
}