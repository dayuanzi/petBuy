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
	 * �Ծ����������֤��¼
	 * @param mgr ��¼�ľ������
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼emp 2Ϊ��¼mgr
	 */
	public int validLogin(Admin admin)
	{
		//����ҵ�һ�������Ծ����¼
		
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