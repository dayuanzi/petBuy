/**
 * 
 */
package com.keemo.petstore.service.impl;

import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.dao.ImageDao;
import com.keemo.petstore.service.ImgManager;

/**获取图片信息的manager
 * @author 打水的
 * 
 */
public class ImgManagerImpl implements ImgManager{
	    private ImageDao imageDao;
	    
		public void setImageDao(ImageDao imageDao){
			this.imageDao = imageDao;
		}

		public Imagmsg getCatImagebyId(Integer catid){
			
			return imageDao.findByImageId(catid, 1, 1);
			
		}
}
