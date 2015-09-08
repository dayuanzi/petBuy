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
	
	/**
	 * 2015-8-5
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * List<Breedingplan>
	 */
	List<Breedingplan> findByIndex(Integer pageNo,Integer pageSize);
	
	
	/**
	 * 2015-8-11
	 * 打水的
	 * @param catteryId
	 * @return
	 * List<Breedingplan>
	 */
	List<Breedingplan> findByCattery(Integer catteryId);
	
	
	
	/**------------ BreedingOrder--------------*/
	
	
	
	/**
	 * 根据标识属性来加载Breedingorder实例
	 * @param id 需要加载的Breedingorder实例的标识属性值
	 * @return 指定标识属性对应的Breedingorder实例
	 */
	Breedingorder getOrder(Integer id);

	/**
	 * 持久化指定的Breedingorder实例
	 * @param Breedingorder 需要被持久化的Breedingorder实例
	 * @return Breedingorder实例被持久化后的标识属性值
	 */
	Integer saveOrder(Breedingorder Breedingorder);

	/**
	 * 修改指定的Breedingorder实例
	 * @param Breedingorder 需要被修改的Breedingorder实例
	 */
	void updateOrder(Breedingorder Breedingorder);

	/**
	 * 删除指定的Breedingorder实例
	 * @param Breedingorder 需要被删除的Breedingorder实例
	 */
	void deleteOrder(Breedingorder Breedingorder);

	/**
	 * 根据标识属性删除Breedingplan实例
	 * @param id 需要被删除的Breedingplan实例的标识属性值
	 */
	void deleteOrder(Integer id);
	
/************************PlanRecord**************************/
	
	/**
	 * 根据标识属性来加载Planrecord实例
	 * @param id 需要加载的Planrecord实例的标识属性值
	 * @return 指定标识属性对应的Planrecord实例
	 */
	Planrecord getRecord(Integer id);
	/**
	 * 持久化指定的Planrecord实例
	 * @param Planrecord 需要被持久化的Planrecord实例
	 * @return Planrecord实例被持久化后的标识属性值
	 */
	public Integer saveRecord(Planrecord planrecord);

	/**
	 * 修改指定的Breedingorder实例
	 * @param Breedingorder 需要被修改的Breedingorder实例
	 */
	public void updateRecord(Planrecord planrecord);

	/**
	 * 删除指定的Breedingorder实例
	 * @param Breedingorder 需要被删除的Breedingorder实例
	 */
	public void deleteRecord(Planrecord planrecord);
	
	
	/**
	 * 根据标识属性删除Breedingorder实例
	 * @param id 需要被删除的Breedingorder实例的标识属性值
	 */
	public void deleteRecord(Integer id);

	
	
	/**
	 * 2015-8-28
	 * 打水的
	 * @param planid
	 * @return
	 * List<Planrecord>
	 */
	public List<Planrecord> findRecordListByPlanid(Integer planid);
}


