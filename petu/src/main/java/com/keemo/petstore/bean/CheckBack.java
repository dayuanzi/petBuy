package com.keemo.petstore.bean;

import java.io.Serializable;
import java.sql.Date;


public class CheckBack
	implements Serializable
{
	private static final long serialVersionUID = 48L;
	//��ʶ����
	private Integer id;
	//�Ƿ�ͬ������
	private boolean result;
	//��������
	private String reason;
	//��������Ӧ������
	private Application app;
	//�����ľ���
	private Manager manager;

	//�޲����Ĺ�����
	public CheckBack()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public CheckBack(Integer id , boolean result ,
		String reason , Application app , Manager manager)
	{
		this.id = id;
		this.result = result;
		this.reason = reason;
		this.app = app;
		this.manager = manager;
	}

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//result���Ե�setter��getter����
	public void setResult(boolean result)
	{
		this.result = result;
	}
	public boolean getResult()
	{
		return this.result;
	}

	//reason���Ե�setter��getter����
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}

	//app���Ե�setter��getter����
	public void setApp(Application app)
	{
		this.app = app;
	}
	public Application getApp()
	{
		return this.app;
	}

	//manager���Ե�setter��getter����
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}
}