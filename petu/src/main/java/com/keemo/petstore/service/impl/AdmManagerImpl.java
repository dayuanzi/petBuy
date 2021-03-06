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
	
	
	public Cat getCatById(Integer id){
		return catDao.get(id);
	}
	
	public Cattery getCatteryById(Integer id){
		return catteryDao.get(id);
	}

	
	public List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Double priceLow,Double priceHigh)
	{
		
		List<Cat> list = catDao.findByPage(pageNo, pageSize, typeId, rankId,priceLow,priceHigh);
		return list;
	
	}
	
	public List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr)
	{
		
		List<Cat> list = catDao.findByQuery(pageNo, pageSize , queryStr);
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
	
	public List<Cat> getCatsbyCatteryId(Integer pageNo,Integer pageSize,Integer catteryId)
	{
		List<Cat> list = catDao.findByCattery(pageNo, pageSize, catteryId);
		return list;
		
	}
	
	public List<Breedingplan> getPlanList(Integer pageNo,Integer pageSize){
		
		return breedingPlanDao.findByIndex(pageNo, pageSize);
		
	}
	
}