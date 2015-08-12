package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Imagmsg;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.CatDao;
import com.keemo.petstore.dao.ImageDao;

public class ImageDaoHibernate extends YeekuHibernateDaoSupport implements ImageDao
{

	/**
	 * 根据标识属性来加载Cat实例
	 * @param id 需要加载的Cat实例的标识属性值
	 * @return 指定标识属性对应的Cat实例
	 */
	public Imagmsg get(Integer id)
	{
		return getHibernateTemplate()
		.get(Imagmsg.class , id);
		
	}

	/**
	 * 持久化指定的Cat实例
	 * @param Cat 需要被持久化的Cat实例
	 * @return Cat实例被持久化后的标识属性值
	 */
	public Integer save(Imagmsg imagmsg) {
		
		return (Integer)getHibernateTemplate()
		.save(imagmsg);
	}

	/**
	 * 修改指定的Cat实例
	 * @param Cat 需要被修改的Cat实例
	 */
	public void update(Imagmsg imagmsg) {
		
		getHibernateTemplate()
		.update(imagmsg);
	}

	/**
	 * 删除指定的Cat实例
	 * @param Cat 需要被删除的Cat实例
	 */
	public void delete(Imagmsg imagmsg) {
		getHibernateTemplate()
		.delete(imagmsg);
	}

	/**
	 * 根据标识属性删除Cat实例
	 * @param id 需要被删除的Cat实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}

	
	public Imagmsg findByImageId(final Integer catId,final Integer pid , final Integer imagetype){
		
		HibernateTemplate ht=getHibernateTemplate();
		
		return (Imagmsg)ht.find("select imagmsg from Imagmsg imagmsg where imagmsg.catid = ? and imagmsg.pid = ? and imagmsg.imagetype = ?"
				               ,catId,pid,imagetype).get(0);
		 
	   
	}
	
	
    public List<Imagmsg> findByImageList(final Integer catId,final Integer pid , final Integer imagetype){
		
		HibernateTemplate ht=getHibernateTemplate();
		
		return ht.find("select imagmsg from Imagmsg imagmsg where imagmsg.catid = ? and imagmsg.pid = ? and imagmsg.imagetype = ?",catId,pid,imagetype);
		 
	}
	
	
	
}

