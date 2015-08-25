package com.keemo.petstore.action;

import java.util.ArrayList;
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


public class CatteryDetailAction
	extends AdmBaseAction
{
	private final String ADM_CATT_DET_CAT_LIST = "catslist";
	private final String ADM_CATT_DET = "catterydetail";
	private Cattery cattery;
	private List<Cat> catlist;
	private Integer catteryId;
	private List<Breedingplan> planlist;
	private List<Imagmsg> cattery_imagelist;
	private List<Imagmsg> cat_imagelist;
	private Imagmsg cattmainimage;
	private List<Imagmsg> imagelist_mom;
	private List<Imagmsg> imagelist_dad;
	private Imagmsg background;
 
	
	
	

	/**
	 * @return the background
	 */
	public Imagmsg getBackground() {
		return background;
	}
	/**
	 * @param background the background to set
	 */
	public void setBackground(Imagmsg background) {
		this.background = background;
	}
	/**
	 * @return the imagelist_mom
	 */
	public List<Imagmsg> getImagelist_mom() {
		return imagelist_mom;
	}
	/**
	 * @param imagelist_mom the imagelist_mom to set
	 */
	public void setImagelist_mom(List<Imagmsg> imagelist_mom) {
		this.imagelist_mom = imagelist_mom;
	}
	/**
	 * @return the imagelist_dad
	 */
	public List<Imagmsg> getImagelist_dad() {
		return imagelist_dad;
	}
	/**
	 * @param imagelist_dad the imagelist_dad to set
	 */
	public void setImagelist_dad(List<Imagmsg> imagelist_dad) {
		this.imagelist_dad = imagelist_dad;
	}
	/**
	 * @return the cattmainimage
	 */
	public Imagmsg getCattmainimage() {
		return cattmainimage;
	}
	/**
	 * @param cattmainimage the cattmainimage to set
	 */
	public void setCattmainimage(Imagmsg cattmainimage) {
		this.cattmainimage = cattmainimage;
	}
	/**
	 * @return the planlist
	 */
	public List<Breedingplan> getPlanlist() {
		return planlist;
	}
	/**
	 * @param planlist the planlist to set
	 */
	public void setPlanlist(List<Breedingplan> planlist) {
		this.planlist = planlist;
	}
	/**
	 * @return the cattery_imagelist
	 */
	public List<Imagmsg> getCattery_imagelist() {
		return cattery_imagelist;
	}
	/**
	 * @param cattery_imagelist the cattery_imagelist to set
	 */
	public void setCattery_imagelist(List<Imagmsg> cattery_imagelist) {
		this.cattery_imagelist = cattery_imagelist;
	}
	/**
	 * @return the cat_imagelist
	 */
	public List<Imagmsg> getCat_imagelist() {
		return cat_imagelist;
	}
	/**
	 * @param cat_imagelist the cat_imagelist to set
	 */
	public void setCat_imagelist(List<Imagmsg> cat_imagelist) {
		this.cat_imagelist = cat_imagelist;
	}
	/**
	 * @return the catteryId
	 */
	public Integer getCatteryId() {
		return catteryId;
	}
	/**
	 * @param catteryId the catteryId to set
	 */
	public void setCatteryId(Integer catteryId) {
		this.catteryId = catteryId;
	}
	public void setCattery(Cattery cattery)
	{
		this.cattery = cattery;
	}
	public Cattery getCattery()
	{
		return this.cattery;
	}
	
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	
	
	
	@Action(value = "CatteryDetailAction",
			results = { @Result(name = "catterydetail", 
					            location = "/content/catterydetail.jsp")})
					    		
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		
		try{
			this.imagelist_dad = new ArrayList<Imagmsg>();
			this.imagelist_mom = new ArrayList<Imagmsg>();

			
			
			this.cattery = adm.getCatteryById(catteryId);
			this.cattery_imagelist = img.getCatteryImageList(catteryId, 2);
			this.catlist = adm.getCatsbyCatteryId(catteryId);
			this.cat_imagelist = new ArrayList<Imagmsg>();
			for(int i = 0;i<catlist.size();i++){
				
				this.cat_imagelist.add(img.getCatImagebyId(catlist.get(i).getId()));
			}
			this.cattmainimage = img.getCatteryImagebyId(catteryId);
			
			this.planlist = adm.getPlanListByCattery(catteryId);
			this.background =img.getCatteryBackgroundImagebyId(catteryId);

			for (int i = 0;i<planlist.size();i++){
				this.imagelist_mom.add(img.getParentcatImagebyId(planlist.get(i).getParentcatByMother().getId()));
				this.imagelist_dad.add(img.getParentcatImagebyId(planlist.get(i).getParentcatByFather().getId()));
				
			}
			
			
			

		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}

		
		return ADM_CATT_DET;
	}
    
}