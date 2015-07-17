package com.keemo.petstore.dao;


import java.util.List;

import com.keemo.petstore.bean.*;


public interface BreedingPlanDao {
	
	/**
	 * 根据标识属性来加载Breedingplan实例
	 * @param id 需要加载的Breedingplan实例的标识属性值
	 * @return 指定标识属性对应的Breedingplan实例
	 */
	Breedingplan get(Integer id);

	/**
	 * 持久化指定的Breedingplan实例
	 * @param Breedingplan 需要被持久化的Breedingplan实例
	 * @return Breedingplan实例被持久化后的标识属性值
	 */
	Integer save(Breedingplan Breedingplan);

	/**
	 * 修改指定的Breedingplan实例
	 * @param Breedingplan 需要被修改的Breedingplan实例
	 */
	void update(Breedingplan Breedingplan);

	/**
	 * 删除指定的Breedingplan实例
	 * @param Breedingplan 需要被删除的Breedingplan实例
	 */
	void delete(Breedingplan Breedingplan);

	/**
	 * 根据标识属性删除Breedingplan实例
	 * @param id 需要被删除的Breedingplan实例的标识属性值
	 */
	void delete(Integer id);
	
	
	/**
	 * 根据猫舍id返回繁育计划列表
	 * @param pageNo pageSize storeId
	 * @return 返回 Breedingplan List
	 */
	public List<Breedingplan> findByStoreId(Integer pageNo,Integer pageSize,Integer storeId);
	
	/**
	 * 根据用户id返回繁育计划列表
	 * @param pageNo pageSize userId
	 * @return 返回 Breedingplan List
	 */
	public List<Breedingplan> findByUserId(Integer pageNo,Integer pageSize,Integer userId);
	
	
	
	

}


