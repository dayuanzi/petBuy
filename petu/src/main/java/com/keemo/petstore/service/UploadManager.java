package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.io.File;
import java.util.*;


public interface UploadManager
{
	//上传图片
  	 	
	/**
	 * 2015-7-31
	 * 打水的
	 * @param imageType
	 * @param upload
	 * @param uploadFileName
	 * @param userid
	 * @param catid
	 * @return
	 * @throws Exception
	 * boolean
	 */
	boolean upLoadImage(List<Integer> imageType,List<File> upload,List<String> uploadFileName,String userid,Integer catid) throws Exception;
	
	//保存图片信息
 
    /**
     * 2015-7-31
     * 打水的
     * @param path
     * @param imagetype
     * @param catid
     * @return
     * @throws Exception
     * boolean
     */
    boolean saveImage(String path,Integer imagetype,Integer catid) throws Exception;
    
    //重命名
    /**
     * 2015-7-31
     * 打水的
     * @param userid
     * @param oldName
     * @param index
     * @return
     * String
     */
    public String reName(String userid,String oldName,Integer index);
}