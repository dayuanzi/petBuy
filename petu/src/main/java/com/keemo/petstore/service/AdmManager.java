package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.util.*;


public interface AdmManager
{

	
	/**
	 * 2015-8-13
	 * 打水的
	 * @param id
	 * @return
	 * Cat
	 */
	Cat getCatById(Integer id);
	
	/**
	 * 2015-8-12
	 * 打水的
	 * @param id
	 * @return
	 * Cattery
	 */
	Cattery getCatteryById(Integer id);
	
	/**
	 * 2015-8-12
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param typeId
	 * @param rankId
	 * @param stalen
	 * @param pricelow
	 * @param pricehigh
	 * @return
	 * List<Cat>
	 */
	List<Cat> getCatsbyPage(Integer pageNo,Integer pageSize,Integer typeId , Integer rankId,Byte stalen,Double pricelow,Double pricehigh);
	
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
	List<Cat> getCatsbyQuery(Integer pageNo,Integer pageSize,String queryStr,Integer typeId , Integer rankId,Byte stalen,Double pricelow,Double pricehigh);
	
	
	/**
	 * 2015-8-13
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @param typeId
	 * @param rankId
	 * @param regionId
	 * @param priceLow
	 * @param priceHigh
	 * @param queryStr
	 * @return
	 * List<Cattery>
	 */
	List<Cattery> getCatterybyPage(Integer pageNo,Integer pageSize,Integer typeId,Integer rankId,Integer regionId,Double priceLow,Double priceHigh,String queryStr);
	
	
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
	
	
	
	/**
	 * 2015-8-28
	 * 打水的
	 * @param planid
	 * @return
	 * @throws Exception
	 * List<Planrecord>
	 */
	public List<Planrecord> getRecordList(Integer planid) throws Exception;
	
	
	
	
    


}