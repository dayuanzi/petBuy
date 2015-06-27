package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;


public interface CheckBackDao
{
	/**
	 * ���ݱ�ʶ����������CheckBackʵ��
	 * @param id ��Ҫ���ص�CheckBackʵ���ı�ʶ����ֵ
	 * @return ָ����ʶ���Զ�Ӧ��CheckBackʵ��
	 */
	CheckBack get(Integer id);

	/**
	 * �־û�ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ���־û���CheckBackʵ��
	 * @return CheckBackʵ�����־û���ı�ʶ����ֵ
	 */
	Integer save(CheckBack checkBack);

	/**
	 * �޸�ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ���޸ĵ�CheckBackʵ��
	 */
	void update(CheckBack checkBack);

	/**
	 * ɾ��ָ����CheckBackʵ��
	 * @param checkBack ��Ҫ��ɾ����CheckBackʵ��
	 */
	void delete(CheckBack checkBack);

	/**
	 * ���ݱ�ʶ����ɾ��CheckBackʵ��
	 * @param id ��Ҫ��ɾ����CheckBackʵ���ı�ʶ����ֵ
	 */
	void delete(Integer id);

	/**
	 * ��ѯȫ����CheckBackʵ��
	 * @return ���ݿ���ȫ����CheckBackʵ��
	 */
	List<CheckBack> findAll();
}
