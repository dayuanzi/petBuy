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
	public Imagmsg getCatImagebyId(Integer catid) throws Exception;
	
    /**
     * 2015-8-5
     * 打水的
     * @param catid
     * @return
     * Imagmsg
     */
    public Imagmsg getParentcatImagebyId(Integer catid) throws Exception;
    
    
    /**
     * 2015-8-5
     * 打水的
     * @param catid
     * @param imageType
     * @return
     * List<Imagmsg>
     */
    public List<Imagmsg> getCatImagebyList(Integer catid,Integer imageType) throws Exception;
    
    /**
     * 2015-8-5
     * 打水的
     * @param catid
     * @param imageType
     * @return
     * List<Imagmsg>
     */
    public List<Imagmsg> getParentcatImageList(Integer catid,Integer imageType) throws Exception;
    
    /**
     * 2015-8-5
     * 打水的
     * @param userid
     * @param imageType
     * @return
     * List<Imagmsg>
     */
    public List<Imagmsg> getCatteryImageList(Integer userid,Integer imageType) throws Exception;
    
    
    /**
     * 2015-8-11
     * 打水的
     * @param catteryid
     * @return
     * @throws Exception
     * Imagmsg
     */
    Imagmsg getCatteryImagebyId(Integer catteryid) throws Exception;
	
	
}
