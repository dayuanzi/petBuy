package com.keemo.petstore.dao.impl;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.keemo.petstore.bean.Activericode;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.common.hibernate3.support.YeekuHibernateDaoSupport;
import com.keemo.petstore.dao.AdminDao;

public class AdminDaoHibernate extends YeekuHibernateDaoSupport implements AdminDao
{

	/**
	 * 根据标识属性来加载Admin实例
	 * @param id 需要加载的Admin实例的标识属性值
	 * @return 指定标识属性对应的Admin实例
	 */
	public Admin get(Integer id)
	{
		return getHibernateTemplate()
		.get(Admin.class , id);
		
	}

	/**
	 * 持久化指定的Admin实例
	 * @param Admin 需要被持久化的Admin实例
	 * @return Admin实例被持久化后的标识属性值
	 */
	public Integer save(Admin Admin) {
		
		return (Integer)getHibernateTemplate()
		.save(Admin);
	}

	/**
	 * 修改指定的Admin实例
	 * @param Admin 需要被修改的Admin实例
	 */
	public void update(Admin Admin) {
		
		getHibernateTemplate()
		.update(Admin);
	}

	/**
	 * 删除指定的Admin实例
	 * @param Admin 需要被删除的Admin实例
	 */
	public void delete(Admin Admin) {
		getHibernateTemplate()
		.delete(Admin);
	}

	/**
	 * 根据标识属性删除Admin实例
	 * @param id 需要被删除的Admin实例的标识属性值
	 */
	public void delete(Integer id) {
		getHibernateTemplate()
		.delete(get(id));
	}
	
	/**
	 * 根据用户名和密码查询用户
	 * @param  包含指定用户名、密码的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByNameAndPass(Admin admin)
	{

		return (List<Admin>)getHibernateTemplate()
			.find("from Admin admin where admin.username = ? and admin.password=?"
			, admin.getUsername() , admin.getPassword());
	}
	
	/**
	 * 根据用户名查询用户
	 * @param  包含指定用户名的用户
	 * @return 符合指定用户名和密码的用户
	 */ 
	public List<Admin> findByName(String username)
	{

		return (List<Admin>)getHibernateTemplate()
			.find("from Admin admin where admin.username = ?"
			,username);
	}
	
	


	public Admin getByEmailAndPassword(String email, String password, int active) {
		return (Admin) getHibernateTemplate().find("from Admin admin where admin.email=? and admin.password=? and admin.active=?",
				new Object[] { email, password, active });
	}
	
	
	@SuppressWarnings("unchecked")
	public Admin getByEmailAndPassword(String email, String password) {
		List<Admin> user = (List<Admin>) getHibernateTemplate().find("from Admin admin where admin.email=? and admin.password=?", email,
				password);
		if (user != null && user.size() >= 1) {
			return user.get(user.size() - 1);
		}
		return null;
	}
	

	public List<Admin> getAdminByManager(final Integer pageNo,final Integer pageSize)
	{

		HibernateTemplate ht=getHibernateTemplate();
	    return ht.executeFind(new HibernateCallback() {
	    public Object doInHibernate(Session session)
        throws HibernateException {
	    		   Query query = session.createQuery("from Admin admin where privileges = 'ROLE_USER'"); 

	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
	    	   	}
		 });
	}
	

	public List<Admin> getUserByManager(final Integer pageNo,final Integer pageSize){
		
		HibernateTemplate ht=getHibernateTemplate();
	    return ht.executeFind(new HibernateCallback() {
	    public Object doInHibernate(Session session)
        throws HibernateException {
	    		   Query query = session.createQuery("from Admin admin where privileges = 'ROLE_USER'"); 

	    		   query.setMaxResults(pageSize);
			       query.setFirstResult(pageNo);
			       return query.list();
	    	   	}
		 });
	}
	
	
	
	
	
/**********************Activericode********************************/	

	/**
	 * 根据标识属性来加载Activericode实例
	 * @param id 需要加载的Activericode实例的标识属性值
	 * @return 指定标识属性对应的Activericode实例
	 */
	public Activericode getActivericodeById(Integer id){
		return getHibernateTemplate()
		.get(Activericode.class , id);
	}

	/**
	 * 持久化指定的Activericode实例
	 * @param Activericode 需要被持久化的Activericode实例
	 * @return Activericode实例被持久化后的标识属性值
	 */
	public Integer save(Activericode Activericode){
		return (Integer) getHibernateTemplate().save(Activericode);
	}


	/**
	 * 删除指定的Activericode实例
	 * @param Activericode 需要被删除的Activericode实例
	 */
	public void delete(Activericode Activericode){
		
		 getHibernateTemplate().delete(Activericode);
		
		
	}

	/**
	 * 根据标识属性删除Activericode实例
	 * @param id 需要被删除的Activericode实例的标识属性值
	 */
	public void deleteActivericodeById(Integer id){
		 getHibernateTemplate().delete(getActivericodeById(id));
	}
	
	
	
	public List<Activericode> findActivericodeByUsernameandPass(Integer userid,String password){
		
		List<Activericode> activericode = (List<Activericode>) getHibernateTemplate().find("from Activericode activericode where activericode.userid=? and activericode.vericode=?", userid,
				password);

			return activericode;
		
	}
	
	
}

