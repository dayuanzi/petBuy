/**
 * 
 */
package com.keemo.petstore.service.impl;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.dao.ImageDao;
import com.keemo.petstore.service.ImgManager;

/**获取图片信息的manager
 * @author 打水的
 * 
 */
public class ImgManagerImpl implements ImgManager{
	
	    private ImageDao imageDao;
	    
		public void setImageDao(ImageDao imageDao) throws Exception{
			
			try{
				this.imageDao = imageDao;
			}
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			}

		}
        @Cacheable(value = "users" ,key = "'catimagebyid'+#catid")
		public Imagmsg getCatImagebyId(Integer catid) throws Exception{
			
			try{
				return imageDao.findByImageId(catid, 1, 1);
			}
			catch (Exception e){
				e.printStackTrace();
				throw e;
			}
			
		}
		
        @Cacheable(value = "users" , key = "'parentcatimagebyid'+#catid")
        public Imagmsg getParentcatImagebyId(Integer catid) throws Exception{
			
        	try{
        		
        		return imageDao.findByImageId(catid, 2, 1);
        	}
		catch(Exception e){
			
			e.printStackTrace();
			throw e;
			
		}
			
		}
        
        @Cacheable(value = "users" ,key = "'catteryimagebyid'+#catteryid")
		public Imagmsg getCatteryImagebyId(Integer catteryid) throws Exception{
			
			try{
				return imageDao.findByImageId(catteryid, 3, 1);
			}
			catch (Exception e){
				e.printStackTrace();
				throw e;
			}
			
		}
        
        
        public List<Imagmsg> getCatImagebyList(Integer catid,Integer imageType) throws Exception{
			
        	try{
        		return imageDao.findByImageList(catid, 1, imageType);
        	}
        	catch(Exception e){
        		e.printStackTrace();
        		throw e;
        	}
			
		}
        
        public List<Imagmsg> getParentcatImageList(Integer catid,Integer imageType) throws Exception{
			
        	try{
        		return imageDao.findByImageList(catid, 2, imageType);
        	}
        	catch(Exception e){
        		e.printStackTrace();
        		throw e;
        	}
			
		}

        public List<Imagmsg> getCatteryImageList(Integer userid,Integer imageType) throws Exception{
			
        	try{
        		
        		return imageDao.findByImageList(userid, 3, imageType);
        	
        	}
        	catch(Exception e){
        		e.printStackTrace();
        		throw e;
        	}
		}
        
        
        
        
		
}
