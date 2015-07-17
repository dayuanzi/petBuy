package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.util.*;


public interface AdmManager
{
	//登录失败
	public static final int LOGIN_FAIL = 0;
	//登陆成功
	public static final int LOGIN_SUC = 1;
	
	
	Cat getCatById(Integer id);
	
	Cattery getCatteryById(Integer id);
	
	List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId , Integer rankId,Integer priceLow,Integer priceHigh);
	
	List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr);
	
	List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Integer regionId,Integer priceLow,Integer priceHigh);
	
	List<Cattery> getCatterybyQuery(Integer pageNo,Integer pageSize,String queryStr);
	
	List<Cat> getCatsbyCatteryId(Integer pageNo,Integer pageSize,Integer catteryId);
	

    


}