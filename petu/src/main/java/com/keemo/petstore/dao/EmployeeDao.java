package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;


public interface EmployeeDao
{
	/**
	 * ���ݱ�ʶ����������Employeeʵ��
	 * @param id ��Ҫ���ص�Employeeʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��Employeeʵ��
	 */
	Employee get(Integer id);

	/**
	 * �־û�ָ����Employeeʵ��
	 * @param employee ��Ҫ���־û���Employeeʵ��
	 * @return Employeeʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(Employee employee);

	/**
	 * �޸�ָ����Employeeʵ��
	 * @param employee ��Ҫ���޸ĵ�Employeeʵ��
	 */
	void update(Employee employee);

	/**
	 * ɾ��ָ����Employeeʵ��
	 * @param employee ��Ҫ��ɾ����Employeeʵ��
	 */
	void delete(Employee employee);

	/**
	 * ���ݱ�ʶ����ɾ��Employeeʵ��
	 * @param id ��Ҫ��ɾ����Employeeʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����Employeeʵ��
	 * @return ���ݿ���ȫ����Employeeʵ��
	 */
	List<Employee> findAll();

	/**
	 * �����û����������ѯԱ��
	 * @param emp ����ָ���û����������Ա��
	 * @return ����ָ���û����������Ա������
	 */ 
	List<Employee> findByNameAndPass(Employee emp);

	/**
	 * �����û�����ѯԱ��
	 * @param name Ա�����û���
	 * @return �����û�����Ա��
	 */ 
	Employee findByName(String name);

	/**
	 * ���ݾ����ѯԱ��
	 * @param mgr ����
	 * @return �þ����Ӧ������Ա��
	 */ 
	List<Employee> findByMgr(Manager mgr);
}
