package com.keemo.petstore.action.base;

import com.keemo.petstore.service.EmpManager;
import com.opensymphony.xwork2.ActionSupport;



public class EmpBaseAction
	extends ActionSupport
{
	//������ҵ���߼����
	protected EmpManager mgr;
	//����ע��ҵ���߼�����������setter����
	public void setEmpManager(EmpManager mgr)
	{
		this.mgr = mgr;
	}
}