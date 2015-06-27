package com.keemo.petstore.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.keemo.petstore.action.base.EmpBaseAction;
import com.keemo.petstore.exception.HrException;
import com.keemo.petstore.service.EmpManager;
import com.opensymphony.xwork2.*;


import org.apache.struts2.interceptor.*;

import com.keemo.petstore.bean.*;
import static com.keemo.petstore.service.EmpManager.*;


/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a> 
 * <br/>Copyright (C), 2001-2012, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class LoginAction
	extends EmpBaseAction
{
	//����һ��������ΪԱ����¼�ɹ���Result��
	private final String EMP_RESULT = "emp";
	//����һ��������Ϊ�����¼�ɹ���Result��
	private final String MGR_RESULT = "mgr";
	//��װ�������
	private Manager manager;
	//��¼����֤��
	private String vercode;
	//�����¼�����ʾ��Ϣ
	private String tip;
	//manager���Ե�setter��getter����
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	//vercode���Ե�setter��getter����
	public void setVercode(String vercode)
	{
		this.vercode = vercode;
	}
	public String getVercode()
	{
		return this.vercode;
	}

	//tip���Ե�setter��getter����
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	public String getTip()
	{
		return this.tip;
	}
	//�����û�����
	public String execute()
		throws Exception
	{
		//����ActionContextʵ��
		ActionContext ctx = ActionContext.getContext();
		//��ȡHttpSession�е�rand����
		System.out.println("4");
		String ver2 = (String)ctx.getSession().get("rand");
		//if (vercode.equalsIgnoreCase(ver2))
		//{
			//����ҵ���߼������������¼����
		System.out.println("1");
			int result = mgr.validLogin(getManager());
			//��¼���Ϊ��ͨԱ��
			if (result == LOGIN_EMP)
			{
				System.out.println("2");
				ctx.getSession().put(WebConstant.USER 
					, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.EMP_LEVEL);
				setTip("���Ѿ��ɹ���¼ϵͳ");
				System.out.println("5");
				return EMP_RESULT;
			}
			//��¼���Ϊ����
			else if (result == LOGIN_MGR)
			{
				System.out.println("3");
				ctx.getSession().put(WebConstant.USER 
					, manager.getName());
				ctx.getSession().put(WebConstant.LEVEL
					, WebConstant.MGR_LEVEL);
				setTip("���Ѿ��ɹ���¼ϵͳ");
				System.out.println("6");
				return MGR_RESULT;
			}
			//�û��������벻ƥ��
			else
			{
				setTip("�û���/���벻ƥ��");
				return ERROR;
			}
		}
		//��֤�벻ƥ��
	//	else
	//	{
	//		setTip("��֤�벻ƥ��,����������");
	//		return ERROR;
	//	}
	//}
}