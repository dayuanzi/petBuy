package com.keemo.petstore.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.dao.ImageDao;
import com.keemo.petstore.service.UploadManager;
import com.opensymphony.xwork2.ActionContext;

public class UploadManagerImpl implements UploadManager{
	private String path =null;
	
	private ImageDao imageDao;
	public void setImageDao(ImageDao imageDao){
		this.imageDao = imageDao;
	}

	
	public boolean upLoadImage(List<Integer> imageType,List<File> upload,List<String> uploadFileName,String userid,Integer catid,Integer pid) throws Exception{

	    // 把得到的文件的集合通过循环的方式读取并放在指定的路径下  

	    for (int i = 0; i < upload.size(); i++) {  
	    	 switch(imageType.get(i)){
	 	    
		        case 1: path = ServletActionContext.getServletContext().getRealPath("/WEB-INF/uploadList");
		        
		    }
		 	
		    // 写到指定的路径中  

		    File file = new File(path);  

		    // 如果指定的路径没有就创建  

		    if (!file.exists()) {  
		        file.mkdirs();  
		    }  

	    try {
	    	String rename =reName(userid,uploadFileName.get(i),i);
			FileUtils.copyFile(upload.get(i), new File(file,rename));
			try{
				saveImage(rename,imageType.get(i),catid,pid);
			}
			catch (Exception e){
				
				e.printStackTrace();
				throw e;
			}
			
	    } 
	    catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		 	
		 	
	   
	    }  

	    return true; 
		
	}
	public boolean saveImage(String path,Integer imagetype,Integer catid,Integer pid) throws Exception{
		
		Cat cat= new Cat();
		cat.setId(catid);
		Imagmsg imagmsg= new Imagmsg(path,imagetype,catid,pid);
		try{
			Integer result = imageDao.save(imagmsg);
			
			if(String.valueOf(result).length()==0){
				return false;
			}
		}
		catch (Exception e){
			
			e.printStackTrace();
			throw e;
			
		}
	
		
		return true;
	}
	
	 
    public String reName(String userid,String oldName,Integer index){
    	
    	DateFormat formatDate = new SimpleDateFormat("yyyyMMddhhmmss");
        String  formatDateStr = formatDate.format(new Date());
    	String[] picfo = oldName.split("\\.");
    	return userid+formatDateStr+String.valueOf(index)+"."+picfo[picfo.length-1];
    	
    
    }
	
	

}
