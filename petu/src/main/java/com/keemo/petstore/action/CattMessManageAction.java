/**
 * 
 */
package com.keemo.petstore.action;

/**
 * @author 打水的
 *
 */

import com.keemo.petstore.action.base.*;
import com.keemo.petstore.action.common.RandomCodeAction;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.commons.io.FileUtils;
import java.io.File;  
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
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


public class CattMessManageAction
	extends CattBaseAction
{

	final String CATT_REGIST = "cattregist";
	public Cattery cattery ;
	
	public void setCattery(){
		
		this.cattery = cattery;
	}
	
	public Cattery getCattery(){
		
		return this.cattery;
	}

	
    		
    @Action(value = "CattRegisterAction", 
			results = { 
			     @Result(name = "cattregist", 
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
	//	System.out.println(uploadfile.size());
	//	catt.saveCat(catlist, uploadfile, imageType, catsimagelist, uploadfileFileName, userid);
		catt.saveCattery(cattery, uploadfile, imageType, uploadfileFileName, userid);
      	return CATT_REGIST;
        
	}
    
}