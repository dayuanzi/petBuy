package com.keemo.petstore.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.MemBaseAction;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Breedingorder;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Order;
import com.keemo.petstore.dao.BreedingPlanDao;
import com.opensymphony.xwork2.ActionContext;

@Namespace("/MemberAction")
public class MemOrderManageAction extends MemBaseAction{
	
	private final String MEM_ADD_ORDER = "memaddorder";
	private final String MEM_ADD_PLAN_ORDER = "memaddplanorder";

	public List<Cart> cartlist;
	public Integer addressid;
	public Breedingorder breedingorder;
	public Order order;
	
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
	
    public void setBreedingorder(Breedingorder breedingorder){
		
		this.breedingorder = breedingorder;
	}
	
	public Breedingorder getBreedingorder(){
		
		return this.breedingorder;
		
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
	    	
	    	if(mem.addOrder(cartlist,Integer.valueOf(userIdStr),addressid)==false)	{
	    		
	    		ServletActionContext.getRequest().setAttribute("msg", "您选中的商品已被购买");
	    		 
	    	}
	    	
	        return MEM_ADD_ORDER;
	        
		}


@Action(value = "OrderDeleteAction")

public String OrderDeleteAction()
	throws Exception
{

	ActionContext ctx = ActionContext.getContext();
	String userIdStr = ((String)ctx.getSession().get("userid"));
	Admin admin = new Admin();
	admin.setId(Integer.valueOf(userIdStr));
	mem.deleteOrder(order, admin);
	
    return null;
    
}










@Action(value = "BreedingPlanOrderRegisterAction", 
		results = { 
		     @Result(name = "memaddplanorder", 
		    		 location = "/login.jsp")})

public String BreedingPlanOrderRegisterAction()
	throws Exception
{

	ActionContext ctx = ActionContext.getContext();
	String userIdStr = ((String)ctx.getSession().get("userid"));
	
	breedingorder.setUserid(Integer.valueOf(userIdStr));
	
	
    if(mem.addPlanOrder(breedingorder)==false){
		
		ServletActionContext.getRequest().setAttribute("msg", "您选中的商品已被购买");
		
	}
	
    return MEM_ADD_PLAN_ORDER;
    
}


@Action(value = "BreedingPlanOrderDeleteAction")

public String BreedingPlanOrderDeleteAction()
	throws Exception
{

	ActionContext ctx = ActionContext.getContext();
	String userIdStr = ((String)ctx.getSession().get("userid"));
	
	Admin admin = new Admin();
	admin.setId(Integer.valueOf(userIdStr));
	
	mem.deletePlanOrder(breedingorder, admin);
	
    return null;
    
}






}
