package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.Cattery;;


public interface CatteryDao
{
	/**
	 * 根据标识属性来加载Cattery实例
	 * @param id 需要加载的Cattery实例的标识属性值
	 * @return 指定标识属性对应的Cattery实例
	 */
	Cattery get(Integer id);

	/**
	 * 持久化指定的Cattery实例
	 * @param Cattery 需要被持久化的Cattery实例
	 * @return Cattery实例被持久化后的标识属性值
	 */
	Integer save(Cattery Cattery);

	/**
	 * 修改指定的Cattery实例
	 * @param Cattery 需要被修改的Cattery实例
	 */
	void update(Cattery Cattery);

	/**
	 * 删除指定的Cattery实例
	 * @param Cattery 需要被删除的Cattery实例
	 */
	void delete(Cattery Cattery);

	/**
	 * 根据标识属性删除Cattery实例
	 * @param id 需要被删除的Cattery实例的标识属性值
	 */
	void delete(Integer id);
	

	/**
	 * 根据页面、种类、等级、地域、价格区间返回猫舍列表
	 * @param pageNo pageSize typeId rankId regionId priceLow priceHigh 
	 * @return 返回 Cattery List
	 */
	public List<Cattery> findByPage(Integer pageNo,Integer pageSize, Integer typeId, Integer rankId,Integer regionId,Integer priceLow,Integer priceHigh);
	/**
	 * 根据页面、搜索关键字返回猫舍列表
	 * @param pageNo pageSize catteryQuery
	 * @return 返回 Cattery List
	 */
	public List<Cattery> findByQuery(Integer pageNo,Integer pageSize,String catteryQuery);
	
	

	
	
}
