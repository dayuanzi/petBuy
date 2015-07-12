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

import static com.keemo.petstore.service.MemManager.*;


public class MemberDetailAction
	extends MemBaseAction
{
	private final String MEM_DET = "memdetail";
	private final String MEM_ORD_LIST_DET = "memordlistdetail";
	
	public String execute()
		throws Exception
	{

	/*	ActionContext ctx = ActionContext.getContext();
		String catIdStr = ((String[])ctx.getParameters().get("catId"))[0];
		Integer catId = Integer.valueOf(catIdStr);
		this.cat = adm.getCatById(catId);
		*/
		return MEM_DET;
	}
	
	public String MemOrderListAction()
	{
		ActionContext ctx = ActionContext.getContext();
		String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
		Integer userId = Integer.valueOf(userIdStr);
		
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		String isPayStr = ((String[])ctx.getParameters().get("ispay"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer ispay = Integer.valueOf(isPayStr);
		
		Integer pageNo = (pageNumber-1) * WebConstant.memOrderPageSize;
		mem.getOrdersbyUserid(pageNo, WebConstant.memOrderPageSize, userId, ispay);
		return MEM_ORD_LIST_DET;
		
	}
	
	
	
}