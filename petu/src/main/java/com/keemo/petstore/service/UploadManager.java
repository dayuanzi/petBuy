package com.keemo.petstore.service;

import com.keemo.petstore.vo.*;
import com.keemo.petstore.bean.*;
import com.keemo.petstore.exception.*;

import java.io.File;
import java.util.*;


public interface UploadManager
{
	//上传图片
  	 	
	boolean upLoadImage(List<String> imageType,List<File> upload,List<String> uploadFileName,String userid);
	
	//保存图片信息
    boolean saveImage(String path,String imagetype,Integer userid);
    
    //重命名
    public String reName(String userid,String oldName,Integer index);
}