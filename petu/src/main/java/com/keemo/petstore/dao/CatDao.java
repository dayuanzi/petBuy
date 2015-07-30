package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;


public interface CatDao
{
	/**
	 * 根据标识属性来加载Cat实例
	 * @param id 需要加载的Cat实例的标识属性值
	 * @return 指定标识属性对应的Cat实例
	 */
	Cat get(Integer id);

	/**
	 * 持久化指定的Cat实例
	 * @param Cat 需要被持久化的Cat实例
	 * @return Cat实例被持久化后的标识属性值
	 */
	Integer save(Cat Cat);

	/**
	 * 修改指定的Cat实例
	 * @param Cat 需要被修改的Cat实例
	 */
	void update(Cat Cat);

	/**
	 * 删除指定的Cat实例
	 * @param Cat 需要被删除的Cat实例
	 */
	void delete(Cat Cat);

	/**
	 * 根据标识属性删除Cat实例
	 * @param id 需要被删除的Cat实例的标识属性值
	 */
	void delete(Integer id);
	

	/**
	 * 根据页面、种类、等级、价格区间返回猫咪列表
	 * @param pageNo pageSize typeId rankId priceLow priceHigh 
	 * @return 返回 Cat List
	 */
	public List<Cat> findByPage(Integer pageNo,Integer pageSize, Integer typeId, Integer rankId,Integer priceLow,Integer priceHigh);
	
	
	
	/**
	 * 根据搜索返回猫咪列表
	 * @param pageNo pageSize queryStr
	 * @return 返回 Cat List
	 */
	public List<Cat> findByQuery(Integer pageNo,Integer pageSize,String queryStr);
	
	
	/**
	 * 根据猫舍id返回猫咪列表
	 * @param pageNo pageSize catteryId
	 * @return 返回 Cat List
	 */
	public List<Cat> findByCattery(Integer pageNo,Integer pageSize,Integer catteryId);
	
	

	
}
