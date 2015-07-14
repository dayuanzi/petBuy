package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;


public interface AdminDao
{
	/**
	 * 根据标识属性来加载Admin实例
	 * @param id 需要加载的Admin实例的标识属性值
	 * @return 指定标识属性对应的Admin实例
	 */
	Admin get(Integer id);

	/**
	 * 持久化指定的Admin实例
	 * @param Admin 需要被持久化的Admin实例
	 * @return Admin实例被持久化后的标识属性值
	 */
	String save(Admin Admin);

	/**
	 * 修改指定的Admin实例
	 * @param Admin 需要被修改的Admin实例
	 */
	void update(Admin Admin);

	/**
	 * 删除指定的Admin实例
	 * @param Admin 需要被删除的Admin实例
	 */
	void delete(Admin Admin);

	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	void delete(Integer id);
	
	/**
	 * 根据用户名密码查找用户用于登陆
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	public List<Admin> findByNameAndPass(Admin admin);
	
	
	/**
	 * 根据用户名查询用户
	 * @param  包含指定用户名的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByName(String username);
}
