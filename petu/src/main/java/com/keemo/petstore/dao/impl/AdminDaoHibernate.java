package com.keemo.petstore.dao.impl;
import java.util.List;

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
		return getHibernateTemplate()
		.get(Admin.class , id);
		
	}

	/**
	 * 持久化指定的Admin实例
	 * @param Admin 需要被持久化的Admin实例
	 * @return Admin实例被持久化后的标识属性值
	 */
	public String save(Admin Admin) {
		
		return (String)getHibernateTemplate()
		.save(Admin);
	}

	/**
	 * 修改指定的Admin实例
	 * @param Admin 需要被修改的Admin实例
	 */
	public void update(Admin Admin) {
		
		getHibernateTemplate()
		.update(Admin);
	}

	/**
	 * 删除指定的Admin实例
	 * @param Admin 需要被删除的Admin实例
	 */
	public void delete(Admin Admin) {
		getHibernateTemplate()
		.delete(Admin);
	}

	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}
	
	/**
	 * 根据用户名和密码查询用户
	 * @param  包含指定用户名、密码的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByNameAndPass(Admin admin)
	{

		return (List<Admin>)getHibernateTemplate()
			.find("from Admin admin where admin.username = ? and admin.password=?"
			, admin.getUsername() , admin.getPassword());
	}
	
	/**
	 * 根据用户名查询用户
	 * @param  包含指定用户名的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByName(String username)
	{

		return (List<Admin>)getHibernateTemplate()
			.find("from Admin admin where admin.username = ?"
			,username);
	}
	
}

