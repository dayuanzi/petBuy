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





public class CattCatManageAction
	extends CattBaseAction
{
	private final String MEM_ADD_CAT = "memaddcat";
	
	private final String MEM_ADD_CAT_ERROR = "caterror";
	
	private final String MEM_ADD_IMAG_ERROR = "imagerror";

	
	
	private List<Integer> Id;
	private List<String> name;
	private List<Byte> sex;
	private List<Integer> typeid;
	private List<Integer> rankid;
	private List<Integer> pedigree_certificate;
	private List<Byte> immune;
	private List<Date> birthday;
    private List<Integer> price ;
	private List<Byte> stalen;
    
	
	
    
	public void setName(List<String> name)
	{
		this.name = name;
	}
	public List<String> getName()
	{
		return this.name ;
	}
	
	public void setSex(List<Byte> sex)
	{
		this.sex = sex;
	}
	public List<Byte> getSex()
	{
		return this.sex ;
	}
	
	public void setTypeid(List<Integer> typeid)
	{
		this.typeid = typeid;
	}
	public List<Integer> getTypeid()
	{
		return this.typeid ;
	}
	
	public void setRankid(List<Integer> rankid)
	{
		this.rankid = rankid;
	}
	public List<Integer> getRankid()
	{
		return this.rankid ;
	}
	
	
	public void setPedigree_certificate(List<Integer> pedigree_certificate)
	{
		this.pedigree_certificate = pedigree_certificate;
	}
	public List<Integer> getPedigree_certificate()
	{
		return this.pedigree_certificate ;
	}
	
	
	public void setImmune(List<Byte> immune)
	{
		this.immune = immune;
	}
	public List<Byte> getImmune()
	{
		return this.immune ;
	}

	public void setBirthday(List<Date> birthday)
	{
		this.birthday = birthday;
	}
	public List<Date> getBirthday()
	{
		return this.birthday ;
	}

	public void setPrice(List<Integer> price)
	{
		this.price = price;
	}
	public List<Integer> getPrice()
	{
		return this.price ;
	}
	
	public void setStalen(List<Byte> stalen)
	{
		this.stalen = stalen;
	}
	public List<Byte> getStalen()
	{
		return this.stalen ;
	}
    
    

    		
    		
    @Action(value = "CatRegisterAction", 
			results = { 
			     @Result(name = "memaddcat", 
			    		 location = "/login.jsp")},
			interceptorRefs = {  
			     @InterceptorRef(value = "fileUpload", 
			    		         params={"maximumSize","409600",
			    		                 "allowedTypesSet", "image/jpeg,image/jpg,image/bmp"}),
			     @InterceptorRef(value = "defaultStack")})
	
	public String execute()
		throws Exception
	{
    	
    /*	System.out.println(name);
    	System.out.println(sex);
    	System.out.println(typeid);
    	System.out.println(rankid);
    	System.out.println(pedigree_certificate);
    	System.out.println(immune);
    	System.out.println(birthday);
    	System.out.println(price);
    	System.out.println(stalen);*/
    //	System.out.println(uploadfile.toString());
    	ActionContext ctx = ActionContext.getContext();
  
    	
    	//String catteryId = ((String[])ctx.getSession().get("u"))[0];
    	
    	String catteryId = "1";
    	

    		
    	boolean result = catt.saveCat(name, sex, typeid, birthday, rankid, pedigree_certificate, immune, price, stalen, Integer.valueOf(catteryId)) ;
         if (result==false){
      
    		ServletActionContext.getRequest().setAttribute("msg", "保存失败");
			return MEM_ADD_CAT_ERROR;
        	
        
    	}
    	
       
       
        	  if(uploadfile!=null){
              	try{
          
              		upload.upLoadImage(imageType, uploadfile, uploadfileFileName, catteryId);
              	}
              	catch(Exception e)
              	{
              		e.printStackTrace();
              		return MEM_ADD_IMAG_ERROR;
              	}
              	
              	
              }
              
      		return MEM_ADD_CAT;
        	
        
     
        
      
	}
	
    
    
    @Action(value = "CatUpdateAction", results = { @Result(name = "memupdcat", location = "/login.jsp") })
	
	public String CatUpdateAction()
		throws Exception
	{

	/*	ActionContext ctx = ActionContext.getContext();
    	//HttpSession catterysession = (HttpSession) ctx.getSession();
    	//String catteryId = (String) catterysession.getAttribute("catteryid");

     	String catteryId = "1";
		catt.updateCat(Id, name, sex, typeid, birthday, rankid, pedigree_certificate, immune, price, stalen,  Integer.valueOf(catteryId));*/
		return MEM_ADD_CAT;
	}
	
	
}