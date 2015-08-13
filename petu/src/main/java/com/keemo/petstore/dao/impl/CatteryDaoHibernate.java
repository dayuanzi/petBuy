package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.CatteryDao;
public class CatteryDaoHibernate extends YeekuHibernateDaoSupport implements CatteryDao
{

	/**
	 * 根据标识属性来加载Cattery实例
	 * @param id 需要加载的Cattery实例的标识属性值
	 * @return 指定标识属性对应的Cattery实例
	 */
	public Cattery get(Integer id)
	{
		return getHibernateTemplate()
		.get(Cattery.class , id);
		
	}

	/**
	 * 持久化指定的Cattery实例
	 * @param Cattery 需要被持久化的Cattery实例
	 * @return Cattery实例被持久化后的标识属性值
	 */
	public Integer save(Cattery Cattery) {
		
		return (Integer)getHibernateTemplate()
		.save(Cattery);
	}

	/**
	 * 修改指定的Cattery实例
	 * @param Cattery 需要被修改的Cattery实例
	 */
	public void update(Cattery Cattery) {
		
		getHibernateTemplate()
		.update(Cattery);
	}

	/**
	 * 删除指定的Cattery实例
	 * @param Cattery 需要被删除的Cattery实例
	 */
	public void delete(Cattery Cattery) {
		getHibernateTemplate()
		.delete(Cattery);
	}

	/**
	 * 根据标识属性删除Cattery实例
	 * @param id 需要被删除的Cattery实例的标识属性值
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
	 * return List<Cattery>
	 */
 public List<Cattery> findByPage(final Integer pageNo,final Integer pageSize, final Integer typeId,final Integer rankId,final Integer regionId,final Double priceLow,final Double priceHigh,final String queryStr)
	{
		HibernateTemplate ht=getHibernateTemplate();
		   return ht.executeFind(new HibernateCallback() {
			   
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   String rankIdStr = null;
		    	   String typeIdStr = null;
		    	   String regionIdStr = null;
		    	   if(queryStr==null){
		    	   if(rankId!=null){

		    	         rankIdStr = String.valueOf(rankId);
		    	     }
		    	     else
		    	     {

		    	    	 rankIdStr = String.valueOf("cat.rank.id");
		    	     }
		    	
		    	     if(typeId!=null){

		    	    	 typeIdStr = String.valueOf(typeId);
		    	     }
		    	     else
		    	     {

		    	    	 typeIdStr = "cat.catype.id";
		    	     }
		    	     if(regionId!=null){
		    	    	 regionIdStr = String.valueOf(regionId);

		    	     }
		    	     else{
		    	    	 regionIdStr = "cattery.region.id";
		    	     }

		    	    Query query = session.createQuery("select cattery from Cattery cattery , Cat cat where cat.cattery.id=cattery.id" +
		    	    		" and cat.price>? and cat.price<? and cat.rank.id="+rankIdStr+" and cat.catype.id="+typeIdStr+" and cattery.region.id="+regionIdStr+" group by cattery.id"); 
		    		
		    	     query.setParameter(0,priceLow);
		    	     query.setParameter(1,priceHigh);
	    		     query.setMaxResults(pageSize);
			         query.setFirstResult(pageNo);
			         return query.list();
		    	   }
		    	   else{

			    	   if(rankId!=null){

			    	         rankIdStr = String.valueOf(rankId);
			    	     }
			    	     else
			    	     {

			    	    	 rankIdStr = String.valueOf("cat.rank.id");
			    	     }
			    	
			    	     if(typeId!=null){

			    	    	 typeIdStr = String.valueOf(typeId);
			    	     }
			    	     else
			    	     {

			    	    	 typeIdStr = "cat.catype.id";
			    	     }
			    	     if(regionId!=null){
			    	    	 regionIdStr = String.valueOf(regionId);

			    	     }
			    	     else{
			    	    	 regionIdStr = "cattery.region.id";
			    	     }

			    	    Query query = session.createQuery("select cattery from Cattery cattery , Cat cat where cat.cattery=cattery.id" +
			    	    		" and cat.price>? and cat.price<? and cat.rank.id="+rankIdStr+" and cat.catype.id="+typeIdStr+" and cattery.region.id="+regionIdStr+" and cattery.name like ? group by cattery.id"); 
			    		
			    	     query.setParameter(0,priceLow);
			    	     query.setParameter(1,priceHigh);
			    	     query.setParameter(2,"%"+queryStr+"%");
		    		     query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
				         
		    	   }
		       }
		 });
    }
 
 public List<Cattery> findByQuery(final Integer pageNo,final Integer pageSize,final String catteryQuery)
 {
		HibernateTemplate ht=getHibernateTemplate();
		   return ht.executeFind(new HibernateCallback() {
			   
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   Query query = session.createQuery("from Cattery cattery where cattery.name like ?"); 
		    	   query.setParameter(0,"%"+catteryQuery+"%");
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
		       }
		 });
	 
	 
	 
 }
	

}

