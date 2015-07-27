package com.keemo.petstore.service;


import java.util.Date;
import java.util.List;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;


public interface MemManager {
	
	
	List<Order> getOrdersbyUserid(Integer pageNo,Integer pageSize,Integer userid,Byte ispay);
	
	void saveOrder(Order order) throws Exception;
	
	List<Cat> getOwnedCatsbyUserid(Integer pageNo,Integer pageSize,Integer userid);
	
	List<Cart>  getCartbyUserid(Integer pageNo,Integer pageSize,Integer userid);
	
	void saveCart(Cart cart) throws Exception;
	
	List<Cattery> getFollowedCatterybyUserid(Integer pageNo,Integer pageSize,Integer userid);
	
	void updateAdmin(Admin admin);
	
	Admin getAdmin(Integer id);
	
	boolean checkUsername(String username);
		
	String saveVericode(Integer userid  , String vericode);
	
	List<Activericode> checkVericode(Integer userid , String vericode);
	
	/**
	 * 保存Address方法
	 * @param Address 需要被保存的Address实例
	 * return boolean 返回是否保存成功
	 */
	Integer saveAddress(Address address);
	
	Address getAddress(Integer addressid);
	
	List<Address> getAddressByUser(Integer userid);

	/**
	 * 根据用户id和地址id属性设置默认地址
	 * @param userid 需要被返回的Address列表的实例的用户id属性值
	 * @param addressid 需要被返回的Address列表的实例的地址id属性值
	 */
	public void setAddressDefault(Integer userid,Integer addressid) throws Exception;
	
	
}
