package com.keemo.petstore.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;


import com.keemo.petstore.bean.Cat;
import com.keemo.petstore.bean.Parentcat;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.OrderDao;
import com.keemo.petstore.dao.ParentCatDao;

public class ParentCatDaoHibernate extends YeekuHibernateDaoSupport implements ParentCatDao{

	/**
	 * 根据标识属性来加载Parentcat实例
	 * @param id 需要加载的Parentcat实例的标识属性值
	 * @return 指定标识属性对应的Parentcat实例
	 */
	public Parentcat get(Integer id)
	{
		return getHibernateTemplate()
		.get(Parentcat.class , id);
	}

	/**
	 * 持久化指定的Parentcat实例
	 * @param Parentcat 需要被持久化的Parentcat实例
	 * @return Parentcat实例被持久化后的标识属性值
	 */
	public Integer save(Parentcat parentcat)
	{
		return (Integer)getHibernateTemplate()
		.save(parentcat);
		
	}

	/**
	 * 修改指定的Parentcat实例
	 * @param Parentcat 需要被修改的Parentcat实例
	 */
	public void update(Parentcat parentcat)
	{
		getHibernateTemplate()
		.update(parentcat);
	}

	/**
	 * 删除指定的Parentcat实例
	 * @param Parentcat 需要被删除的Parentcat实例
	 */
	public void delete(Parentcat parentcat)
	{
		getHibernateTemplate()
		.delete(parentcat);
	}

	/**
	 * 根据标识属性删除Parentcat实例
	 * @param id 需要被删除的Parentcat实例的标识属性值
	 */
	public void delete(Integer id)
	{
			getHibernateTemplate()
			.delete(get(id));
	}
	

	/**
	 * 根据StoreId获取list
	 * @param pageNo pageSize catteryId
	 * @return List<Parentcat>
	 */
	public List<Parentcat> findByStoreId(final Integer pageNo,final Integer pageSize,final Integer catteryId){
		
		HibernateTemplate ht=getHibernateTemplate();
		return ht.executeFind(new HibernateCallback() {
		   public Object doInHibernate(Session session)
	        throws HibernateException {
		    		   Query query = session.createQuery("from Parentcat parentcat where parentcat.cattery.id=?"); 
		    		   query.setParameter(0, catteryId);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    	   	}
			 });
	}
	
	
}
