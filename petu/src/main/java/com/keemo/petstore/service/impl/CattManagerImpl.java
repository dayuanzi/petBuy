package com.keemo.petstore.service.impl;


import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Catype;
import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.bean.Parentcat;
import com.keemo.petstore.bean.PedigreeCertificate;
import com.keemo.petstore.bean.Rank;
import com.keemo.petstore.service.CattManager;
import com.keemo.petstore.service.UploadManager;
import com.keemo.petstore.vo.*;
import com.keemo.petstore.exception.*;


import com.keemo.petstore.dao.CatDao;


import java.io.File;
import java.text.*;
import java.util.*;


public class CattManagerImpl
	implements CattManager
{

	private CatDao catDao;
    private UploadManager uploadManager;
    private List<Parentcat> parentcatlist;
    
    
    
	public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}
	
    public void setUploadManager(UploadManager uploadManager){
    	
    	this.uploadManager = uploadManager;
    }


	
	public boolean saveCat(List<String> name ,List<Byte> sex ,List<Integer> typeid ,List<Date> birthday,
	  		   List<Integer> rankid ,List<Integer> pedigree_certificateid, List<Byte> immune, List<Integer> price, List<Byte> stalen,Integer catteryId){
    	
	/*	for(int i = 0;i<name.size();i++){
   		Cattery cattery = new Cattery();
   		cattery.setId(catteryId);
   		Catype catype = new Catype(); 
   		catype.setId(typeid.get(i));
   		Rank rank =  new Rank();
   		rank.setId(rankid.get(i));
   		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid.get(i));
   	
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name.get(i),immune.get(i),birthday.get(i),price.get(i),null,stalen.get(i),sex.get(i),null);
   		
    	Integer catid = catDao.save(cat);
    	if (String.valueOf(catid)==null){
    		return false;
    	}
		}*/
		return true;
    
    }
       
       public void updateCat(Integer Id, String name ,Byte sex ,Integer typeid ,Date birthday,
	  		   Integer rankid ,Integer pedigree_certificateid, Byte immune, Integer price, Byte stalen,Integer catteryId){
    	
    	
    /*	Cattery cattery = new Cattery();
      	cattery.setId(catteryId);
      	Catype catype = new Catype(); 
      	catype.setId(typeid);
      	Rank rank =  new Rank();
      	rank.setId(rankid);
      	
 		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid);
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name,immune,birthday,price,null,stalen,sex,null);
      	cat.setId(Id);
       	
       	catDao.update(cat);*/
       
       }
       
       
       
       public boolean saveParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
    		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception{
    	   
    	   
    	   
    	   List<List<Integer>> catsimagelists = this.getCatsImageList(catsimagelist);
    	   
    	   
    	   for(int i=0;i<parentcatlist.size();i++){
    		   
    		   List<Integer> imagelist = catsimagelists.get(i);
        	   Integer catId = catDao.saveParentcat(parentcatlist.get(i));
        	   
        	   uploadManager.upLoadImage(imagetypelist, upload, uploadFileName, userid, catId);
        	   
        	   for (int j=0;j<imagelist.size();j++){
        		   Imagmsg imagmsg = new Imagmsg();
        		   Cat cat = new Cat();
        		   cat.setId(catId);
        		   imagmsg.setCat(cat);
        		   
        		   
        		   
        	   }
        	   
    	   
    	   }
             return true;
    	   
       }
       
	public List<List<Integer>> getCatsImageList(List<Integer> catsimagelist){
		
		  Integer midid = 0;
		   int i = 0;
		   List<Integer> catsimagelistsub = new ArrayList<Integer>();
		   List<List<Integer>> catsimagelists = new ArrayList<List<Integer>>();
		   
		   for(;i < catsimagelist.size();i++){
	       	
	       	if(catsimagelist.get(i)!=midid){
	       		
	       		catsimagelists.add(catsimagelistsub);
	       		midid = catsimagelist.get(i);
	       		catsimagelistsub = new ArrayList<Integer>();
	       		catsimagelistsub.add(catsimagelist.get(i));
	       		continue;

	       	}
	       	else{
	       		catsimagelistsub.add(catsimagelist.get(i));
	       	}
	       	
	       }
		   
		   
		   catsimagelists.add(catsimagelistsub);
		   return catsimagelists;
		
	}
	
	
	
	public List<List<Parentcat>> getParentcatList(List<Integer> catsimagelist){
		
		   Integer midid = 0;
		   int i = 0;
		   List<Parentcat> parentcatlistsub = new ArrayList<Parentcat>();
		   List<List<Parentcat>> parentcatlists = new ArrayList<List<Parentcat>>();
		   
		   for(;i < catsimagelist.size();i++){
	       	
	       	if(catsimagelist.get(i)!=midid){
	       		
	       		parentcatlists.add(parentcatlistsub);
	       		midid = catsimagelist.get(i);
	       		parentcatlistsub = new ArrayList<Parentcat>();
	       		parentcatlistsub.add(parentcatlist.get(i));
	       		continue;

	       	}
	       	else{
	       		parentcatlistsub.add(parentcatlist.get(i));
	       	}
	       	
	       }
		   
		   
		   parentcatlists.add(parentcatlistsub);
		   return parentcatlists;
		
	}
	
	
	public List<List<Integer>> getCatsImageList(List<Integer> catsimagelist){
		
		  Integer midid = 0;
		   int i = 0;
		   List<Integer> catsimagelistsub = new ArrayList<Integer>();
		   List<List<Integer>> catsimagelists = new ArrayList<List<Integer>>();
		   
		   for(;i < catsimagelist.size();i++){
	       	
	       	if(catsimagelist.get(i)!=midid){
	       		
	       		catsimagelists.add(catsimagelistsub);
	       		midid = catsimagelist.get(i);
	       		catsimagelistsub = new ArrayList<Integer>();
	       		catsimagelistsub.add(catsimagelist.get(i));
	       		continue;

	       	}
	       	else{
	       		catsimagelistsub.add(catsimagelist.get(i));
	       	}
	       	
	       }
		   
		   
		   catsimagelists.add(catsimagelistsub);
		   return catsimagelists;
		
	}
       
       

}