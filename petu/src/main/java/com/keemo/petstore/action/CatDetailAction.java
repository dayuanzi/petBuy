package com.keemo.petstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;


public class CatDetailAction
	extends AdmBaseAction
{
	

	private final String ADM_CAT_DET = "catdetail";
	private Integer catId; 
	private Cat cat;
	private List<Imagmsg> imagelist;
	private Imagmsg mainimage;
	
	public void setCat(Cat cat)
	{
		this.cat = cat;
	}
	public Cat getCat()
	{
		return this.cat;
	}
	/**
	 * @return the imagelist
	 */
	public List<Imagmsg> getImagelist() {
		return imagelist;
	}
	/**
	 * @param imagelist the imagelist to set
	 */
	public void setImagelist(List<Imagmsg> imagelist) {
		this.imagelist = imagelist;
	}
	/**
	 * @return the mainimage
	 */
	public Imagmsg getMainimage() {
		return mainimage;
	}
	/**
	 * @param mainimage the mainimage to set
	 */
	public void setMainimage(Imagmsg mainimage) {
		this.mainimage = mainimage;
	}
	
	/**
	 * @return the catId
	 */
	public Integer getCatId() {
		return catId;
	}
	/**
	 * @param catId the catId to set
	 */
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	
	@Action(value = "CatDetailAction",
			results = { @Result(name = "catdetail", 
					            location = "/content/catdetail.jsp")})
	
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		this.cat = adm.getCatById(catId);
		this.mainimage = img.getCatImagebyId(catId);
		this.imagelist = img.getCatImagebyList(catId, 2);
		
		return ADM_CAT_DET;
	}
	
	
	
	
	
}