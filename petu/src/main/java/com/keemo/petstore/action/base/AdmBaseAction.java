package com.keemo.petstore.action.base;

import com.keemo.petstore.service.AdmManager;
import com.keemo.petstore.service.ImgManager;
import com.opensymphony.xwork2.ActionSupport;



public class AdmBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected AdmManager adm;
	//依赖注入业务逻辑组件所必须的setter方法
	protected ImgManager img;
	
	/**
	 * @param img the img to set
	 */
	public void setImgManager(ImgManager img) {
		this.img = img;
	}
	public void setAdmManager(AdmManager adm)
	{
		this.adm = adm;
	}
}