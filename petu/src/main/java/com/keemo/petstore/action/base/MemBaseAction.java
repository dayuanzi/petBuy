package com.keemo.petstore.action.base;

import com.keemo.petstore.service.MemManager;
import com.opensymphony.xwork2.ActionSupport;



public class MemBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected MemManager mem;
	//依赖注入业务逻辑组件所必须的setter方法
	public void setMemManager(MemManager mem)
	{
		this.mem = mem;
	}
}