package com.keemo.petstore.dao;

import java.util.List;

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Parentcat;

public interface ParentCatDao {

	/**
	 * 根据标识属性来加载Parentcat实例
	 * @param id 需要加载的Parentcat实例的标识属性值
	 * @return 指定标识属性对应的Parentcat实例
	 */
	Parentcat get(Integer id);

	/**
	 * 持久化指定的Parentcat实例
	 * @param Parentcat 需要被持久化的Parentcat实例
	 * @return Parentcat实例被持久化后的标识属性值
	 */
	Integer save(Parentcat parentcat);

	/**
	 * 修改指定的Parentcat实例
	 * @param Parentcat 需要被修改的Parentcat实例
	 */
	void update(Parentcat parentcat);

	/**
	 * 删除指定的Parentcat实例
	 * @param Parentcat 需要被删除的Parentcat实例
	 */
	void delete(Parentcat parentcat);

	/**
	 * 根据标识属性删除Parentcat实例
	 * @param id 需要被删除的Parentcat实例的标识属性值
	 */
	void delete(Integer id);
	

	/**
	 * 根据标识属性删除Parentcat实例
	 * @param id 需要被删除的Parentcat实例的标识属性值
	 */
	public List<Parentcat> findByStoreId(Integer pageNo,Integer pageSize,Integer catteryId);
	
	
	

	
	
	
	
}
