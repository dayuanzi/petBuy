package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;



public interface AddressDao
{
	
	
	
	/**
	 * 根据标识属性来加载Address实例
	 * @param id 需要加载的Address实例的标识属性值
	 * @return 指定标识属性对应的Address实例
	 */
	Address get(Integer id);

	/**
	 * 持久化指定的Address实例
	 * @param Address 需要被持久化的Address实例
	 * @return Address实例被持久化后的标识属性值
	 */
	Integer save(Address Address);

	/**
	 * 修改指定的Address实例
	 * @param Address 需要被修改的Address实例
	 */
	void update(Address Address);

	/**
	 * 删除指定的Address实例
	 * @param Address 需要被删除的Address实例
	 */
	void delete(Address Address);

	/**
	 * 根据标识属性删除Address实例
	 * @param id 需要被删除的Address实例的标识属性值
	 */
	void delete(Integer id);
	/**
	 * 根据用户id属性返回List Address实例
	 * @param userid 需要被返回的Address列表的实例的用户id属性值
	 */
	List<Address> findByUser(Integer userid,Byte defaultstatus);
	

}
