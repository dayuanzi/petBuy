package com.keemo.petstore.service.impl;

import com.keemo.petstore.bean.Activericode;

import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Breedingplan;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.vo.*;
import com.keemo.petstore.exception.*;
import com.keemo.petstore.service.AdmManager;

import com.keemo.petstore.dao.BreedingPlanDao;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.CatteryDao;
import com.keemo.petstore.dao.CartDao;
import com.keemo.petstore.dao.OrderDao;
import org.springframework.cache.annotation.*;

import java.text.*;
import java.util.*;


public class AdmManagerImpl
	implements AdmManager
{

	private CatDao catDao;
	private CatteryDao catteryDao;
	private CartDao cartDao;
	private BreedingPlanDao breedingPlanDao;

	public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}
	public void setCatteryDao(CatteryDao catteryDao)
	{
		this.catteryDao = catteryDao;
	}
	public void setCartDao(CartDao cartDao)
	{
		this.cartDao = cartDao;
	}
	public void setBreedingPlanDao(BreedingPlanDao breedingPlanDao)
	{
		this.breedingPlanDao = breedingPlanDao;
	}
	
	@Cacheable(value = "users", key="'catby'+#id")
	public Cat getCatById(Integer id){
		return catDao.get(id);
	}
	
	@Cacheable(value = "users", key="'catteryby'+#id")
	public Cattery getCatteryById(Integer id){
		return catteryDao.get(id);
	}


	public List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Byte stalen,Double priceLow,Double priceHigh)
	{
		
		List<Cat> list = catDao.findByPage(pageNo, pageSize, typeId, rankId,stalen,priceLow,priceHigh);
		return list;
	
	}
	
	public List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr,Integer typeId, Integer rankId,Byte stalen,Double priceLow,Double priceHigh)
	{
		
		List<Cat> list = catDao.findByQuery(pageNo, pageSize , queryStr, typeId, rankId,stalen, priceLow, priceHigh);
		return list;
	}
	
	public List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Integer regionId,Integer priceLow,Integer priceHigh)
	{
	
		List<Cattery> list = catteryDao.findByPage(pageNo,pageSize,typeId,rankId,regionId,priceLow,priceHigh);
		
		return list;
	}
	
	
	public List<Cattery> getCatterybyQuery(Integer pageNo,Integer pageSize,String queryStr)
	{
	
		List<Cattery> list = catteryDao.findByQuery(pageNo,pageSize,queryStr);
		
		return list;
	}
	
	@Cacheable(value = "users", key="'catsbycattery'+#pageNo+#pageSize+#catteryId")
	public List<Cat> getCatsbyCatteryId(Integer catteryId) throws Exception
	{
		try{
			return catDao.findByCattery(catteryId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		
	}
	/******************************planlist************************************/
	
	@Cacheable(value = "users" ,key = "'planlistbycattery'+#catteryId")
	public List<Breedingplan> getPlanListByCattery(Integer catteryId) throws Exception{
	try {
			return breedingPlanDao.findByCattery(catteryId);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	
	
	@Cacheable(value = "users" ,key = "'planlist'+#pageNo+#pageSize")
	public List<Breedingplan> getPlanList(Integer pageNo,Integer pageSize){
		
		return breedingPlanDao.findByIndex(pageNo, pageSize);
		
	}
	
}