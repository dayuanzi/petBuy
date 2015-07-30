package com.keemo.petstore.dao;

import java.util.*; 


import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cattery;


/**
 * @author 打水的
 *
 */
/**
 * @author 打水的
 *
 */
/**
 * @author 打水的
 *
 */
public interface CartDao
{
	/**
	 * 根据标识属性来加载Cart实例
	 * @param id 需要加载的Cart实例的标识属性值
	 * @return 指定标识属性对应的Cart实例
	 */
	Cart get(Integer id);

	/**
	 * 持久化指定的Cart实例
	 * @param Cart 需要被持久化的Cart实例
	 * @return Cart实例被持久化后的标识属性值
	 */
	Integer save(Cart Cart);

	/**
	 * 修改指定的Cart实例
	 * @param Cart 需要被修改的Cart实例
	 */
	void update(Cart Cart);

	/**
	 * 删除指定的Cart实例
	 * @param Cart 需要被删除的Cart实例
	 */
	void delete(Cart Cart);

	/**
	 * 根据标识属性删除Cart实例
	 * @param id 需要被删除的Cart实例的标识属性值
	 */
	void delete(Integer id);
	
	/**
	 * 根据用户id返回购物车列表
	 * @param pageNo
	 * @param pageSize
	 * @param userid
	 * @param ispay
	 */
	public List<Cart> findByUserid(Integer userid,Integer catteryid, Integer pageNo,Integer pageSize);
	

	/**
	 * 根据猫舍id返回猫咪列表
	 * @param pageNo pageSize catteryId
	 * @return 返回 Cat List
	 */
	public List<Cattery> findCatteryAtCart(Integer pageNo,Integer pageSize,Integer userId);
	
	
	
	
	
	
	
}
