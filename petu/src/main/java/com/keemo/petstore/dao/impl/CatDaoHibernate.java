package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.CatDao;
public class CatDaoHibernate extends YeekuHibernateDaoSupport implements CatDao
{

	/**
	 * 根据标识属性来加载Cat实例
	 * @param id 需要加载的Cat实例的标识属性值
	 * @return 指定标识属性对应的Cat实例
	 */
	public Cat get(Integer id)
	{
		return getHibernateTemplate()
		.get(Cat.class , id);
		
	}

	/**
	 * 持久化指定的Cat实例
	 * @param Cat 需要被持久化的Cat实例
	 * @return Cat实例被持久化后的标识属性值
	 */
	public Integer save(Cat Cat) {
		
		return (Integer)getHibernateTemplate()
		.save(Cat);
	}

	/**
	 * 修改指定的Cat实例
	 * @param Cat 需要被修改的Cat实例
	 */
	public void update(Cat Cat) {
		
		getHibernateTemplate()
		.update(Cat);
	}

	/**
	 * 删除指定的Cat实例
	 * @param Cat 需要被删除的Cat实例
	 */
	public void delete(Cat Cat) {
		getHibernateTemplate()
		.delete(Cat);
	}

	/**
	 * 根据标识属性删除Cat实例
	 * @param id 需要被删除的Cat实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}

	/**
	 * 根据条件返回猫咪列表
	 * @param pageNo 
	 * @param pageSize  
	 * @param typeId 
	 * @param rankId 
	 * 
	 * return List<Cat>
	 */
	public List<Cat> findByPage(final Integer pageNo,final Integer pageSize,final Integer typeId,final Integer rankId ,final Integer priceLow ,final Integer priceHigh)
	{
		HibernateTemplate ht=getHibernateTemplate();
		

	
		   return ht.executeFind(new HibernateCallback() {
			   
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   if(typeId==null&&rankId==null){
		    		   Query query = session.createQuery("from Cat cat where price >= ? and price <= ? and order = null"); 
		    		   query.setParameter(1, priceHigh);
		    		   query.setParameter(0, priceLow);
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   else if(typeId!=null&&rankId==null){
		    		   Query  query = session.createQuery("from Cat cat where typeId = ? and  price >= ? and price <= ? and order = null");
		    		   query.setParameter(0, typeId);
		    		   query.setParameter(1, priceLow);
		    		   query.setParameter(2, priceHigh);
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   else if(typeId==null&&rankId!=null){
		    		   Query query = session.createQuery("from Cat cat where rankId = ? and price >= ? and price <= ? and order = null");
		    		   query.setParameter(0, rankId);
		    		   query.setParameter(1, priceLow);
		    		   query.setParameter(2, priceHigh);
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   Query query = session.createQuery("from Cat cat where typeId = ? and rankId = ? and price >= ? and price <= ? and order = null");
		    		   query.setParameter(0, typeId);
		    		   query.setParameter(1, rankId);
		    		   query.setParameter(2, priceLow);
		    		   query.setParameter(3, priceHigh);
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   
		     }
		 });
    }
	
	/**
	 * 根据搜索返回猫咪列表
	 * @param pageNo pageSize queryStr
	 * @return 返回 Cat List
	 */
	public List<Cat> findByQuery(final Integer pageNo,final Integer pageSize,final String queryStr)
    {
		HibernateTemplate ht=getHibernateTemplate();
	return ht.executeFind(new HibernateCallback() {
	   public Object doInHibernate(Session session)
        throws HibernateException {
	    		   Query query = session.createQuery("from Cat cat where name like ? and order = null"); 

	    		   query.setParameter(0, "%"+queryStr+"%");
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
	    	   	}
		 });
     }
	
	
	/**
	 * 根据猫舍id返回猫咪列表
	 * @param pageNo pageSize catteryId
	 * @return 返回 Cat List
	 */
	public List<Cat> findByCattery(final Integer pageNo,final Integer pageSize,final Integer catteryId)
	{
		
		HibernateTemplate ht=getHibernateTemplate();
		return ht.executeFind(new HibernateCallback() {
		   public Object doInHibernate(Session session)
	        throws HibernateException {
		    		   Query query = session.createQuery("from Cat cat where catteryid=? and order = null"); 
		    		   query.setParameter(0, catteryId);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    	   	}
			 });
	}

}

