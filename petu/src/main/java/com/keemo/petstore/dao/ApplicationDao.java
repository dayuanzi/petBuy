package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;


public interface ApplicationDao
{
	/**
	 * ���ݱ�ʶ����������Applicationʵ��
	 * @param id ��Ҫ���ص�Applicationʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Applicationʵ��
	 */
	Application get(Integer id);

	/**
	 * �־û�ָ����Applicationʵ��
	 * @param application ��Ҫ���־û���Applicationʵ��
	 * @return Applicationʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(Application application);

	/**
	 * �޸�ָ����Applicationʵ��
	 * @param application ��Ҫ���޸ĵ�Applicationʵ��
	 */
	void update(Application application);

	/**
	 * ɾ��ָ����Applicationʵ��
	 * @param application ��Ҫ��ɾ����Applicationʵ��
	 */
	void delete(Application application);

	/**
	 * ���ݱ�ʶ����ɾ��Applicationʵ��
	 * @param id ��Ҫ��ɾ����Applicationʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Applicationʵ��
	 * @return ���ݿ���ȫ����Applicationʵ��
	 */
	List<Application> findAll();

	/**
	 * ����Ա����ѯδ������춯����
	 * @param emp ��Ҫ��ѯ��Ա��
	 * @return ��Ա����Ӧ��δ������춯����
	 */ 
	List<Application> findByEmp(Employee emp);
}
