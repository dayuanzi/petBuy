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
	private AdminDao adminDao;
	public void setAdminDao(AdminDao adminDao)
	{
		this.adminDao = adminDao;
	}

	
	/**
	 * 验证登录
	 * @param admin登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录成功
	 */
	public int validLogin(Admin admin)
	{
		//如果找到一个经理，以经理登录
		System.out.print(admin.getUsername());
		if (adminDao.findByNameAndPass(admin).size()
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