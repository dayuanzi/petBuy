package com.keemo.petstore.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Comparator;

import com.keemo.petstore.action.WebConstant;
import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Address;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Breedingorder;
import com.keemo.petstore.bean.Breedingplan;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Catype;
import com.keemo.petstore.bean.Order;
import com.keemo.petstore.bean.PedigreeCertificate;
import com.keemo.petstore.bean.Rank;

import com.keemo.petstore.dao.AddressDao;
import com.keemo.petstore.dao.AdminDao;
import com.keemo.petstore.dao.BreedingPlanDao;
import com.keemo.petstore.dao.CartDao;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.FollowDao;
import com.keemo.petstore.dao.OrderDao;
import com.keemo.petstore.service.MemManager;

import edu.emory.mathcs.backport.java.util.Collections;

public class MemManagerImpl 
     implements MemManager
{
    private OrderDao orderDao;
    private CartDao cartDao;
    private FollowDao followDao;
    private AdminDao adminDao;
    private CatDao catDao;
    private AddressDao addressDao;
    private BreedingPlanDao breedingPlanDao;
   
    
    
    public void setAddressDao(AddressDao addressDao){
    	
    	this.addressDao = addressDao;
    	
    }
    
    public void setCatDao(CatDao catDao)
	{
		this.catDao = catDao;
	}
	public void setAdminDao(AdminDao adminDao)
	{
		this.adminDao = adminDao;
	}
    public void setOrderDao(OrderDao orderDao)
	{
		this.orderDao = orderDao;
	}
    public void setCartDao(CartDao cartDao)
	{
		this.cartDao = cartDao;
	}
    public void setFollowDao(FollowDao followDao)
	{
		this.followDao = followDao;
	}
    public void setBreedingPlanDao(BreedingPlanDao breedingPlanDao)
	{
		this.breedingPlanDao = breedingPlanDao;
	}


    
    
	public List<Order> getOrdersbyUserid(Integer pageNo, Integer pageSize,
			Integer userid ,Byte ispay) {
		// TODO Auto-generated method stub
		List<Order> list=orderDao.findByUserid(userid, pageNo, pageSize, ispay);
		
		return list;
	}
	public List<Cat> getOwnedCatsbyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return orderDao.findByOwnCats(userid, pageNo, pageSize);
	}
	
	public List<List<Cart>> getCartbyUserid(Integer pageNo,Integer pageSize,Integer userid) throws Exception
	{
		List<List<Cart>>  resultlist = new ArrayList<List<Cart>>();
		List<Cattery> cattlist = new ArrayList<Cattery>();
		try{
			 cattlist = cartDao.findCatteryAtCart(pageNo, pageSize, userid);
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		
		try{
			for(int i=0;i<cattlist.size();i++){
				
				resultlist.add(cartDao.findByUserid(userid,cattlist.get(i).getId()
						, pageNo, pageSize));
			}
		}
		catch (Exception e){
			e.printStackTrace();
			throw e;
		}
		
		return resultlist;
	}
	public List<Cattery> getFollowedCatterybyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return followDao.findByUserId(pageNo, pageSize, userid);
	}
	

	/**
	 * 保存验证码
	 * @param username
	 * @return 返回一个随机字符串
	 */
	
	public String saveVericode(Integer userid  , String vericode){
		
		Activericode activericode = new Activericode();
		
		activericode.setUserid(userid);
		activericode.setVericode(vericode);
		Date dt=new Date();
		
		activericode.setTime(dt);
		adminDao.save(activericode);
		
		return vericode;		
	}
	
	/**
	 * 保存验证码
	 * @param username
	 * @return 返回一个随机字符串
	 */
	
	public List<Activericode> checkVericode(Integer userid , String vericode){
		

		
		List<Activericode> list = adminDao.findActivericodeByUsernameandPass(userid,vericode);
		
		if(list.size()>0){
			adminDao.delete(list.get(0));
			
		}
		return list;
	
	
}
	
	
	public Admin getAdmin(Integer id){
		
		return adminDao.get(id);

	}
	
    public void updateAdmin(Admin admin){
		
		adminDao.update(admin);
		
	}
    
    public  boolean  checkUsername(String username){
    	
    	if(adminDao.findByName(username).size()>0){

    		return false;

    	}
    	
    		return true;
    
    }
    
    
      public Integer saveAddress(Address address){
    	  
    	   return addressDao.save(address);
       }
      
      public Address getAddress(Integer addressid){
    	 return  addressDao.get(addressid);
      }
      
      
      public List<Address> getAddressByUser(Integer userid){
    	   
    	  return  addressDao.findByUser(userid,null);
    	   
       }
      
  	public void setAddressDefault(Integer userid,Integer addressid) throws Exception{
  	
  		
  	    List<Address> addresslist;
  	    try
  	    {
  		addresslist = addressDao.findByUser(userid,(byte)1);
  	    }
  		catch (Exception e){
  			throw e;
  		}
  		for(int i=0;i<addresslist.size();i++){
  			
  			try{
  				Address addressUpd = addresslist.get(i);
  				addressUpd.setDefaultMain((byte)0);
  			}
  			catch (Exception e){
  				throw e;
  			}
  	  	
  		}
  		Address address =  new Address();
  		address = addressDao.get(addressid);
  		try{
  			address = addressDao.get(addressid);
  			address.setDefaultMain((byte)1);
  		}
  		catch(Exception e){
  			throw e;
  		}
  		
  	}
  	
  	public void deleteAddress(Integer addressid) throws Exception{
  		
  		try{
  			addressDao.delete(addressid);
  		}
  		catch(Exception e){
  			e.printStackTrace();
  			throw e;
  		}
  	
  		
  	}
  	
	public void saveCart(Cart cart) throws Exception{
		
		try{
			cartDao.save(cart);
		}
		catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		
	}
	
	
	public boolean addOrder(List<Cart> cartlist,Integer userid,Integer addressid) throws Exception
	{
	    List<List<Cat>> catlists = this.getCatsByCart(cartlist);
	    if (catlists == null)
	    	return false;
	    for(int k=0;k<catlists.size();k++){
	      
	      Order order = new Order();
	      Address address = new Address();
	      address.setId(addressid);
		  Date date = new Date();
	      Admin admin = new Admin();
	      admin.setId(userid);
	      order.setTime(date);
	      order.setAdmin(admin);
	      order.setAddress(address);
		  order.setCattery(catlists.get(k).get(0).getCattery());
		  order.setIspay((byte)0);
		  Double price = 0.00;
		  try {
			  
			  
			  for(int o=0;o<catlists.get(k).size();o++){
			      
			      Cat cat = catlists.get(k).get(o);
			      price = price + cat.getPrice();
			      cat.setOrder(order);
			      catDao.save(cat);
			      
			      }
			      order.setPrice(price);
				  orderDao.save(order);
		  }
		  catch(Exception e)
		  {
			  e.printStackTrace();
			  throw e;
		  }
	    
	
	    }
	    return true;
	}
      public List<List<Cat>> getCatsByCart(List<Cart> cartlist) throws Exception{
    	  
    	  List<Cat> catlist = new ArrayList<Cat>();
          List<List<Cat>> catlists = new ArrayList<List<Cat>>();
          try{
        	  
        	  for(int i=0;i<cartlist.size();i++){
            	  
         	     Cart cart = cartDao.get(cartlist.get(i).getId());
         	     Cat cat = cart.getCat();
         	    
         	     if (cat.getOrder()!=null)
         	    	 return null;
                  catlist.add(cat);
                  
               }
        	  
          }catch(Exception e){
        	  e.printStackTrace();
        	  throw e;
        	  
          }
         
          
        Collections.sort(catlist,new Comparator<Cat>(){
              public int compare(Cat arg0, Cat arg1) {
                  return arg0.getCattery().getId().compareTo(arg1.getCattery().getId());
              }
        });
        
        
        int j=0;
        int i=0;
        
      	String name = catlist.get(0).getCattery().getName();
      	List<Cat> catlistsub = new ArrayList<Cat>();
        for(;i < catlist.size();i++){
        	
        	if(catlist.get(i).getCattery().getName()!=name){
        		catlists.add(catlistsub);
        		name = catlist.get(i).getCattery().getName();
        		catlistsub = new ArrayList<Cat>();
        		catlistsub.add(catlist.get(i));
        		continue;

        	}
        	else{
        		catlistsub.add(catlist.get(i));
        	}
        	
        }
        catlists.add(catlistsub);
        return catlists;
      
      }
      
      public boolean addPlanOrder(Breedingorder breedingorder) throws Exception{
    	  
    	try {
    		
    		  Breedingplan breedingplan = breedingPlanDao.get(breedingorder.getBreedingplan().getId());
    		  Integer ordercount = breedingplan.getOrdercount();
    		  Integer catcount = breedingplan.getCatcount();
    		  if(catcount<=ordercount) {
    			  return false;
    		  }
    		  Date date = new Date();
    		  breedingorder.setStatus((byte)0);
    		  breedingorder.setTime(date);
    		  breedingPlanDao.saveOrder(breedingorder);
    		  return true;
    	}
    	catch(Exception e){
    		
    		e.printStackTrace();
    		throw e;
    	
    	}
    	  
      }
      

      public void deleteCart(Cart cart,Admin admin) throws Exception{
    	  
    	  try{
    		  if(cartDao.get(cart.getId()).getAdmin().getId()==admin.getId()){
    			  cartDao.delete(cart);
    		  }

    	  }
    	  catch (Exception e){
    		  e.printStackTrace();
    		  throw e;
    	  }

      }
      
      
      public void deleteOrder(Order order,Admin admin) throws Exception{
    	  
    	  try{
    		  if(orderDao.get(order.getId()).getAdmin().getId()==admin.getId()){
            	  orderDao.delete(order);
    		  }

    	  }
    	  catch (Exception e){
    		  e.printStackTrace();
    		  throw e;
    	  }

      }
      
      
       public void deletePlanOrder(Breedingorder breedingorder,Admin admin) throws Exception{
    	  
    	  try{
    		  if(orderDao.get(breedingorder.getId()).getAdmin().getId()==admin.getId()){
        		  breedingPlanDao.deleteOrder(breedingorder);
    		  }

    	  }
    	  catch (Exception e){
    		  e.printStackTrace();
    		  throw e;
    	  }
      }
      

}

