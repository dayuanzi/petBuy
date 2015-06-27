package com.keemo.petstore.dao.impl;

import java.util.*; 

import com.keemo.petstore.bean.*;
import com.keemo.petstore.common.hibernate3.support.*;
import com.keemo.petstore.dao.*;

import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.ApplicationDao;


public class ApplicationDaoHibernate
	extends YeekuHibernateDaoSupport
	implements ApplicationDao
{
	/**
	 * ���ݱ�ʶ����������Applicationʵ��
	 * @param id ��Ҫ���ص�Applicationʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Applicationʵ��
	 */
	public Application get(Integer id)
	{
		return getHibernateTemplate()
			.get(Application.class , id);
	}

	/**
	 * �־û�ָ����Applicationʵ��
	 * @param application ��Ҫ���־û���Applicationʵ��
	 * @return Applicationʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(Application application)
	{
		return (Integer)getHibernateTemplate()
			.save(application);
	}

	/**
	 * �޸�ָ����Applicationʵ��
	 * @param application ��Ҫ���޸ĵ�Applicationʵ��
	 */
	public void update(Application application)
	{
		getHibernateTemplate()
			.update(application);
	}

	/**
	 * ɾ��ָ����Applicationʵ��
	 * @param application ��Ҫ��ɾ����Applicationʵ��
	 */
	public void delete(Application application)
	{
		getHibernateTemplate()
			.delete(application);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Applicationʵ��
	 * @param id ��Ҫ��ɾ����Applicationʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����Applicationʵ��
	 * @return ���ݿ���ȫ����Applicationʵ��
	 */
	public List<Application> findAll()
	{
		return (List<Application>)getHibernateTemplate()
			.find("from Application");
	}

	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */ 
	public List<Application> findByEmp(Employee emp)
	{
		return (List<Application>)getHibernateTemplate()
			.find("from Application as a where "
			+ "a.attend.employee=?" , emp);
	}
}
