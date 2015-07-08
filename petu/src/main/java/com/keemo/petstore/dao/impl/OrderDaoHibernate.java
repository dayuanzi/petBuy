package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

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
	public String save(Order Order) {
		
		return (String)getHibernateTemplate()
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



}

