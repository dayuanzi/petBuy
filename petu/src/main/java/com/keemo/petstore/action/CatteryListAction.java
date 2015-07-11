package com.keemo.petstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.AdmManager.*;


public class CatteryListAction
	extends AdmBaseAction
{
	private List<Cattery> catterylist;
	public void setCatterylist(List<Cattery> catterylist)
	{
		this.catterylist = catterylist;
	}
	public List<Cattery> getCatterylist()
	{
		return this.catterylist;
	}
	
	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumner"))[0];
		String typeIdStr = ((String[])ctx.getParameters().get("typeId"))[0];
		String rankIdStr = ((String[])ctx.getParameters().get("rankId"))[0];
		String regionIdStr = ((String[])ctx.getParameters().get("regionId"))[0];
		String priceLowStr = ((String[])ctx.getParameters().get("priceLow"))[0];
		String priceHighStr = ((String[])ctx.getParameters().get("priceHigh"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer typeId = null;
		Integer rankId = null;
		Integer regionId = null;
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
		if(regionIdStr!="")
		{
			regionId = Integer.valueOf(regionIdStr);
		}
		else
		{
			regionId = null;
		}

		Integer priceLow = Integer.valueOf(priceLowStr);
		Integer priceHigh = Integer.valueOf(priceHighStr);
		Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catterylist = adm.getCatterybyPage(pageNo, WebConstant.admPageSize, typeId, rankId,regionId, priceLow, priceHigh);
		return "catterylist";
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
		this.catterylist = adm.getCatterybyQuery(pageNo, WebConstant.admPageSize, queryStr);
		return "catsquery";
	}
	
	
}