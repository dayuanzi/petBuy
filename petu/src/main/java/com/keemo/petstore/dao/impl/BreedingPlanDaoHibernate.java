package com.keemo.petstore.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.*;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.*;

public class BreedingPlanDaoHibernate extends YeekuHibernateDaoSupport implements BreedingPlanDao {

	/**
	 * 根据标识属性来加载Breedingplan实例
	 * @param id 需要加载的Breedingplan实例的标识属性值
	 * @return 指定标识属性对应的Breedingplan实例
	 */
	public Breedingplan get(Integer id)
	{
		return getHibernateTemplate()
		.get(Breedingplan.class , id);
	}

	/**
	 * 持久化指定的Breedingplan实例
	 * @param Breedingplan 需要被持久化的Breedingplan实例
	 * @return Breedingplan实例被持久化后的标识属性值
	 */
	public Integer save(Breedingplan Breedingplan) {
		
		return (Integer)getHibernateTemplate()
		.save(Breedingplan);
	}

	/**
	 * 修改指定的Breedingplan实例
	 * @param Breedingplan 需要被修改的Breedingplan实例
	 */
	public void update(Breedingplan Breedingplan) {
		
		getHibernateTemplate()
		.update(Breedingplan);
	}

	/**
	 * 删除指定的Breedingplan实例
	 * @param Breedingplan 需要被删除的Breedingplan实例
	 */
	public void delete(Breedingplan Breedingplan) {
		getHibernateTemplate()
		.delete(Breedingplan);
	}

	/**
	 * 根据标识属性删除Breedingplan实例
	 * @param id 需要被删除的Breedingplan实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(this.get(id));
	}
	
	
	

	
	
	/**
	 * 根据猫舍id返回猫咪列表
	 * @param pageNo pageSize storeId
	 * @return 返回 Breedingplan List
	 */
	public List<Breedingplan> findByStoreId(final Integer pageNo,final Integer pageSize,final Integer storeId){
		
		
		HibernateTemplate ht=getHibernateTemplate();
		return ht.executeFind(new HibernateCallback() {
		   public Object doInHibernate(Session session)
	        throws HibernateException {
		    		   Query query = session.createQuery("from Breedingplan breedingplan where breedingplan.cattery.id=?"); 
		    		   query.setParameter(0, storeId);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    	   	}
			 });

	}
	
	
	/**
	 * 根据用户id返回繁育计划列表
	 * @param pageNo pageSize userId
	 * @return 返回 Breedingplan List
	 */
	public List<Breedingplan> findByUserId(final Integer pageNo,final Integer pageSize,final Integer userId){
		
		
		HibernateTemplate ht=getHibernateTemplate();
		return ht.executeFind(new HibernateCallback() {
		   public Object doInHibernate(Session session)
	        throws HibernateException {
		    		   Query query = session.createQuery("from Breedingplan breedingplan where breedingplan.admin.id=?"); 
		    		   query.setParameter(0, userId);
		    		   query.setMaxResults(pageSize);
				       query.setFirstResult(pageNo);
				       return query.list();
		    	   	}
			 });
		
		
	}
	
	
	
	
	
}
