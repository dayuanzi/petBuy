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
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�level����
		String level = (String)ctx.getSession()
			.get(WebConstant.LEVEL);
		//���level��Ϊnull����levelΪmgr
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