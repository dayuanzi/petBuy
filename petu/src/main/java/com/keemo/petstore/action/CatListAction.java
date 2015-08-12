package com.keemo.petstore.action;

import java.net.URLEncoder;
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
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;

@ParentPackage(value = "default")

public class CatListAction
	extends AdmBaseAction
{
	private final String ADM_CAT_LIST = "catlist";
	private final String ADM_CAT_LIST_QUE = "catsquery";
	private final String INDEX_LIST = "indexlist";
	
	//private String pageNumber;
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


		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer typeId = null;
		Integer rankId = null;
		
		if(typeIdStr!=""){
			typeId = Integer.valueOf(typeIdStr);
		}
		else
		{
			typeId = null;
		}
		if(rankIdStr!="")
		{
			rankId = Integer.valueOf(rankIdStr);
		}
		else
		{
			rankId = null;
		}

		Double priceLow = Double.valueOf(priceLowStr);
		Double priceHigh = Double.valueOf(priceHighStr);
		
	    Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
	    
		this.catlist = adm.getCatsbyPage(pageNo, WebConstant.admPageSize, typeId, rankId, priceLow, priceHigh);
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

		return INDEX_LIST;
		
	}
	
	
	
	@Action(value = "CatsByQueryAction",
			results = { @Result(name = "catlist", 
					            location = "/content/main_cat_list.jsp"),
					    @Result(name = "catlistindex",
					    		location = "/WEB-INF/divPages/ind_catlist_div.jsp")},
			interceptorRefs = { @InterceptorRef(value = "parStack")})
	
	public String CatsByQueryAction()
	    throws Exception
	    {
		
		ActionContext ctx = ActionContext.getContext();
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		String queryStr = ((String[])ctx.getParameters().get("query"))[0];

		Integer pageNumber = Integer.valueOf(pageNumberStr);
		
		Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catlist = adm.getCatsbyQuery(pageNo, WebConstant.admPageSize, queryStr);
		return ADM_CAT_LIST;
		
	}

}