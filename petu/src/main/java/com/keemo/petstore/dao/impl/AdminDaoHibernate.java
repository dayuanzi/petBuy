package com.keemo.petstore.dao.impl;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.AdminDao;


public class AdminDaoHibernate extends YeekuHibernateDaoSupport implements AdminDao
{

	/**
	 * 根据标识属性来加载Admin实例
	 * @param id 需要加载的Admin实例的标识属性值
	 * @return 指定标识属性对应的Admin实例
	 */
	public Admin get(Integer id)
	{
		return null;}

	/**
	 * 持久化指定的Admin实例
	 * @param Admin 需要被持久化的Admin实例
	 * @return Admin实例被持久化后的标识属性值
	 */
	public Integer save(Admin Admin) {
		return null;
	}

	/**
	 * 修改指定的Admin实例
	 * @param Admin 需要被修改的Admin实例
	 */
	public void update(Admin Admin) {
	}

	/**
	 * 删除指定的Admin实例
	 * @param Admin 需要被删除的Admin实例
	 */
	public void delete(Admin Admin) {
	}

	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	public void delete(Integer id) {
	}
	
}
