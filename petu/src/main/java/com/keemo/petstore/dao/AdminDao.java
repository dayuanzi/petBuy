package com.keemo.petstore.dao;

import java.util.*; 

import com.keemo.petstore.bean.*;



public interface AdminDao
{
	
	
	
	/**
	 * 根据标识属性来加载Admin实例
	 * @param id 需要加载的Admin实例的标识属性值
	 * @return 指定标识属性对应的Admin实例
	 */
	Admin get(Integer id);

	/**
	 * 持久化指定的Admin实例
	 * @param Admin 需要被持久化的Admin实例
	 * @return Admin实例被持久化后的标识属性值
	 */
	Integer save(Admin Admin);

	/**
	 * 修改指定的Admin实例
	 * @param Admin 需要被修改的Admin实例
	 */
	void update(Admin Admin);

	/**
	 * 删除指定的Admin实例
	 * @param Admin 需要被删除的Admin实例
	 */
	void delete(Admin Admin);

	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	void delete(Integer id);
	
	/**
	 * 根据用户名密码查找用户用于登陆
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	public List<Admin> findByNameAndPass(Admin admin);
	
	
	/**
	 * 根据用户名查询用户
	 * @param  包含指定用户名的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByName(String username);
	
	/**
	 * 根据email，password获取一条记录
	 * 
	 * @param email
	 *            电子邮箱
	 * @param password
	 *            密码
	 * @return 根据email，password返回相应值的一条记录
	 */
	public Admin getByEmailAndPassword(String email, String password);

	/**
	 * 根据email，password，active获取一条记录
	 * 
	 * @param email
	 *            电子邮箱
	 * @param password
	 *            密码
	 * @param active
	 * @return 根据email，password，active返回相应值的一条记录
	 */
	public Admin getByEmailAndPassword(String email, String password, int active);
	
	
	/**
	 * 2015-8-6
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * List<Admin>
	 */
	List<Admin> getAdminByManager(Integer pageNo,Integer pageSize);
	
	/**
	 * 2015-8-6
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * List<Admin>
	 */
	List<Admin> getUserByManager(Integer pageNo,Integer pageSize);
	
	/*******************************Activericode***********************************/
	/**
	 * 根据标识属性来加载Activericode实例
	 * @param id 需要加载的Activericode实例的标识属性值
	 * @return 指定标识属性对应的Activericode实例
	 */
	Activericode getActivericodeById(Integer id);

	/**
	 * 持久化指定的Activericode实例
	 * @param Activericode 需要被持久化的Activericode实例
	 * @return Activericode实例被持久化后的标识属性值
	 */
	Integer save(Activericode Activericode);


	/**
	 * 删除指定的Activericode实例
	 * @param Activericode 需要被删除的Activericode实例
	 */
	void delete(Activericode Activericode);

	/**
	 * 根据标识属性删除Activericode实例
	 * @param id 需要被删除的Activericode实例的标识属性值
	 */
	void deleteActivericodeById(Integer id);
	
	/**
	 * 根据标识属性查找实例
	 * @param username 需要被删除的Activericode实例的标识属性值
	 * @param vericode 
	 */
	List<Activericode> findActivericodeByUsernameandPass(Integer userid,String vericode);

	
}
