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


public class CatDetailAction
	extends AdmBaseAction
{
	private final String ADM_CAT_DET = "catdetail";
	private Cat cat;
	public void setCat(Cat cat)
	{
		this.cat = cat;
	}
	public Cat getCat()
	{
		return this.cat;
	}
	
	public String execute()
		throws Exception
	{

		ActionContext ctx = ActionContext.getContext();
		String catIdStr = ((String[])ctx.getParameters().get("catId"))[0];
		Integer catId = Integer.valueOf(catIdStr);
		this.cat = adm.getCatById(catId);
		return ADM_CAT_DET;
	}
	
	
}