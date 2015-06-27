package com.keemo.petstore.dao.impl;

import java.util.*; 

import com.keemo.petstore.bean.*;
import com.keemo.petstore.common.hibernate3.support.*;
import com.keemo.petstore.dao.*;

import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.CheckBackDao;


public class CheckBackDaoHibernate
	extends YeekuHibernateDaoSupport
	implements CheckBackDao
{
	/**
	 * ���ݱ�ʶ����������CheckBackʵ��
	 * @param id ��Ҫ���ص�CheckBackʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��CheckBackʵ��
	 */
	public CheckBack get(Integer id)
	{
		return getHibernateTemplate()
			.get(CheckBack.class , id);
	}

	/**
	 * �־û�ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ���־û���CheckBackʵ��
	 * @return CheckBackʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(CheckBack checkBack)
	{
		return (Integer)getHibernateTemplate()
			.save(checkBack);
	}

	/**
	 * �޸�ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ���޸ĵ�CheckBackʵ��
	 */
	public void update(CheckBack checkBack)
	{
		getHibernateTemplate()
			.update(checkBack);
	}

	/**
	 * ɾ��ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ��ɾ����CheckBackʵ��
	 */
	public void delete(CheckBack checkBack)
	{
		getHibernateTemplate()
			.delete(checkBack);
	}

	/**
	 * ���ݱ�ʶ����ɾ��CheckBackʵ��
	 * @param id ��Ҫ��ɾ����CheckBackʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����CheckBackʵ��
	 * @return ���ݿ���ȫ����CheckBackʵ��
	 */
	public List<CheckBack> findAll()
	{
		return (List<CheckBack>)getHibernateTemplate()
			.find("from CheckBack");
	}
}
