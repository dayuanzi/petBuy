package com.keemo.petstore.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.keemo.petstore.action.base.*;
import com.keemo.petstore.exception.*;
import com.opensymphony.xwork2.*;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.*;
import com.keemo.petstore.bean.*;

import static com.keemo.petstore.service.MemManager.*;


public class MemberDetailAction
	extends MemBaseAction
{
	private final String MEM_DET = "memdetail";
	private final String MEM_ORD_LIST = "memordlist";
	private final String MEM_CAT_LIST = "memcatlist";
	private final String MEM_CART_LIST = "memcartlist";
	private final String MEM_CATT_LIST = "memcatterylist";
	private final String MEM_REGIS_CATT= "memregiscattery";
	
	
	private List<Order> orderlist;
	private List<Cat> catlist;
	private List<List<Cart>> cartlist;
	private List<Cattery> catterylist;
	
	public void setOrderlist(List<Order> orderlist)
	{
		this.orderlist = orderlist;
	}
	public List<Order> getOrderlist()
	{
		return this.orderlist;
	}
	
	
	public void setCatlist(List<Cat> catlist)
	{
		this.catlist = catlist;
	}
	public List<Cat> getCatlist()
	{
		return this.catlist;
	}
	
	public void setCartlist(List<List<Cart>> cartlist)
	{
		this.cartlist = cartlist;
	}
	public List<List<Cart>> getCartlist()
	{
		return this.cartlist;
	}
	
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
		//String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
		String userIdStr = ((String[])ctx.getParameters().get("userid"))[0];
		Integer userId = Integer.valueOf(userIdStr);
		
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		String isPayStr = ((String[])ctx.getParameters().get("ispay"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Byte ispay = Byte.valueOf(isPayStr);
		
		Integer pageNo = (pageNumber-1) * WebConstant.memOrderPageSize;
		orderlist = mem.getOrdersbyUserid(pageNo, WebConstant.memOrderPageSize, userId, ispay);
		return MEM_ORD_LIST;
		
	}
	public String MemOwnCatsAction(){
		
		ActionContext ctx = ActionContext.getContext();
		//String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
		String userIdStr = ((String[])ctx.getParameters().get("userid"))[0];
		Integer userId = Integer.valueOf(userIdStr);
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer pageNo = (pageNumber-1) * WebConstant.memCatPageSize;
		catlist = mem.getOwnedCatsbyUserid(pageNo, WebConstant.memCatPageSize, userId);
		return MEM_CAT_LIST;
	}
	
    public String MemCartAction() throws Exception
    {
		
		ActionContext ctx = ActionContext.getContext();
		//String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
		String userIdStr = ((String[])ctx.getParameters().get("userid"))[0];
		Integer userId = Integer.valueOf(userIdStr);
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer pageNo = (pageNumber-1) * WebConstant.memCartPageSize;
		try{
			cartlist = mem.getCartbyUserid(pageNo, WebConstant.memCartPageSize, userId);
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return MEM_CART_LIST;
	}
    
    
    public String MemFollowedAction(){
		
		ActionContext ctx = ActionContext.getContext();
		//String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
		String userIdStr = ((String[])ctx.getParameters().get("userid"))[0];
		Integer userId = Integer.valueOf(userIdStr);
		String pageNumberStr = ((String[])ctx.getParameters().get("pageNumber"))[0];
		Integer pageNumber = Integer.valueOf(pageNumberStr);
		Integer pageNo = (pageNumber-1) * WebConstant.memFollowedCatteryPageSize;
		catterylist = mem.getFollowedCatterybyUserid(pageNo,  WebConstant.memFollowedCatteryPageSize, userId);
		return MEM_CATT_LIST;
	}
    
    

	
	
}