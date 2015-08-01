package com.keemo.petstore.action.base;

import java.io.File;
import java.util.List;

import com.keemo.petstore.service.CattManager;
import com.keemo.petstore.service.UploadManager;
import com.opensymphony.xwork2.ActionSupport;



public class CattBaseAction
	extends ActionSupport
{
	//依赖的业务逻辑组件
	protected CattManager catt;
	protected UploadManager upload;
	
	
	
	  protected List<File> uploadfile;  
	    // /多个上传文件的类型集合  
	  protected List<String> uploadfileContentType;  
	   // 多个上传文件的文件名集合  
	  protected List<String> uploadfileFileName;  
	  
	  protected List<Integer> imageType;
	    
	    
	    
	    public List<Integer> getImageType() {
	            return imageType;  
	     }  
	  
	    public void setImageType(List<Integer> imageType) {  
	  
	       this.imageType = imageType;  
	    }  
	  
	    public List<File> getUploadfile() {  
	  
	       return uploadfile;  
	    }  
	  
	    public void setUploadfile(List<File> uploadfile) {  
	  
	       this.uploadfile = uploadfile;  
	    }  
	  
	    public List<String> getUploadfileContentType() {  
	  
	       return uploadfileContentType;  
	    }  
	  
	    public void setUploadfileContentType(List<String> uploadfileContentType) {  
	  
	       this.uploadfileContentType = uploadfileContentType;  
	    }  
	  
	    public List<String> getUploadfileFileName() {  
	  
	       return uploadfileFileName;  
	    }  
	  
	    public void setUploadfileFileName(List<String> uploadfileFileName) {  
	  
	       this.uploadfileFileName = uploadfileFileName;  
	    }  
	
	  
 
	
	
	//依赖注入业务逻辑组件所必须的setter方法
	public void setCattManager(CattManager catt)
	{
		this.catt = catt;
	}
	public void setUploadManager(UploadManager upload)
	{
		this.upload = upload;
	}
}