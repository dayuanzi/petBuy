package com.keemo.petstore.action.base;

import com.keemo.petstore.service.EmpManager;
import com.opensymphony.xwork2.ActionSupport;



public class EmpBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected EmpManager mgr;
	//依赖注入业务逻辑组件所必须的setter方法
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}