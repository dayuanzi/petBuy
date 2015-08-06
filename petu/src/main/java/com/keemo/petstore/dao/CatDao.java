package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Parentcat;


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
	public List<Cat> findByPage(Integer pageNo,Integer pageSize, Integer typeId, Integer rankId,Double priceLow,Double priceHigh);
	
	
	
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
	
	
	
	/*******************ParentCat**************************/
	
	/**
	 * 持久化指定的Parentcat实例
	 * @param Parentcat 需要被持久化的Parentcat实例
	 * @return Parentcat实例被持久化后的标识属性值
	 */
	public Integer saveParentcat(Parentcat parentcat);
	

	/**
	 * 修改指定的Parentcat实例
	 * @param Parentcat 需要被修改的Parentcat实例
	 */
	public void updateParentcat(Parentcat parentcat);

	/**
	 * 删除指定的Parentcat实例
	 * @param Parentcat 需要被删除的Parentcat实例
	 */
	public void deleteParentcat(Parentcat parentcat);

	/**
	 * 根据标识属性删除Parentcat实例
	 * @param id 需要被删除的Parentcat实例的标识属性值
	 */
	public void deleteParentcat(Integer id);
	
	
	/**
	 * 2015-7-31
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param catteryId
	 * @return
	 * List<Parentcat>
	 */
	public List<Parentcat> findByStoreId(Integer pageNo,Integer pageSize,Integer catteryId);

	
}
