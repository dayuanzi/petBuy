package com.keemo.petstore.dao.impl;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.AdminDao;


public class AdminDaoHibernate extends YeekuHibernateDaoSupport implements AdminDao
{

	/**
	 * ���ݱ�ʶ����������Adminʵ��
	 * @param id ��Ҫ���ص�Adminʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Adminʵ��
	 */
	public Admin get(Integer id)
	{
		return null;}

	/**
	 * �־û�ָ����Adminʵ��
	 * @param Admin ��Ҫ���־û���Adminʵ��
	 * @return Adminʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Admin Admin) {
		return null;
	}

	/**
	 * �޸�ָ����Adminʵ��
	 * @param Admin ��Ҫ���޸ĵ�Adminʵ��
	 */
	public void update(Admin Admin) {
	}

	/**
	 * ɾ��ָ����Adminʵ��
	 * @param Admin ��Ҫ��ɾ����Adminʵ��
	 */
	public void delete(Admin Admin) {
	}

	/**
	 * ���ݱ�ʶ����ɾ��Adminʵ��
	 * @param id ��Ҫ��ɾ����Adminʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id) {
	}
	
}
