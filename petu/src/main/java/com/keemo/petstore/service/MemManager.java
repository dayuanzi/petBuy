package com.keemo.petstore.service;


import java.util.Date;
import java.util.List;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;


public interface MemManager {
	
	
	/**根据userid获取订单Order列表
	 * 2015-7-27
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param userid
	 * @param ispay
	 * @return
	 * List<Order>
	 */
	List<Order> getOrdersbyUserid(Integer pageNo,Integer pageSize,Integer userid,Byte ispay);
	
	
	
	/**下订单
	 * 2015-7-30
	 * 打水的
	 * @param cartlist
	 * @param userid
	 * @return
	 * @throws Exception
	 * boolean
	 */
	boolean addOrder(List<Cart> cartlist,Integer userid,Integer addressid) throws Exception;
	
	
	/**通过用户userid获取已买到的猫咪
	 * 2015-7-27
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param userid
	 * @return
	 * List<Cat>
	 */
	List<Cat> getOwnedCatsbyUserid(Integer pageNo,Integer pageSize,Integer userid);
	
	/**通过用户userid获取购物车信息
	 * 2015-7-27
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param userid
	 * @return
	 * List<List<Cart>>
	 */
	List<List<Cart>>  getCartbyUserid(Integer pageNo,Integer pageSize,Integer userid) throws Exception;
	
	/**保存购物车
	 * 2015-7-27
	 * 打水的
	 * @param cart
	 * @throws Exception
	 * void
	 */
	void saveCart(Cart cart) throws Exception;
	
	/**根据用户userid获取关注的猫舍
	 * 2015-7-27
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param userid
	 * @return
	 * List<Cattery>
	 */
	List<Cattery> getFollowedCatterybyUserid(Integer pageNo,Integer pageSize,Integer userid);
	
	/**更新用户
	 * 2015-7-27
	 * 打水的
	 * @param admin
	 * void
	 */
	void updateAdmin(Admin admin);
	
	/**获取用户信息
	 * 2015-7-27
	 * 打水的
	 * @param id
	 * @return
	 * Admin
	 */
	Admin getAdmin(Integer id);
	
	/**验证用户名（邮箱）
	 * 2015-7-27
	 * 打水的
	 * @param username
	 * @return
	 * boolean
	 */
	boolean checkUsername(String username);
		
	/**保存验证码
	 * 2015-7-27
	 * 打水的
	 * @param userid
	 * @param vericode
	 * @return
	 * String
	 */
	String saveVericode(Integer userid  , String vericode);
	
	/**检查验证码
	 * 2015-7-27
	 * 打水的
	 * @param userid
	 * @param vericode
	 * @return
	 * List<Activericode>
	 */
	List<Activericode> checkVericode(Integer userid , String vericode);
	
	/**
	 * 保存Address方法
	 * @param Address 需要被保存的Address实例
	 * return boolean 返回是否保存成功
	 */
	Integer saveAddress(Address address);
	
	/**根据地址id获取地址信息
	 * 2015-7-27
	 * 打水的
	 * @param addressid
	 * @return
	 * Address
	 */
	Address getAddress(Integer addressid);
	
	/**根据用户id获取地址列表
	 * 2015-7-27
	 * 打水的
	 * @param userid
	 * @return
	 * List<Address>
	 */
	List<Address> getAddressByUser(Integer userid);

	/**
	 * 根据用户id和地址id属性设置默认地址
	 * @param userid 需要被返回的Address列表的实例的用户id属性值
	 * @param addressid 需要被返回的Address列表的实例的地址id属性值
	 */
	public void setAddressDefault(Integer userid,Integer addressid) throws Exception;
	
	
	
	/**
	 * 2015-7-31
	 * 打水的
	 * @param breedingorder
	 * @return
	 * @throws Exception
	 * boolean
	 */
	public boolean addPlanOrder(Breedingorder breedingorder) throws Exception;
	
	/**
	 * 2015-7-31
	 * 打水的
	 * @param cartlist
	 * @return
	 * @throws Exception
	 * List<List<Cat>>
	 */
	public List<List<Cat>> getCatsByCart(List<Cart> cartlist) throws Exception;
	
}
