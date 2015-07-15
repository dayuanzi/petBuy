package com.keemo.petstore.dao;

import java.util.List;

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Follow;
import com.keemo.petstore.bean.FollowId;

public interface FollowDao
{
	/**
	 * 根据标识属性来加载Follow实例
	 * @param id 需要加载的Follow实例的标识属性值
	 * @return 指定标识属性对应的Follow实例
	 */
	Follow get(FollowId id);

	/**
	 * 持久化指定的Follow实例
	 * @param Follow 需要被持久化的Follow实例
	 * @return Follow实例被持久化后的标识属性值
	 */
	Integer save(Follow follow);


	/**
	 * 删除指定的Follow实例
	 * @param Follow 需要被删除的Follow实例
	 */
	void delete(Follow follow);

	

	/**
	 * 根据默认返回关注列表
	 * @param pageNo pageSize userid
	 * @return 返回 Follow List
	 */
	public List<Cattery> findByUserId(Integer pageNo,Integer pageSize,Integer userid);
	
	

	
}