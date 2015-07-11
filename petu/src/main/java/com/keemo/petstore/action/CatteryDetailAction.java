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
	private Cattery cattery;
	public void setCattery(Cattery cattery)
	{
		this.cattery = cattery;
	}
	public Cattery getCattery()
	{
		return this.cattery;
	}
	
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		String catteryIdStr = ((String[])ctx.getParameters().get("catteryId"))[0];
		Integer catteryId = Integer.valueOf(catteryIdStr);
		this.cattery = adm.getCatteryById(catteryId);
		return "catterydetail";
	}
}