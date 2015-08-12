package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.util.*;


public interface AdmManager
{

	
	Cat getCatById(Integer id);
	
	Cattery getCatteryById(Integer id);
	
	List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId , Integer rankId,Double pricelow,Double pricehigh);
	
	/**
	 * 2015-8-12
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param queryStr
	 * @param typeId
	 * @param rankId
	 * @param pricelow
	 * @param pricehigh
	 * @return
	 * List<Cat>
	 */
	List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr,Integer typeId , Integer rankId,Double pricelow,Double pricehigh);
	
	List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Integer regionId,Integer priceLow,Integer priceHigh);
	
	List<Cattery> getCatterybyQuery(Integer pageNo,Integer pageSize,String queryStr);
	
	/**
	 * 2015-8-11
	 * 打水的
	 * @param catteryId
	 * @return
	 * @throws Exception
	 * List<Cat>
	 */
	List<Cat> getCatsbyCatteryId(Integer catteryId) throws Exception;
	
	/**
	 * 2015-8-11
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * List<Breedingplan>
	 */
	List<Breedingplan> getPlanList(Integer pageNo,Integer pageSize);
	
	/**
	 * 2015-8-11
	 * 打水的
	 * @param catteryId
	 * @return
	 * @throws Exception
	 * List<Breedingplan>
	 */
	public List<Breedingplan> getPlanListByCattery(Integer catteryId) throws Exception;
    


}