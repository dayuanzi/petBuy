package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.io.File;
import java.util.*;


public interface CattManager
{

	
	//注册猫咪信息
	boolean saveCat(List<String> name ,List<Byte> sex ,List<Integer> typeid ,List<Date> birthday,
  		   List<Integer> rankid ,List<Integer> pedigree_certificate, List<Byte> immune, List<Integer> price, List<Byte> stalen,Integer catteryId);
  	
  	//更新猫咪信息
	void updateCat(Integer Id, String name ,Byte sex ,Integer typeid ,Date birthday,
	  		   Integer rankid ,Integer pedigree_certificate, Byte immune, Integer price, Byte stalen,Integer catteryId);
	
	
	
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
	public boolean saveParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
 		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception;

    


}