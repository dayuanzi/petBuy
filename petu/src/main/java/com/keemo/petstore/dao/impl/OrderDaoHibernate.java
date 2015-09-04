package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Order;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.OrderDao;
public class OrderDaoHibernate extends YeekuHibernateDaoSupport implements OrderDao
{

	/**
	 * 根据标识属性来加载Order实例
	 * @param id 需要加载的Order实例的标识属性值
	 * @return 指定标识属性对应的Order实例
	 */
	public Order get(Integer id)
	{
		return getHibernateTemplate()
		.get(Order.class , id);
		
	}

	/**
	 * 持久化指定的Order实例
	 * @param Order 需要被持久化的Order实例
	 * @return Order实例被持久化后的标识属性值
	 */
	public Integer save(Order Order) {
		
		return (Integer)getHibernateTemplate()
		.save(Order);
	}

	/**
	 * 修改指定的Order实例
	 * @param Order 需要被修改的Order实例
	 */
	public void update(Order Order) {
		
		getHibernateTemplate()
		.update(Order);
	}

	/**
	 * 删除指定的Order实例
	 * @param Order 需要被删除的Order实例
	 */
	public void delete(Order Order) {
		getHibernateTemplate()
		.delete(Order);
	}

	/**
	 * 根据标识属性删除Order实例
	 * @param id 需要被删除的Order实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}
	
	/**
	 * 根据标识属性删除Order实例
	 * @param pageNo 第一条订单
	 * @param pageSize 订单大小
	 */
	public List<Order> findByPage(final Integer pageNo, final Integer pageSize) {
		// TODO Auto-generated method stub
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   Query query = session.createQuery("from Order ord"); 
		    		 
	    		     query.setMaxResults(pageSize);
			         query.setFirstResult(pageNo);
			         return query.list();
			         
		       }
		  });
	}
	


	/**
	 * 根据用户id返回订单列表
	 * @param pageNo
	 * @param pageSize 
	 * @param userid
	 */
	public List<Order> findByUserid(final Integer userid,final Integer pageNo,
			final Integer pageSize,final Byte ispay) {
		// TODO Auto-generated method stub
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   if(ispay!=null){

		    	   Query query = session.createQuery("from Order ord where userid = ? and ispay = ?"); 

		    	   query.setParameter(0, userid);
		    	   query.setParameter(1, ispay);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		    	   }
		    	   else
		    	   {
		    		   Query query = session.createQuery("from Order ord where userid = ?"); 
			    		 
			    	   query.setParameter(0, userid);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    		   
		    	   }
			         
		       }
		  });
	}
	/**
	 * 根据商铺id返回订单列表
	 * @param pageNo
	 * @param pageSize 
	 * @param userid
	 */
	public List<Order> findByStoreid(final Integer storeid, final Integer pageNo,
			final Integer pageSize, final Byte ispay) {
		// TODO Auto-generated method stub
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   if(ispay!=null){
		    		   
		    	
		    	   Query query = session.createQuery("select ord from Order ord ,Cat cat where ord.id=cat.order.id and cat.cattery.id=? and ispay=? group by ord"); 
		    		 
		    	   query.setParameter(0, storeid);
		    	   query.setParameter(1, ispay);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		    	   }
		    	   else
		    	   {
		    		   Query query = session.createQuery("select ord from Order ord ,Cat cat where ord.id=cat.order.id and cat.cattery.id=? and group by ord"); 
			    		 
			    	   query.setParameter(0, storeid);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    		   
		    	   }
			         
		       }
		  });
	}
	
	/**
	 * 根据猫舍id返回猫咪列表
	 * @param pageNo pageSize catteryId
	 * @return 返回 Cat List
	 */
	
	public List<Cat> findByOwnCats(final Integer userid,final Integer pageNo,final Integer pageSize)
	{
		
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	
		    	
		    	   Query query = session.createQuery("select cat from Order ord ,Cat cat where ord.id=cat.order.id and ord.admin.id=? and ord.ispay=1 group by cat"); 
		    		 
		    	   query.setParameter(0, userid);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		       }
		  });
	}
	

	/**
	 * 根据订单id返回已经购买猫咪列表
	 * @param pageNo
	 * @param pageSize 
	 * @param userid
	 * @param ispay
	 */
	public List<Cat> findByOrderId(final Integer orderid, final Integer pageNo,final Integer pageSize){
		
		
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	
		    	
		    	   Query query = session.createQuery("select cat from Cat cat where cat.order.id=?"); 
		    		 
		    	   query.setParameter(0, orderid);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		       }
		  });
	}
	
   public List<Order> findByPay() throws Exception{
		
		HibernateTemplate ht=getHibernateTemplate();
		 return ht.find("from Order ord where ord.ispay=0");
	}
	
	
	public void deleteByPay() throws Exception{
		
		HibernateTemplate ht=getHibernateTemplate();
		 ht.execute(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	
		    	   Query query = session.createQuery("delete from Order ord where ord.ispay=0"); 
			       return query.executeUpdate();
		       }
		  });
	}
	
	
}

