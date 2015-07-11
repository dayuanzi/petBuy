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


public class CatteryDetailAction
	extends AdmBaseAction
{
	private final String ADM_CATT_DET_CAT_LIST = "catslist";
	private final String ADM_CATT_DET = "catterydetail";
	private Cattery cattery;
	private List<Cat> catlist;
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
	
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		String catteryIdStr = ((String[])ctx.getParameters().get("catteryId"))[0];
		Integer catteryId = Integer.valueOf(catteryIdStr);
		this.cattery = adm.getCatteryById(catteryId);
		return ADM_CATT_DET;
	}
	
	public String CatsByCatteryAction()
	throws Exception
{

	ActionContext ctx = ActionContext.getContext();
	String pageNumberStr = ((String[])ctx.getParameters().get("pageNumner"))[0];
	String catteryIdStr = ((String[])ctx.getParameters().get("catteryId"))[0];
	Integer catteryId = Integer.valueOf(catteryIdStr);
	
	Integer pageNumber = Integer.valueOf(pageNumberStr);
	Integer pageNo = (pageNumber-1) * WebConstant.admCattDetCatPageSize;
	
	this.catlist = adm.getCatsbyCatteryId(pageNo, WebConstant.admCattDetCatPageSize, catteryId);
	return ADM_CATT_DET_CAT_LIST;
}
	
	
}