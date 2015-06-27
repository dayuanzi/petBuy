package com.keemo.petstore.action.base;

import com.keemo.petstore.service.MgrManager;
import com.opensymphony.xwork2.ActionSupport;




public class MgrBaseAction extends ActionSupport
{
	protected MgrManager mgr;

	public void setMgrManager(MgrManager mgr)
	{
		this.mgr = mgr;
	}
}