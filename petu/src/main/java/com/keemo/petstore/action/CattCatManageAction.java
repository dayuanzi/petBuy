package com.keemo.petstore.action;


import java.util.Date;
import java.util.List;

import com.keemo.petstore.action.base.*;
import com.keemo.petstore.action.common.RandomCodeAction;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.commons.io.FileUtils;
import java.io.File;  
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;



import java.io.IOException;  
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;  
import org.apache.commons.io.FileUtils;  
import org.apache.struts2.ServletActionContext;  

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;  




@Namespace("/CatteryAction") 

public class CattCatManageAction
	extends CattBaseAction
{
	private final String CATT_ADD_CAT = "cattaddcat";
	
	private final String CATT_ADD_CAT_ERROR = "caterror";
	
	private final String CATT_ADD_IMAG_ERROR = "imagerror";

	private final String CATT_UPD_CAT = "cattupdcat";
	
	
	public List<Cat> catlist;
	
		
	List<Integer> catsimagelist;
	
	public void setCatsimagelist(List<Integer> catsimagelist){
		
	     this.catsimagelist = catsimagelist;
	     
	}
	public List<Integer> getCatsimagelist(){
		
		return this.catsimagelist;
			
	}
	public void setCatlist(List<Cat> catlist){
		
	     this.catlist = catlist;
	     
	}
	public List<Cat> getCatlist(){
		
		return this.catlist;
			
	}
	
    		
    @Action(value = "CatRegisterAction", 
			results = { 
			     @Result(name = "cattaddcat", 
			    		 location = "/login.jsp")},
			interceptorRefs = {  
			     @InterceptorRef(value = "fileUpload", 
			    		         params={"maximumSize","409600",
			    		                 "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
			     @InterceptorRef(value = "defaultStack")})
	
	public String execute()
		throws Exception
	{
    	ActionContext ctx = ActionContext.getContext();
    	 
    	String userid = (String)ctx.getSession().get("userid");
		 
		catt.saveCat(catlist, uploadfile, imageType, catsimagelist, uploadfileFileName, userid);
      	return CATT_ADD_CAT;
        
	}
	
    @Action(value = "CatUpdateAction", 
    		results = { 
    		         @Result(name = "cattupdcat", 
    		        		 location = "/login.jsp") },
    		interceptorRefs = {  
		             @InterceptorRef(
		            		 value = "fileUpload", 
		    		         params={"maximumSize","409600",
		    		                 "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
		             @InterceptorRef(
		            		 value = "defaultStack")})
	
	public String CatUpdateAction()
		throws Exception
	{

    	
	ActionContext ctx = ActionContext.getContext();
	String userid = (String)ctx.getSession().get("userid");
	
    catt.updateCat(catlist, uploadfile, imageType, uploadfileFileName, userid);
    return CATT_UPD_CAT;
    	
}
	
	
}