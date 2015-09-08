package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.io.File;
import java.util.*;


/**
 * @author 打水的
 *
 */
/**
 * @author 打水的
 *
 */
public interface CattManager
{

	
	//注册猫咪信息
	/**
	 * 2015-8-3
	 * 打水的
	 * @param catlist
	 * @param upload
	 * @param imagetypelist
	 * @param catsimagelist
	 * @param uploadFileName
	 * @param userid
	 * @return
	 * @throws Exception
	 * boolean
	 */
	boolean saveCat(List<Cat> catlist,List<File> upload,List<Integer> imagetypelist,
	 		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception;
  	
  	//更新猫咪信息
	/**
	 * 2015-8-3
	 * 打水的
	 * @param catlist
	 * @param upload
	 * @param imagetypelist
	 * @param uploadFileName
	 * @param userid
	 * @throws Exception
	 * void
	 */
	void updateCat(List<Cat> catlist,List<File> upload,List<Integer> imagetypelist,
 		   List<String> uploadFileName,String userid) throws Exception;
	
	
	
	/**
	 * 2015-7-31
	 * 打水的
	 * @param parentcatlist
	 * @param upload
	 * @param imagetypelist
	 * @param catsimagelist
	 * @param uploadFileName
	 * @param userid
	 * @return
	 * @throws Exception
	 * boolean
	 */
	boolean saveParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
 		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception;

 
	/**
	 * 2015-8-3
	 * 打水的
	 * @param parentcatlist
	 * @param upload
	 * @param imagetypelist
	 * @param uploadFileName
	 * @param userid
	 * @throws Exception
	 * void
	 */
	void updateParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
 		   List<String> uploadFileName,String userid) throws Exception;
	
	/**
	 * 2015-8-3
	 * 打水的
	 * @param breedingplan
	 * @throws Exception
	 * void
	 */
	void savePlan(Breedingplan breedingplan) throws Exception;

	
	
	void savePlanrecord(Planrecord planrecord,List<File> upload,List<Integer> imagetypelist,
	 		   List<String> uploadFileName,String userid) throws Exception;
	
	/**
	 * 2015-8-3
	 * 打水的
	 * @param cattery
	 * @param upload
	 * @param imagetypelist
	 * @param uploadFileName
	 * @throws Exception
	 * void
	 */
	void saveCattery(Cattery cattery,List<File> upload,List<Integer> imagetypelist,
	 		   List<String> uploadFileName, String userid) throws Exception;
	
	/**
	 * 2015-8-3
	 * 打水的
	 * @param cattery
	 * @throws Exception
	 * void
	 */
	void updateCattery(Cattery cattery) throws Exception;
	
	
	

}