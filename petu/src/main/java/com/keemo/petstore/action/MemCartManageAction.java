package com.keemo.petstore.action;

import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.MemBaseAction;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cart;
import com.opensymphony.xwork2.ActionContext;

@Namespace("/MemberAction")
public class MemCartManageAction extends MemBaseAction{
	
	private final String MEM_ADD_CART = "memaddcart";
	
	private Cart cart;
	
	public void setCart(Cart cart){
		this.cart = cart; 
	}
	public Cart getCart(){
		return cart;
	}
	


	
	
@Action(value = "CartRegisterAction", 
				results = { 
				     @Result(name = "memdelcart", 
				    		 location = "/login.jsp")})
		
public String execute()
			throws Exception
		{
	    	ActionContext ctx = ActionContext.getContext();
	    	String userIdStr = ((String)ctx.getSession().get("userid"));
	    	Admin admin = new Admin();
	    	admin.setId(Integer.valueOf(userIdStr));
	    	Date date = new Date();
	    	cart.setTime(date); 
	    	cart.setAdmin(admin);
            mem.saveCart(cart);
	        return MEM_ADD_CART;
		}



@Action(value = "CartDeleteAction", 
		results = { 
		     @Result(name = "memaddcart", 
		    		 location = "/login.jsp")})

 public String CartDeleteAction()
	     throws Exception
      {
	     ActionContext ctx = ActionContext.getContext();
	     String userIdStr = ((String)ctx.getSession().get("userid"));
	     Admin admin = new Admin();
	     admin.setId(Integer.valueOf(userIdStr));

         mem.deleteCart(cart, admin);
         
         return null;
      }

}




