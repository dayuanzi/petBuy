package com.keemo.petstore.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Set;

import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Catype;
import com.keemo.petstore.bean.Order;
import com.keemo.petstore.bean.PedigreeCertificate;
import com.keemo.petstore.bean.Rank;

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
    
    
    
       public Integer saveCat(String name ,Byte sex ,Integer typeid ,Date birthday,
    		   Integer rankid ,Integer pedigree_certificateid, Byte immune, Integer price, Byte stalen,Integer catteryId){
    	
    	   

   		Cattery cattery = new Cattery();
   		cattery.setId(catteryId);
   		Catype catype = new Catype(); 
   		catype.setId(typeid);
   		Rank rank =  new Rank();
   		rank.setId(rankid);
   		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid);
   		/*public Cat(Cattery cattery, Order order, Catype catype, Rank rank,
			PedigreeCertificate pedigreeCertificate, String name, Byte immune,
			Date birthday, Integer price, Integer oldprice, Byte stalen,
			Byte sex, Set orders, Set carts)*/
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name,immune,birthday,price,null,stalen,sex,null,null);
   		
   		
    	return catDao.save(cat);
    
    }
       
       public void updateCat(Integer Id, String name ,Byte sex ,Integer typeid ,Date birthday,
	  		   Integer rankid ,Integer pedigree_certificateid, Byte immune, Integer price, Byte stalen,Integer catteryId){
    	
    	
    	Cattery cattery = new Cattery();
      	cattery.setId(catteryId);
      	Catype catype = new Catype(); 
      	catype.setId(typeid);
      	Rank rank =  new Rank();
      	rank.setId(rankid);
      	
 		PedigreeCertificate pedigree_certificate = new PedigreeCertificate();
   		pedigree_certificate.setId(pedigree_certificateid);
      	
   		Cat cat = new Cat(cattery,null,catype,rank,pedigree_certificate,
   				name,immune,birthday,price,null,stalen,sex,null,null);
      	cat.setId(Id);
       	
       	catDao.update(cat);
       
       }
    
}

