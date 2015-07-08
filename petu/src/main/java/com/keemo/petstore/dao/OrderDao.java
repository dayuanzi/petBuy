package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Order;


public interface OrderDao
{
	/**
	 * 根据标识属性来加载Order实例
	 * @param id 需要加载的Order实例的标识属性值
	 * @return 指定标识属性对应的Order实例
	 */
	Order get(Integer id);

	/**
	 * 持久化指定的Order实例
	 * @param Order 需要被持久化的Order实例
	 * @return Order实例被持久化后的标识属性值
	 */
	String save(Order order);

	/**
	 * 修改指定的Order实例
	 * @param Order 需要被修改的Order实例
	 */
	void update(Order order);

	/**
	 * 删除指定的Order实例
	 * @param Order 需要被删除的Order实例
	 */
	void delete(Order order);

	/**
	 * 根据标识属性删除Order实例
	 * @param id 需要被删除的Order实例的标识属性值
	 */
	void delete(Integer id);
	

	/**
	 * 根据默认返回猫咪列表
	 * @param pageNo pageSize 返回 Order List
	 */
	public List<Order> findByPage(Integer pageNo,Integer pageSize);

	
}
