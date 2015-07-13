package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Cart;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.CartDao;
public class CartDaoHibernate extends YeekuHibernateDaoSupport implements CartDao
{

	/**
	 * 根据标识属性来加载Cart实例
	 * @param id 需要加载的Cart实例的标识属性值
	 * @return 指定标识属性对应的Cart实例
	 */
	public Cart get(Integer id)
	{
		return getHibernateTemplate()
		.get(Cart.class , id);
		
	}

	/**
	 * 持久化指定的Cart实例
	 * @param Cart 需要被持久化的Cart实例
	 * @return Cart实例被持久化后的标识属性值
	 */
	public String save(Cart Cart) {
		
		return (String)getHibernateTemplate()
		.save(Cart);
	}

	/**
	 * 修改指定的Cart实例
	 * @param Cart 需要被修改的Cart实例
	 */
	public void update(Cart Cart) {
		
		getHibernateTemplate()
		.update(Cart);
	}

	/**
	 * 删除指定的Cart实例
	 * @param Cart 需要被删除的Cart实例
	 */
	public void delete(Cart Cart) {
		getHibernateTemplate()
		.delete(Cart);
	}

	/**
	 * 根据标识属性删除Cart实例
	 * @param id 需要被删除的Cart实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}

	/**
	 * 根据用户id返回购物车列表
	 * @param pageNo
	 * @param pageSize 
	 * @param userid
	 */
	public List<Cart> findByUserid(final Integer userid,final Integer pageNo,
			final Integer pageSize) {
		// TODO Auto-generated method stub
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	 
		    	
		    	   Query query = session.createQuery("from Cart cart where cart.admin.id=? order by cart.time"); 
		    	
		    	   query.setParameter(0, userid);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		    	   }
		    	
		  });
	}

	



}

