package com.keemo.petstore.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.MemBaseAction;
import com.keemo.petstore.bean.Address;
import com.opensymphony.xwork2.ActionContext;

public class MemAddressAction extends MemBaseAction{
	
	
	
private final String MEM_ADD_ADDR = "memaddaddress";
private final String ADD_ADDR_ERROR = "memaddaddresserror";
private final String MEM_DEF_ADDR = "memdefaultaddr";
private final String MEM_ADDR_LIST = "memaddresslist";

	
private Address address;
private List<Address> addresslist;
	

public void setAddressList(List<Address> addresslist){
	this.addresslist = addresslist; 
}
public List<Address> getAddressList(){
return this.addresslist; 
}


public void setAddress(Address address){
		this.address = address; 
}
public Address getAddress(){
	return this.address; 
}
	
	
@Action(value = "AddressRegisterAction", 
				results = { 
				     @Result(name = "memaddaddress", 
				    		 location = "/login.jsp")})
		
public String execute()
			throws Exception
		{
	    	ActionContext ctx = ActionContext.getContext();

	    	
	    	//String catteryId = ((String[])ctx.getSession().get("u"))[0];
	    	String catteryId = "1";
	    	Integer addressid = mem.saveAddress(address);
	        
	    	address = mem.getAddress(addressid);
	    	if (address==null){
	    		ServletActionContext.getRequest().setAttribute("msg", "保存失败");
				return ADD_ADDR_ERROR;
	    	}
	    	
	     return MEM_ADD_ADDR;

		}


     @Action(value = "AddressListAction", 
				results = { 
				     @Result(name = "memaddresslist", 
				    		 location = "memaddress.jsp")})

       public String AddressListAction()
                  throws Exception
     {
           ActionContext ctx = ActionContext.getContext();

           String userIdStr = ((String[])ctx.getSession().get("userid"))[0];
           
           Integer userId = Integer.valueOf(userIdStr);
          
           this.addresslist = mem.getAddressByUser(userId);
           
           return MEM_ADDR_LIST;

      }
     
     @Action(value = "DefaultAddressAction", 
				results = { 
				     @Result(name = "memdefaultaddr", 
				    		 location = "memaddress.jsp")})

    public String DefaultAddressAction()
               throws Exception
  {
  
    	 
     ActionContext ctx = ActionContext.getContext();

     String userIdStr = ((String)ctx.getSession().get("userid"));
     Integer userId = Integer.valueOf(userIdStr);
     String addressIdStr = ((String[]) ctx.getParameters().get("addressid"))[0];
     Integer addressId = Integer.valueOf(addressIdStr);
     try{
    	 mem.setAddressDefault(userId, addressId);
     }
     catch(Exception e)
     {
    	 throw e;
     }
    
     
     return MEM_DEF_ADDR;	

   }

}





