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
	public String save(Cattery Cattery) {
		
		return (String)getHibernateTemplate()
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
	public List<Cattery> findByPage(final Integer pageNo,final Integer pageSize)
	{
		HibernateTemplate ht=getHibernateTemplate();
		   return ht.executeFind(new HibernateCallback() {
			   
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   Query query = session.createQuery("from Cattery cattery"); 
		    		
	    		   query.setMaxResults(pageSize);
			         query.setFirstResult(pageNo);
			         return query.list();
		       }
		    	   /*
		    	   if(typeId==null&&rankId==null){
		    		   Query query = session.createQuery("from Cattery cattery"); 
		    		
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   else if(typeId!=null&&rankId==null){
		    		   Query  query = session.createQuery("from Cattery cattery");
		    	
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   else if(typeId==null&&rankId!=null){
		    		   Query query = session.createQuery("from Cattery cattery");
		    		
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   }
		    	   Query query = session.createQuery("from Cattery cattery");
		    		
		    		   query.setMaxResults(pageSize);
				         query.setFirstResult(pageNo);
				         return query.list();
		    	   
		     }*/
		 });
    }
	

}

