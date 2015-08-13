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
import org.hibernate.mapping.Array;

import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;


public class CatteryListAction
	extends AdmBaseAction
{
	private final String ADM_CATTE_LIST = "catterylist";
	private final String ADM_CATTE_LIST_QUE = "catteryquery";
	
	
	private List<Cattery> catterylist;
	private List<List<Imagmsg>> imagelist;
	private List<Imagmsg> mainimage;
	private String pageNumberStr;
	private String typeIdStr;
	private String rankIdStr;
	private String regionIdStr;
	private String priceLowStr;
	private String priceHighStr;
	private String queryStr;

	
	
	
	
	/**
	 * @return the mainimage
	 */
	public List<Imagmsg> getMainimage() {
		return mainimage;
	}
	/**
	 * @param mainimage the mainimage to set
	 */
	public void setMainimage(List<Imagmsg> mainimage) {
		this.mainimage = mainimage;
	}
	/**
	 * @return the queryStr
	 */
	public String getQueryStr() {
		return queryStr;
	}
	/**
	 * @param queryStr the queryStr to set
	 */
	public void setQueryStr(String queryStr) {
		this.queryStr = queryStr;
	}
	/**
	 * @return the pageNumberStr
	 */
	public String getPageNumberStr() {
		return pageNumberStr;
	}
	/**
	 * @param pageNumberStr the pageNumberStr to set
	 */
	public void setPageNumberStr(String pageNumberStr) {
		this.pageNumberStr = pageNumberStr;
	}
	/**
	 * @return the typeIdStr
	 */
	public String getTypeIdStr() {
		return typeIdStr;
	}
	/**
	 * @param typeIdStr the typeIdStr to set
	 */
	public void setTypeIdStr(String typeIdStr) {
		this.typeIdStr = typeIdStr;
	}
	/**
	 * @return the rankIdStr
	 */
	public String getRankIdStr() {
		return rankIdStr;
	}
	/**
	 * @param rankIdStr the rankIdStr to set
	 */
	public void setRankIdStr(String rankIdStr) {
		this.rankIdStr = rankIdStr;
	}
	/**
	 * @return the regionIdStr
	 */
	public String getRegionIdStr() {
		return regionIdStr;
	}
	/**
	 * @param regionIdStr the regionIdStr to set
	 */
	public void setRegionIdStr(String regionIdStr) {
		this.regionIdStr = regionIdStr;
	}
	/**
	 * @return the priceLowStr
	 */
	public String getPriceLowStr() {
		return priceLowStr;
	}
	/**
	 * @param priceLowStr the priceLowStr to set
	 */
	public void setPriceLowStr(String priceLowStr) {
		this.priceLowStr = priceLowStr;
	}
	/**
	 * @return the priceHighStr
	 */
	public String getPriceHighStr() {
		return priceHighStr;
	}
	/**
	 * @param priceHighStr the priceHighStr to set
	 */
	public void setPriceHighStr(String priceHighStr) {
		this.priceHighStr = priceHighStr;
	}
	/**
	 * @return the imagelist
	 */
	public List<List<Imagmsg>> getImagelist() {
		return imagelist;
	}
	/**
	 * @param imagelist the imagelist to set
	 */
	public void setImagelist(List<List<Imagmsg>> imagelist) {
		this.imagelist = imagelist;
	}
	public void setCatterylist(List<Cattery> catterylist)
	{
		this.catterylist = catterylist;
	}
	public List<Cattery> getCatterylist()
	{
		return this.catterylist;
	}
	
	
	@Action(value = "CatteryListAction", 
			results = { 
			     @Result(name = "catterylist", 
			    		 location = "/content/catterylist.jsp")})
	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();

		Integer pageNumber = 1;
		Integer typeId = null;
		Integer rankId = null;
		Integer regionId = null;
		Double priceLow = 1.00;
		Double priceHigh = 1000000.00;
		if(typeIdStr!=null){
			typeId = Integer.valueOf(typeIdStr);
		}
		if(rankIdStr!=null)
		{
			rankId = Integer.valueOf(rankIdStr);
		}

		if(regionIdStr!=null)
		{
			regionId = Integer.valueOf(regionIdStr);
		}
		
		if(pageNumberStr!=null)
		{
			pageNumber = Integer.valueOf(pageNumberStr);
		}
		
		if(priceLowStr!=null)
		{
			priceLow = Double.valueOf(priceLowStr);
		}
		
		if(priceHighStr!=null)
		{
			priceHigh = Double.valueOf(priceHighStr);
		}
				
		Integer pageNo = (pageNumber-1) * WebConstant.admCatteryPageSize;
		this.catterylist = adm.getCatterybyPage(pageNo, WebConstant.admCatteryPageSize, typeId, rankId,regionId, priceLow, priceHigh,queryStr);
		this.imagelist = new ArrayList<List<Imagmsg>>();
		this.mainimage = new ArrayList<Imagmsg>();
		for(int i=0;i<catterylist.size();i++){
			
			List<Imagmsg> catteryImageList = new ArrayList<Imagmsg>();
			List<Cat> catteryCatsList = new ArrayList<Cat>();
			
			Integer catteryId = catterylist.get(i).getId();
			
			catteryCatsList = adm.getCatsbyCatteryId(catteryId);
			this.mainimage.add(img.getCatteryImagebyId(catteryId));
			for(int j=0;j<catteryCatsList.size()&&j<4;j++){
				
				catteryImageList.add(img.getCatImagebyId(catteryCatsList.get(j).getId()));
				
			}
			
			this.imagelist.add(catteryImageList);

		}
		
		
		
		return ADM_CATTE_LIST;
	}
	
	public String CatterysByQueryAction()
	    throws Exception
	    {
		
		ActionContext ctx = ActionContext.getContext();
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumner"))[0];
		String queryStr = ((String[])ctx.getParameters().get("query"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		System.out.println(queryStr);
		Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catterylist = adm.getCatterybyQuery(pageNo, WebConstant.admCatteryPageSize, queryStr);
		return ADM_CATTE_LIST_QUE;
	}
	
	
}