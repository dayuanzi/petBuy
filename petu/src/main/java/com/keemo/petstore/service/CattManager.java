package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.util.*;


public interface CattManager
{

	
	//注册猫咪信息
	boolean saveCat(List<String> name ,List<Byte> sex ,List<Integer> typeid ,List<Date> birthday,
  		   List<Integer> rankid ,List<Integer> pedigree_certificate, List<Byte> immune, List<Integer> price, List<Byte> stalen,Integer catteryId);
  	
  	//更新猫咪信息
	void updateCat(Integer Id, String name ,Byte sex ,Integer typeid ,Date birthday,
	  		   Integer rankid ,Integer pedigree_certificate, Byte immune, Integer price, Byte stalen,Integer catteryId);
	
	

    


}