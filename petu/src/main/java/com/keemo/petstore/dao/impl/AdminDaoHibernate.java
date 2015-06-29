package com.keemo.petstore.dao.impl;

import java.util.List;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Manager;
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
		return getHibernateTemplate()
		.get(Admin.class , id);
		
	}

	/**
	 * �־û�ָ����Adminʵ��
	 * @param Admin ��Ҫ���־û���Adminʵ��
	 * @return Adminʵ�����־û���ı�ʶ����ֵ
	 */
	public String save(Admin Admin) {
		
		return (String)getHibernateTemplate()
		.save(Admin);
	}

	/**
	 * �޸�ָ����Adminʵ��
	 * @param Admin ��Ҫ���޸ĵ�Adminʵ��
	 */
	public void update(Admin Admin) {
		
		getHibernateTemplate()
		.update(Admin);
	}

	/**
	 * ɾ��ָ����Adminʵ��
	 * @param Admin ��Ҫ��ɾ����Adminʵ��
	 */
	public void delete(Admin Admin) {
		getHibernateTemplate()
		.delete(Admin);
	}

	/**
	 * ���ݱ�ʶ����ɾ��Adminʵ��
	 * @param id ��Ҫ��ɾ����Adminʵ���ı�ʶ����ֵ
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}
	
	/**
	 * �����û����������ѯ����
	 * @param emp ����ָ���û���������ľ���
	 * @return ����ָ���û���������ľ���
	 */ 
	public List<Admin> findByNameAndPass(Admin admin)
	{
		return (List<Admin>)getHibernateTemplate()
			.find("from Admin admin where admin.name = ? and admin.pass=?"
			, admin.getLoginName() , admin.getLoginPwd());
	}
	
}
