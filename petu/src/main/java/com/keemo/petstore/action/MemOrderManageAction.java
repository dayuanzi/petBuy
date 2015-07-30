package com.keemo.petstore.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.MemBaseAction;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Order;
import com.opensymphony.xwork2.ActionContext;

public class MemOrderManageAction extends MemBaseAction{
	
	private final String MEM_ADD_ORDER = "memaddorder";
	
	public List<Cart> cartlist;
	public Integer addressid;
	
	public void setAddressid(Integer addressid){
		
		this.addressid = addressid;
	}
	
	public Integer getAddressid(){
		
		return this.addressid;
		
	}

	public void setCartlist(List<Cart> cartlist){
		this.cartlist = cartlist; 
	}
	public List<Cart>  getCartlist(){
		return this.cartlist;
	}
	
@Action(value = "OrderRegisterAction", 
				results = { 
				     @Result(name = "memaddorder", 
				    		 location = "/login.jsp")})
		
public String execute()
			throws Exception
		{
	
	    	ActionContext ctx = ActionContext.getContext();
	    	String userIdStr = ((String)ctx.getSession().get("userid"));
	    	
	    	mem.addOrder(cartlist,Integer.valueOf(userIdStr),addressid);
	        return MEM_ADD_ORDER;
	        
		}

}
