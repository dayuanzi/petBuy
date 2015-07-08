package com.keemo.petstore.service.impl;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.vo.*;
import com.keemo.petstore.exception.*;
import com.keemo.petstore.service.AdmManager;
import com.keemo.petstore.dao.AdminDao;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.CatteryDao;

import java.text.*;
import java.util.*;


public class AdmManagerImpl
	implements AdmManager
{
	private AdminDao adminDao;
	private CatDao catDao;
	private CatteryDao catteryDao;
	public void setAdminDao(AdminDao adminDao)
	{
		this.adminDao = adminDao;
	}
	
	public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}
	public void setCatteryDao(CatteryDao catteryDao)
	{
		this.catteryDao = catteryDao;
	}

	
	/**
	 * 验证登录
	 * @param admin登录的经理身份
	 * @return 登录后的身份确认:0为登录失败，1为登录成功
	 */
	public int validLogin(Admin admin)
	{
		//如果找到一个经理，以经理登录
		if (adminDao.findByNameAndPass(admin).size()>= 1)
		{
			return LOGIN_SUC;
		}
		else
		{
			return LOGIN_FAIL;
		}
	}
	
	public Cat getCatById(Integer id){
		return catDao.get(id);
	}
	
	public Cattery getCatteryById(Integer id){
		return catteryDao.get(id);
	}

	
	public List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Integer priceLow,Integer priceHigh)
	{
		
		List<Cat> list = catDao.findByPage(pageNo, pageSize, typeId, rankId,priceLow,priceHigh);
		return list;
	
	}
	
	public List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize){
		
		List<Cattery> list = catteryDao.findByPage(pageNo, pageSize);
		return list;
	}
	

}