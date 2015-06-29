package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.util.*;


public interface AdmManager
{
	//��¼ʧ��
	public static final int LOGIN_FAIL = 0;
	//��½�ɹ�
	public static final int LOGIN_SUC = 1;
	

	/**
	 * ������������֤��¼
	 * @param admin ��¼��ʵ����Ϣ
	 * @return ��¼������ȷ��:0Ϊ��¼ʧ�ܣ�1Ϊ��¼�ɹ�
	 */
	int validLogin(Admin admin);

}