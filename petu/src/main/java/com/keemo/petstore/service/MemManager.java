package com.keemo.petstore.service;


import java.util.List;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;


public interface MemManager {
	
	
	
	
	List<Order> getOrdersbyUserid(Integer pageNo,Integer pageSize,Integer userid,Integer ispay);
}
