package com.keemo.petstore.service.impl;

import java.util.List;

import com.keemo.petstore.bean.Order;

import com.keemo.petstore.dao.OrderDao;
import com.keemo.petstore.service.MemManager;

public class MemManagerImpl 
     implements MemManager
{
    private OrderDao orderDao;
    public void setOrderDao(OrderDao orderDao)
	{
		this.orderDao = orderDao;
	}
	public List<Order> getOrdersbyUserid(Integer pageNo, Integer pageSize,
			Integer userid ,Integer ispay) {
		// TODO Auto-generated method stub
		List<Order> list=orderDao.findByUserid(userid, pageNo, pageSize, ispay);
		
		return list;
	}

	
	
}