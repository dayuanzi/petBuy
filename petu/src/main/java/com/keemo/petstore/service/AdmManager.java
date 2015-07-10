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
	

	/**
	 * 以买家身份来验证登录
	 * @param admin 登录的实例信息
	 * @return 登录后的身份确认:0为登录失败，1为登录成功
	 */
	int validLogin(Admin admin);
	
	Cat getCatById(Integer id);
	
	Cattery getCatteryById(Integer id);
	
	List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId , Integer rankId,Integer priceLow,Integer priceHigh);
	
	List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr);
	
	List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize);
	

}