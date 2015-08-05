/**
 * 
 */
package com.keemo.petstore.service;

import java.util.List;

import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.dao.ImageDao;

/**
 * @author 打水的
 *
 */
public interface ImgManager {
	/**
	 * 2015-8-5
	 * 打水的
	 * @param catid
	 * @return
	 * Imagmsg
	 */
	Imagmsg getCatImagebyId(Integer catid);
	
	
}
