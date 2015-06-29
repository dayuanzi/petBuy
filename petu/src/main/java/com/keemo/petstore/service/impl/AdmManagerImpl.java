package com.keemo.petstore.service.impl;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.vo.*;
import com.keemo.petstore.exception.*;
import com.keemo.petstore.service.AdmManager;
import com.keemo.petstore.dao.AdminDao;
import java.text.*;
import java.util.*;


public class AdmManagerImpl
	implements AdmManager
{
	private AdminDao admindao;
	public void setAdminDao(AdminDao admindao)
	{
		this.admindao = admindao;
	}

	
	/**
	 * 以经理身份来验证登录
	 * @param mgr 登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录emp 2为登录mgr
	 */
	public int validLogin(Admin admin)
	{
		//如果找到一个经理，以经理登录
		
		if (admindao.findByNameAndPass(admin).size()
			>= 1)
		{
			return LOGIN_SUC;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}

}