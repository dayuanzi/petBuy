package com.keemo.petstore.action.base;

import com.keemo.petstore.service.AdmManager;
import com.opensymphony.xwork2.ActionSupport;



public class AdmBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected AdmManager adm;
	//依赖注入业务逻辑组件所必须的setter方法
	public void setAdmManager(AdmManager adm)
	{
		this.adm = adm;
	}
}