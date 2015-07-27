package com.keemo.petstore.dao.impl;
import java.util.List;

import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Address;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.AddressDao;

public class AddressDaoHibernate extends YeekuHibernateDaoSupport implements AddressDao
{

	/**
	 * 根据标识属性来加载Address实例
	 * @param id 需要加载的Address实例的标识属性值
	 * @return 指定标识属性对应的Address实例
	 */
	public Address get(Integer id)
	{
		return getHibernateTemplate()
		.get(Address.class , id);
		
	}

	/**
	 * 持久化指定的Address实例
	 * @param Address 需要被持久化的Address实例
	 * @return Address实例被持久化后的标识属性值
	 */
	public Integer save(Address address) {
		
		return (Integer)getHibernateTemplate()
		.save(address);
	}

	/**
	 * 修改指定的Address实例
	 * @param Address 需要被修改的Address实例
	 */
	public void update(Address Address) {
		
		getHibernateTemplate()
		.update(Address);
	}

	/**
	 * 删除指定的Address实例
	 * @param Address 需要被删除的Address实例
	 */
	public void delete(Address Address) {
		getHibernateTemplate()
		.delete(Address);
	}

	/**
	 * 根据标识属性删除Address实例
	 * @param id 需要被删除的Address实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}
	
	
	public List<Address> findByUser(Integer userid,Byte defaultstatus)
	{
		if (defaultstatus != null)
		{
			
		
		return (List<Address>)getHibernateTemplate()
			.find("from Address address where userid = ? and defaultMain = ?"
			,userid,defaultstatus);
		
		
		}
		
		return (List<Address>)getHibernateTemplate()
		.find("from Address address where userid = ?"
		,userid);
	}
	
	
}

