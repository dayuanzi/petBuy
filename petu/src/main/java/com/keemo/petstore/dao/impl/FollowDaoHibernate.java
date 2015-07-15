package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Cattery;
import com.keemo.petstore.bean.Follow;
import com.keemo.petstore.bean.FollowId;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.FollowDao;

public class FollowDaoHibernate extends YeekuHibernateDaoSupport implements FollowDao
{

	public Follow get(FollowId id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate()
		.get(Follow.class , id);
	}

	public Integer save(Follow follow) {
		// TODO Auto-generated method stub
		return (Integer)getHibernateTemplate()
		.save(follow);
	}

	public void delete(Follow follow) {
		// TODO Auto-generated method stub
		getHibernateTemplate()
		.delete(follow);
	}

	public List<Cattery> findByUserId(final Integer pageNo,final Integer pageSize,
			final Integer userid) {
		// TODO Auto-generated method stub
		HibernateTemplate ht=getHibernateTemplate();
		  return ht.executeFind(new HibernateCallback() {
		       public Object doInHibernate(Session session)
		             throws HibernateException {
		    	   
		    	   Query query = session.createQuery("select follow.id.cattery from Follow follow where follow.id.admin.id=?");
		    	   
		    	   query.setParameter(0, userid);
	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
			       
		    	   }
		    	
		  });
	}
}

	

	


