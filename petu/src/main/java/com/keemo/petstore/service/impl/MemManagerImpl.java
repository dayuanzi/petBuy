package com.keemo.petstore.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Address;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Catype;
import com.keemo.petstore.bean.Order;
import com.keemo.petstore.bean.PedigreeCertificate;
import com.keemo.petstore.bean.Rank;

import com.keemo.petstore.dao.AddressDao;
import com.keemo.petstore.dao.AdminDao;
import com.keemo.petstore.dao.CartDao;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.FollowDao;
import com.keemo.petstore.dao.OrderDao;
import com.keemo.petstore.service.MemManager;

public class MemManagerImpl 
     implements MemManager
{
    private OrderDao orderDao;
    private CartDao cartDao;
    private FollowDao followDao;
    private AdminDao adminDao;
    private CatDao catDao;
    private AddressDao addressDao;
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
	
	public List<Cart> getCartbyUserid(Integer pageNo,Integer pageSize,Integer userid)
	{
		return cartDao.findByUserid(userid, pageNo, pageSize);
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
  				addressDao.update(addressUpd);
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
  			addressDao.save(address);
  		}
  		catch(Exception e){
  			throw e;
  		}
  		
  	}
  	
	public void saveCart(Cart cart) throws Exception{
		
		try{
			cartDao.save(cart);
		}
		catch(Exception e){
			
			throw e;
		}
		
	}
	
	public void saveOrder(Order order) throws Exception{
		
		try{
			orderDao.save(order);
		}
		catch(Exception e){
			
			throw e;
		}
		
	}
      

}

