package com.keemo.petstore.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.MemBaseAction;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Order;
import com.opensymphony.xwork2.ActionContext;

public class MemOrderManageAction extends MemBaseAction{
	
	private final String MEM_ADD_ORDER = "memaddorder";
	
	private Order order;
	
	public void setOrder(Order order){
		this.order = order; 
	}
	public Order getOrder(){
		return order;
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
	    	
	    	Date date = new Date();
	    	Admin admin = new Admin(); 
	    	admin.setId(Integer.valueOf(userIdStr));
	    	order.setAdmin(admin);
	    	order.setTime(date);
            mem.saveOrder(order);
            
	     return MEM_ADD_ORDER;
	     
		}

}
