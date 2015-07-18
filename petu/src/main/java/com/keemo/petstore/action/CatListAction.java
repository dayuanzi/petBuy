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
	private final String ADM_CAT_LIST_INDEX = "catlistindex";
	private final String ADM_CAT_LIST_QUE = "catsquery";
	
	
	private List<Cat> catlist;
	
	
	
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	@Action(value = "CatListAction", 
			results = { 
			     @Result(name = "catlist", 
			    		 location = "/content/main_cat_list.jsp"),
			     @Result(name = "catlistindex", 
			    		 location = "/WEB-INF/divPages/ind_catlist_div.jsp") },
			interceptorRefs = {  @InterceptorRef(value = "parStack")})
	public String execute()
		throws Exception
	{
		
		ActionContext ctx = ActionContext.getContext();
		
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumner"))[0];
		String typeIdStr = ((String[])ctx.getParameters().get("typeId"))[0];
		String rankIdStr = ((String[])ctx.getParameters().get("rankId"))[0];
		String priceLowStr = ((String[])ctx.getParameters().get("priceLow"))[0];
		String priceHighStr = ((String[])ctx.getParameters().get("priceHigh"))[0];
		String pageIdStr = ((String[])ctx.getParameters().get("pageId"))[0];
		Integer pageId = Integer.valueOf(pageIdStr);
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

		Integer priceLow = Integer.valueOf(priceLowStr);
		Integer priceHigh = Integer.valueOf(priceHighStr);
		if(pageId==1)
		{
	    Integer pageNo = (pageNumber-1) * WebConstant.admIndexPageSize;
		this.catlist = adm.getCatsbyPage(pageNo, WebConstant.admIndexPageSize, typeId, rankId, priceLow, priceHigh);
		return ADM_CAT_LIST_INDEX;
		}
		
	    Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catlist = adm.getCatsbyPage(pageNo, WebConstant.admPageSize, typeId, rankId, priceLow, priceHigh);
		return ADM_CAT_LIST;
	
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
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumner"))[0];
		String queryStr = ((String[])ctx.getParameters().get("query"))[0];
		String pageIdStr = ((String[])ctx.getParameters().get("pageId"))[0];
		Integer pageId = Integer.valueOf(pageIdStr);

		
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		if(pageId==1)
		{
		Integer pageNo = (pageNumber-1) * WebConstant.admIndexPageSize;
		this.catlist = adm.getCatsbyQuery(pageNo, WebConstant.admIndexPageSize, queryStr);
		return ADM_CAT_LIST_INDEX;
		}
		
		Integer pageNo = (pageNumber-1) * WebConstant.admPageSize;
		this.catlist = adm.getCatsbyQuery(pageNo, WebConstant.admPageSize, queryStr);
		return ADM_CAT_LIST;
		
	}
	
	
}