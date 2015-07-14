package com.keemo.petstore.service.impl;

import java.util.List;

import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Order;

import com.keemo.petstore.dao.CartDao;
import com.keemo.petstore.dao.FollowDao;
import com.keemo.petstore.dao.OrderDao;
import com.keemo.petstore.service.MemManager;

public class MemManagerImpl 
     implements MemManager
{
    private OrderDao orderDao;
    private CartDao cartDao;
    private FollowDao followDao;
    public void setOrderDao(OrderDao orderDao)
	{
		this.orderDao = orderDao;
	}
    public void setCartDao(CartDao cartDao)
	{
		this.cartDao = cartDao;
	}
    public void setFollowDao(FollowDao followDao)
	{
		this.followDao = followDao;
	}
	public List<Order> getOrdersbyUserid(Integer pageNo, Integer pageSize,
			Integer userid ,Byte ispay) {
		// TODO Auto-generated method stub
		List<Order> list=orderDao.findByUserid(userid, pageNo, pageSize, ispay);
		
		return list;
	}
	public List<Cat> getOwnedCatsbyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return orderDao.findByOwnCats(userid, pageNo, pageSize);
	}
	
	public List<Cart> getCartbyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return cartDao.findByUserid(userid, pageNo, pageSize);
	}
	public List<Cattery> getFollowedCatterybyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return followDao.findByUserId(pageNo, pageSize, userid);
	}
}
