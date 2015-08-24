package com.keemo.petstore.action.base;

import com.keemo.petstore.service.AdmManager;
import com.keemo.petstore.service.ImgManager;
import com.opensymphony.xwork2.ActionSupport;



public class AdmBaseAction
	extends ImgBaseAction
{
	//依赖的业务逻辑组件
	protected AdmManager adm;
	//依赖注入业务逻辑组件所必须的setter方法
	

	public void setAdmManager(AdmManager adm)
	{
		this.adm = adm;
	}
}