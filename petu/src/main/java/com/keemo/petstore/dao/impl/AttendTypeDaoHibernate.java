package com.keemo.petstore.dao.impl;

import java.util.*; 

import com.keemo.petstore.bean.*;
import com.keemo.petstore.common.hibernate3.support.*;
import com.keemo.petstore.dao.*;

import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.AttendTypeDao;


public class AttendTypeDaoHibernate
	extends YeekuHibernateDaoSupport
	implements AttendTypeDao
{
	/**
	 * ���ݱ�ʶ����������AttendTypeʵ��
	 * @param id ��Ҫ���ص�AttendTypeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��AttendTypeʵ��
	 */
	public AttendType get(Integer id)
	{
		return getHibernateTemplate()
			.get(AttendType.class , id);
	}

	/**
	 * �־û�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���־û���AttendTypeʵ��
	 * @return AttendTypeʵ�����־û���ı�ʶ����ֵ
	 */
	public Integer save(AttendType attendType)
	{
		return (Integer)getHibernateTemplate()
			.save(attendType);
	}

	/**
	 * �޸�ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ���޸ĵ�AttendTypeʵ��
	 */
	public void update(AttendType attendType)
	{
		getHibernateTemplate()
			.update(attendType);
	}

	/**
	 * ɾ��ָ����AttendTypeʵ��
	 * @param attendType ��Ҫ��ɾ����AttendTypeʵ��
	 */
	public void delete(AttendType attendType)
	{
		getHibernateTemplate()
			.delete(attendType);
	}

	/**
	 * ���ݱ�ʶ����ɾ��AttendTypeʵ��
	 * @param id ��Ҫ��ɾ����AttendTypeʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate()
			.delete(get(id));
	}

	/**
	 * ��ѯȫ����AttendTypeʵ��
	 * @return ���ݿ���ȫ����AttendTypeʵ��
	 */
	public List<AttendType> findAll()
	{
		return (List<AttendType>)getHibernateTemplate()
			.find("from AttendType");
	}
}
