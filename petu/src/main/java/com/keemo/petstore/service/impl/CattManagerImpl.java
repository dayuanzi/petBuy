package com.keemo.petstore.service.impl;


import com.keemo.petstore.bean.Breedingplan;
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


import com.keemo.petstore.dao.BreedingPlanDao;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.CatteryDao;


import java.io.File;
import java.text.*;
import java.util.*;

import javax.persistence.Cacheable;


public class CattManagerImpl
	implements CattManager
{

	private CatDao catDao;
	private BreedingPlanDao breedingPlanDao;
    private UploadManager uploadManager;
    private CatteryDao catteryDao;

    private List<List<File>> uploads;
    private List<List<Integer>> imagetypelists;
    private List<List<Integer>> catsimagelists;
    private List<List<String>> uploadFileNames;
    
    
    
	public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}
	public void setCatteryDao(CatteryDao catteryDao)
	{
		this.catteryDao = catteryDao;
	}

	public void setBreedingPlanDao(BreedingPlanDao breedingPlanDao)
	{
		this.breedingPlanDao = breedingPlanDao;
	}
	
    public void setUploadManager(UploadManager uploadManager){
    	
    	this.uploadManager = uploadManager;
    }
    
    
	public boolean saveCat(List<Cat> catlist,List<File> upload,List<Integer> imagetypelist,
 		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception{
    	
           this.getCatsImageList(catsimagelist, upload, imagetypelist, uploadFileName);
    	   
    	   for(int i=0;i<catlist.size();i++){
    		   
    		   try{
    			   Integer catId = catDao.save(catlist.get(i));
            	   uploadManager.upLoadImage(imagetypelists.get(i), uploads.get(i), uploadFileNames.get(i), userid, catId , 1);
    		   }
        	   catch (Exception e){
        		   
        		   e.printStackTrace();
        		   throw e;
        		   
        	   }
        	 
    	   }
    	   return true;

    
    }
       
       public void updateCat(List<Cat> catlist,List<File> upload,List<Integer> imagetypelist,
    		   List<String> uploadFileName,String userid) throws Exception{
    	
    	
    	   try{
			   catDao.update(catlist.get(0));
        	   uploadManager.upLoadImage(imagetypelist, upload, uploadFileName, userid, catlist.get(0).getId() , 1);
		   }
    	   catch (Exception e){
    		   
    		   e.printStackTrace();
    		   throw e;
    		   
    	   }
       
       }
       
       
       
       public boolean saveParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
    		   List<Integer> catsimagelist,List<String> uploadFileName,String userid) throws Exception{
    	   
    	   
    	   this.getCatsImageList(catsimagelist, upload, imagetypelist, uploadFileName);
    	   
    	   for(int i=0;i<parentcatlist.size();i++){
    		   
    		   try{
    			   Integer catId = catDao.saveParentcat(parentcatlist.get(i));
            	   uploadManager.upLoadImage(imagetypelists.get(i), uploads.get(i), uploadFileNames.get(i), userid, catId , 2);
    		   }
        	   catch (Exception e){
        		   
        		   e.printStackTrace();
        		   throw e;
        		   
        	   }
        	 
    	   }

          return true;
    	   
       }
       
       
       public void updateParentcat(List<Parentcat> parentcatlist,List<File> upload,List<Integer> imagetypelist,
    		   List<String> uploadFileName,String userid) throws Exception{
    	
    	
    	   try{
			   catDao.updateParentcat(parentcatlist.get(0));
        	   uploadManager.upLoadImage(imagetypelist, upload, uploadFileName, userid, parentcatlist.get(0).getId() , 2);
		   }
    	   catch (Exception e){
    		   
    		   e.printStackTrace();
    		   throw e;
    		   
    	   }
       
       }
       
    
	public void getCatsImageList(List<Integer> catsimagelist,List<File> upload,
			List<Integer> imagetypelist,List<String> uploadFileName){
		
		   Integer midid = 0;
		   int i = 0;
		   
		   uploads = new ArrayList<List<File>>();
		   imagetypelists = new ArrayList<List<Integer>>();
		   uploadFileNames = new ArrayList<List<String>>();
		   
		   List<File> uploadsub = new ArrayList<File>();
		   List<Integer> imagetypelistsub = new ArrayList<Integer>();
		   List<String> uploadFileNamesub = new ArrayList<String>();



		   for(;i < catsimagelist.size();i++){

	       	if(catsimagelist.get(i)!=midid){

	       	    uploads.add(uploadsub);
	            imagetypelists.add(imagetypelistsub);
	       	    uploadFileNames.add(uploadFileNamesub);

	       		midid = catsimagelist.get(i);
	       		
	       	    uploadsub = new ArrayList<File>();
			    imagetypelistsub = new ArrayList<Integer>();
			    uploadFileNamesub = new ArrayList<String>();
	   
	       		uploadsub.add(upload.get(i));
	       		imagetypelistsub.add(imagetypelist.get(i));
	       		uploadFileNamesub.add(uploadFileName.get(i));
	       		continue;

	       	}
	       	else{

	       		uploadsub.add(upload.get(i));
	       		imagetypelistsub.add(imagetypelist.get(i));
	       		uploadFileNamesub.add(uploadFileName.get(i));
	       	}
	       	
	       }

		   uploads.add(uploadsub);
           imagetypelists.add(imagetypelistsub);
      	   uploadFileNames.add(uploadFileNamesub);

		
	}
	
	public void savePlan(Breedingplan breedingplan) throws Exception{
		try{
			
			breedingPlanDao.save(breedingplan);
			
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	public void saveCattery(Cattery cattery,List<File> upload,List<Integer> imagetypelist,
	 		   List<String> uploadFileName,String userid) throws Exception{
		
		try{
			
			catteryDao.save(cattery);
			uploadManager.upLoadImage(imagetypelist, upload, uploadFileName, userid, Integer.valueOf(userid) , 3);
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}
   public void updateCattery(Cattery cattery) throws Exception{
		
		try{
			
			catteryDao.update(cattery);
			
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
	}
	
	

}