package com.keemo.petstore.service.impl;


import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Catype;
import com.keemo.petstore.bean.PedigreeCertificate;
import com.keemo.petstore.bean.Rank;
import com.keemo.petstore.service.CattManager;
import com.keemo.petstore.vo.*;
import com.keemo.petstore.exception.*;


import com.keemo.petstore.dao.CatDao;


import java.text.*;
import java.util.*;


public class CattManagerImpl
	implements CattManager
{

	private CatDao catDao;


	public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}

	
	public boolean saveCat(List<String> name ,List<Byte> sex ,List<Integer> typeid ,List<Date> birthday,
	  		   List<Integer> rankid ,List<Integer> pedigree_certificateid, List<Byte> immune, List<Integer> price, List<Byte> stalen,Integer catteryId){
    	
		for(int i = 0;i<name.size();i++){
   		Cattery cattery = new Cattery();
   		cattery.setId(catteryId);
   		Catype catype = new Catype(); 
   		catype.setId(typeid.get(i));
   		Rank rank =  new Rank();
   		rank.setId(rankid.get(i));
   		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid.get(i));
   		/*public Cat(Cattery cattery, Order order, Catype catype, Rank rank,
			PedigreeCertificate pedigreeCertificate, String name, Byte immune,
			Date birthday, Integer price, Integer oldprice, Byte stalen,
			Byte sex, Set orders, Set carts)*/
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name.get(i),immune.get(i),birthday.get(i),price.get(i),null,stalen.get(i),sex.get(i),null,null);
   		
    	Integer catid = catDao.save(cat);
    	if (String.valueOf(catid)==null){
    		return false;
    	}
		}
		return true;
    
    }
       
       public void updateCat(Integer Id, String name ,Byte sex ,Integer typeid ,Date birthday,
	  		   Integer rankid ,Integer pedigree_certificateid, Byte immune, Integer price, Byte stalen,Integer catteryId){
    	
    	
    	Cattery cattery = new Cattery();
      	cattery.setId(catteryId);
      	Catype catype = new Catype(); 
      	catype.setId(typeid);
      	Rank rank =  new Rank();
      	rank.setId(rankid);
      	
 		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid);
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name,immune,birthday,price,null,stalen,sex,null,null);
      	cat.setId(Id);
       	
       	catDao.update(cat);
       
       }
	
	
	
	

}