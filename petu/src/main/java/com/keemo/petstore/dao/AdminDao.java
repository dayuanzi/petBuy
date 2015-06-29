package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;


public interface AdminDao
{
	/**
	 * ���ݱ�ʶ����������Adminʵ��
	 * @param id ��Ҫ���ص�Adminʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Adminʵ��
	 */
	Admin get(Integer id);

	/**
	 * �־û�ָ����Adminʵ��
	 * @param Admin ��Ҫ���־û���Adminʵ��
	 * @return Adminʵ�����־û���ı�ʶ����ֵ
	 */
	String save(Admin Admin);

	/**
	 * �޸�ָ����Adminʵ��
	 * @param Admin ��Ҫ���޸ĵ�Adminʵ��
	 */
	void update(Admin Admin);

	/**
	 * ɾ��ָ����Adminʵ��
	 * @param Admin ��Ҫ��ɾ����Adminʵ��
	 */
	void delete(Admin Admin);

	/**
	 * ���ݱ�ʶ����ɾ��Adminʵ��
	 * @param id ��Ҫ��ɾ����Adminʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);
	
	/**
	 * �����û�����������û����ڵ�½
	 * @param id ��Ҫ��ɾ����Adminʵ���ı�ʶ����ֵ
	 */
	public List<Admin> findByNameAndPass(Admin admin);
}
