package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.Imagmsg;


/**
 * @author 打水的
 *
 */
/**
 * @author 打水的
 *
 */
public interface ImageDao
{
	/**
	 * 根据标识属性来加载Image实例
	 * @param id 需要加载的Image实例的标识属性值
	 * @return 指定标识属性对应的Image实例
	 */
	Imagmsg get(Integer id);

	/**
	 * 持久化指定的Image实例
	 * @param Image 需要被持久化的Image实例
	 * @return Image实例被持久化后的标识属性值
	 */
	Integer save(Imagmsg Image);

	/**
	 * 修改指定的Image实例
	 * @param Image 需要被修改的Image实例
	 */
	void update(Imagmsg Image);

	/**
	 * 删除指定的Image实例
	 * @param Image 需要被删除的Image实例
	 */
	void delete(Imagmsg Image);

	/**
	 * 根据标识属性删除Image实例
	 * @param id 需要被删除的Image实例的标识属性值
	 */
	void delete(Integer id);

	/**
	 * 2015-8-4
	 * 打水的
	 * @param catId
	 * @param pid
	 * @param imagetype
	 * @return
	 * Imagmsg
	 */
	Imagmsg findByImageId(Integer catId,Integer pid , Integer imagetype);
	/**
	 * 2015-8-5
	 * 打水的
	 * @param catId
	 * @param pid
	 * @param imagetype
	 * @return
	 * List<Imagmsg>
	 */
	List<Imagmsg> findByImageList(final Integer catId,final Integer pid , final Integer imagetype);
	
	
	/**
	 * 根据参数返回图片列表
	 * @param pageNo pageSize typeId
	 * @return 返回 Imagmsg List
	 */
	List<Imagmsg> findByStoreId(Integer pageNo,Integer pageSize, Integer typeId ,  Integer storeId);
	
	
	

	

	
	
	
}
