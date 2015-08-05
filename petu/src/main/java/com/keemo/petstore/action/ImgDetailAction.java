/**
 * 
 */
package com.keemo.petstore.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.CattBaseAction;
import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.service.ImgManager;
import com.opensymphony.xwork2.ActionContext;

/**
 * @author 打水的
 *
 */
public class ImgDetailAction
{

    final private String CAT_IMG = "catimage";
    final private String PAR_CAT_IMG = "parentcatimage";
    final private String CAT_LIST_IMG = "catlistimage";
    final private String PAR_CAT_LIST_IMG = "parentcatlistimage";
    final private String CARR_LIST_IMG = "catimage";

    
    
    
    
    private ImgManager img;
    private Imagmsg imagmsg;
    private List<Imagmsg> imagmsglist;
    
    public void setImgManager(ImgManager img){
    	this.img = img;
    }
    public ImgManager getImgManager(){
    	return this.img;
    }
    
    public void setImagmsg(Imagmsg imagmsg){
    	
    	this.imagmsg = imagmsg;
    }
    public Imagmsg getImagmsg(){
    	
    	return this.imagmsg;
    }
    public void setImagmsglist(List<Imagmsg> imagmsglist){
    	
    	this.imagmsglist = imagmsglist;
    }
    public List<Imagmsg> getImagmsglist(){
    	
    	return this.imagmsglist;
    }
    
    
	@Action(value = "CatImageAction", 
			results = { 
			     @Result(name = "catimage", 
			    		 location = "/catimagedetail")})
	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer catid = (Integer)ctx.getParameters().get("catid");
		
		this.imagmsg = img.getCatImagebyId(catid);
		
		return CAT_IMG;
	
	}
	
	@Action(value = "ParentcatImageAction", 
			results = { 
			     @Result(name = "catimage", 
			    		 location = "/catimagedetail")})
	public String ParentcatImageAction()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer catid = (Integer)ctx.getParameters().get("catid");
		
		this.imagmsg = img.getParentcatImagebyId(catid);
		
		return CAT_IMG;
	
	}
	
	@Action(value = "CatImageListAction", 
			results = { 
			     @Result(name = "catimage", 
			    		 location = "/catimagedetail")})
	public String CatImageListAction()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer catid = (Integer)ctx.getParameters().get("catid");
		Integer imageType = (Integer)ctx.getParameters().get("imagetype");
		this.imagmsglist = img.getCatImagebyList(catid, imageType);
		
		return CAT_IMG;
	
	}
	
	@Action(value = "ParentcatImageListAction", 
			results = { 
			     @Result(name = "catimage", 
			    		 location = "/catimagedetail")})
	public String ParentcatImageListAction()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer catid = (Integer)ctx.getParameters().get("catid");
		Integer imageType = (Integer)ctx.getParameters().get("imagetype");
		this.imagmsglist = img.getParentcatImageList(catid, imageType);
		
		return CAT_IMG;
	
	}
	
	
	@Action(value = "CatteryImageListAction", 
			results = { 
			     @Result(name = "catimage", 
			    		 location = "/catimagedetail")})
	public String CatteryImageListAction()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		Integer userid = (Integer)ctx.getParameters().get("userid");
		Integer imageType = (Integer)ctx.getParameters().get("imagetype");
		this.imagmsglist = img.getCatteryImageList(userid, imageType);
		
		return CAT_IMG;
	
	}
	
	
}
