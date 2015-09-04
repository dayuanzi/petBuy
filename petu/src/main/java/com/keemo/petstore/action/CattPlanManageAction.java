/**
 * 
 */
package com.keemo.petstore.action;

import java.util.Date;
import java.util.List;

import com.keemo.petstore.action.base.*;
//import com.keemo.petstore.action.common.RandomCodeAction;
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

import org.apache.struts2.ServletActionContext;  

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;  

/**
 * @author 打水的
 *
 */
public class CattPlanManageAction extends CattBaseAction{
	
	final String CATT_ADD_PAR = "cattaddparentcat";
	final String CATT_UPD_PAR = "cattupdparentcat";
	final String CATT_ADD_PLAN = "cattaddplan";
	public List<Parentcat> parentcatlist;
	public List<Integer> catsimagelist;
	public Breedingplan breedingplan;
	public Planrecord planrecord;

	/**
	 * @return the planrecord
	 */
	public Planrecord getPlanrecord() {
		return planrecord;
	}

	/**
	 * @param planrecord the planrecord to set
	 */
	public void setPlanrecord(Planrecord planrecord) {
		this.planrecord = planrecord;
	}
	
	public void setParentcatlist(List<Parentcat> parentcatlist){
		
	     this.parentcatlist = parentcatlist;
	     
	}
	public List<Parentcat> getParentcatlist(){
		
		return this.parentcatlist;
			
	}
	
	public Breedingplan getBreedingplan(){
	
		return this.breedingplan;
	
	}
	public void setBreedingplan(Breedingplan breedingplan){
		
		this.breedingplan = breedingplan;
		
	}
		
	public void setCatsimagelist(List<Integer> catsimagelist){
			
	   this.catsimagelist = catsimagelist;
		     
	}
	public List<Integer> getCatsimagelist(){
				
		return this.catsimagelist;
				
	}
		
	
		
		
		
	
	 @Action(value = "PlanRegisterAction", 
				results = { 
				     @Result(name = "cattaddplan", 
				    		 location = "/login.jsp")})
		
	public String execute()
			throws Exception
	{
		    
		 ActionContext ctx = ActionContext.getContext();
		// ctx.getSession().get("catteryid");
		 
		 Cattery cattery = new Cattery();
		 cattery.setId(1);
		
		 breedingplan.setCattery(cattery);
		 catt.savePlan(breedingplan);
		 
		 return CATT_ADD_PLAN;
			
	}
		

	 @Action(value = "ParentcatRegisterAction", 
				results = { 
				     @Result(name = "cattaddparentcat", 
				    		 location = "/login.jsp")},
				interceptorRefs = {  
				     @InterceptorRef(value = "fileUpload", 
				    		         params={"maximumSize","409600",
				    		                 "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
				     @InterceptorRef(value = "defaultStack")})
	 
	 	
	public String ParentcatRegisterAction()
			throws Exception
	{
	
	 ActionContext ctx = ActionContext.getContext();
	 String userid = (String)ctx.getSession().get("userid");

	 catt.saveParentcat(parentcatlist, uploadfile, imageType, catsimagelist, uploadfileFileName, userid);
	 return CATT_ADD_PAR;
			
	}
	 
	 
	 @Action(value = "ParentcatUpdateAction", 
	    		results = { 
	    		         @Result(name = "cattupdparentcat", 
	    		        		 location = "/login.jsp") },
	    		interceptorRefs = {  
			             @InterceptorRef(
			            		 value = "fileUpload", 
			    		         params={"maximumSize","409600",
			    		                 "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
			             @InterceptorRef(
			            		 value = "defaultStack")})
		
		public String ParentcatUpdateAction()
			throws Exception
		{

	    	
		ActionContext ctx = ActionContext.getContext();
		String userid = (String)ctx.getSession().get("userid");
		
	    catt.updateParentcat(parentcatlist, uploadfile, imageType , uploadfileFileName, userid);
	    
	    return CATT_UPD_PAR;
	    
	}
	 
	 
	 @Action(value = "CattPlanRecordManageAction",
		     interceptorRefs = {  
		              @InterceptorRef(value =  "fileUpload", 
		    		                  params={ "maximumSize","409600",
		    		                           "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
		              @InterceptorRef(value =  "defaultStack")})
		public String MemPlanRecordAction() throws Exception{
			
			ActionContext ctx = ActionContext.getContext();
			String userid = (String)ctx.getSession().get("userid");
			
			try{
	
			catt.savePlanrecord(planrecord, uploadfile, imageType, uploadfileFileName,userid);
			}
			catch(Exception e){
				e.printStackTrace();
				
			}
			
			return null;
		}
}



