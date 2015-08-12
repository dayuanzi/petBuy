package com.keemo.petstore.action;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.*;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.springframework.cache.annotation.Cacheable;

import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;

@ParentPackage(value = "default" )



public class CatListAction
	extends AdmBaseAction
{
	private final String ADM_CAT_LIST = "catlist";
	private final String ADM_CAT_LIST_QUE = "catsquery";
	private final String INDEX_LIST = "indexlist";
	
	
	private List<Cat> catlist;
	private List<Cat> catlist_pet;
	private List<Cat> catlist_breed;
	private List<Cat> catlist_match;
	private List<Breedingplan> planlist;
	private String pageNumberStr;
	private String typeIdStr;
	private String rankIdStr;
	private String priceLowStr;
	private String priceHighStr;
	private String queryStr;
	
	
	
	private List<Imagmsg> imagelist;
	private List<Imagmsg> imagelist_pet;
	private List<Imagmsg> imagelist_breed;
	private List<Imagmsg> imagelist_match;
	
	
	/**
	 * @return the query
	 */
	public String getQueryStr() {
		return queryStr;
	}
	/**
	 * @param query the query to set
	 */
	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
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
	 * @return the imagelist_pet
	 */
	public List<Imagmsg> getImagelist_pet() {
		return imagelist_pet;
	}
	/**
	 * @param imagelist_pet the imagelist_pet to set
	 */
	public void setImagelist_pet(List<Imagmsg> imagelist_pet) {
		this.imagelist_pet = imagelist_pet;
	}
	/**
	 * @return the imagelist_breed
	 */
	public List<Imagmsg> getImagelist_breed() {
		return imagelist_breed;
	}
	/**
	 * @param imagelist_breed the imagelist_breed to set
	 */
	public void setImagelist_breed(List<Imagmsg> imagelist_breed) {
		this.imagelist_breed = imagelist_breed;
	}
	/**
	 * @return the imagelist_match
	 */
	public List<Imagmsg> getImagelist_match() {
		return imagelist_match;
	}
	/**
	 * @param imagelist_match the imagelist_match to set
	 */
	public void setImagelist_match(List<Imagmsg> imagelist_match) {
		this.imagelist_match = imagelist_match;
	}
	public String getPageNumberStr() {
		return pageNumberStr;
	}
	public void setPageNumberStr(String pageNumberStr) {
		this.pageNumberStr = pageNumberStr;
	}
	public String getTypeIdStr() {
		return typeIdStr;
	}
	public void setTypeIdStr(String typeIdStr) {
		this.typeIdStr = typeIdStr;
	}
	public String getRankIdStr() {
		return rankIdStr;
	}
	public void setRankIdStr(String rankIdStr) {
		this.rankIdStr = rankIdStr;
	}
	public String getPriceLowStr() {
		return priceLowStr;
	}
	public void setPriceLowStr(String priceLowStr) {
		this.priceLowStr = priceLowStr;
	}
	public String getPriceHighStr() {
		return priceHighStr;
	}
	public void setPriceHighStr(String priceHighStr) {
		this.priceHighStr = priceHighStr;
	}
	
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	public void setCatlist_pet(List<Cat> catlist_pet)
	{
		this.catlist_pet = catlist_pet;
	}
	public List<Cat> getCatlist_pet()
	{
		return this.catlist_pet;
	}
	public void setCatlist_breed(List<Cat> catlist_breed)
	{
		this.catlist_breed = catlist_breed;
	}
	public List<Cat> getCatlist_breed()
	{
		return this.catlist_breed;
	}
	public void setCatlist_match(List<Cat> catlist_match)
	{
		this.catlist_match = catlist_match;
	}
	public List<Cat> getCatlist_match()
	{
		return this.catlist_match;
	}
    public void setPlanlist(List<Breedingplan> planlist){
    	
		this.planlist = planlist;
		
	}
	public List<Breedingplan> getPlanlist(){
		
		return this.planlist;
		
	}

	@Action(value = "CatListAction", 
			results = { 
			     @Result(name = "catlist", 
			    		 location = "/content/main_cat_list.jsp")},
			interceptorRefs = {  @InterceptorRef(value = "parStack")})

	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		
		Integer pageNumber = 1;
		Integer typeId = null;
		Integer rankId = null;
		Double priceLow = 1.00;
		Double priceHigh = 1000000.00;
		

		if(pageNumberStr!=null){
			pageNumber = Integer.valueOf(pageNumberStr);
		}
		

		if(typeIdStr!=null){
			typeId = Integer.valueOf(typeIdStr);
		}

		if(rankIdStr!=null)
		{
			rankId = Integer.valueOf(rankIdStr);
		}


		if(priceLowStr!=null)
		{
			priceLow = Double.valueOf(priceLowStr);
		}
		

		if(priceHighStr!=null)
		{
			priceHigh = Double.valueOf(priceHighStr);
		}
	
		if(queryStr!=null){

			Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
			this.catlist = adm.getCatsbyQuery(pageNo, WebConstant.admPageSize, queryStr, typeId, rankId, priceLow, priceHigh);
			
			
			this.imagelist = new ArrayList<Imagmsg>();
			
			try {
		         for (int i = 0;i < catlist.size();i++){
					
					Imagmsg imagmsg = img.getCatImagebyId(catlist.get(i).getId());
					this.imagelist.add(imagmsg);
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
				throw e;
			}
	        }
		else
		{
		
	    Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catlist = adm.getCatsbyPage(pageNo, WebConstant.admPageSize, typeId, rankId, priceLow, priceHigh);
		this.imagelist = new ArrayList<Imagmsg>();
		try{
			for (int i = 0;i < catlist.size();i++){
				Imagmsg imagmsg = img.getCatImagebyId(catlist.get(i).getId());
				this.imagelist.add(imagmsg);
		    }
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		}
		return ADM_CAT_LIST;
	
	}
	

	@Action(value = "IndexAction",
			results = { @Result(name = "catlist", 
					            location = "/content/main_cat_list.jsp"),
					    @Result(name = "indexlist",
					    		location = "/index.jsp")},
			interceptorRefs = { @InterceptorRef(value = "parStack")})
	
	public String IndexAction()
	    throws Exception
	    {
		
		this.catlist_pet = adm.getCatsbyPage(0, WebConstant.admIndexPageSize, null, 1, WebConstant.priceLow, WebConstant.priceHigh);
		this.catlist_breed = adm.getCatsbyPage(0, WebConstant.admIndexPageSize, null, 2, WebConstant.priceLow, WebConstant.priceHigh);
		this.catlist_match = adm.getCatsbyPage(0, WebConstant.admIndexPageSize, null, 3, WebConstant.priceLow, WebConstant.priceHigh);
		this.planlist = adm.getPlanList(0, WebConstant.admIndexPlanPageSize);

		this.imagelist_pet = new ArrayList<Imagmsg>();
		this.imagelist_match = new ArrayList<Imagmsg>();
		this.imagelist_breed = new ArrayList<Imagmsg>();
		try {
			for (int i = 0;i < catlist_pet.size();i++){
				
					Imagmsg imagmsg = img.getCatImagebyId(catlist_pet.get(i).getId());
					this.imagelist_pet.add(imagmsg);
					
			}
		  
			  for (int i = 0;i < catlist_breed.size();i++){
					
					Imagmsg imagmsg = img.getCatImagebyId(catlist_breed.get(i).getId());
					this.imagelist_breed.add(imagmsg);
					
			}
			
		    for (int i = 0;i < catlist_match.size();i++){
			
			        Imagmsg imagmsg = img.getCatImagebyId(catlist_match.get(i).getId());
			        this.imagelist_match.add(imagmsg);
		    }
		    
          

			
		}catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		 
     
		return INDEX_LIST;
	}
	
}