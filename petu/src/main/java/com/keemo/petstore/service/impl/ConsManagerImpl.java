/**
 * 
 */
package com.keemo.petstore.service.impl;

import java.util.List;

import com.keemo.petstore.dao.AdminDao;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.service.ConsManager;


/**
 * @author 打水的
 *
 */
public class ConsManagerImpl implements ConsManager{
	private AdminDao adminDao;
	
	/**
	 * @param adminDao the adminDao to set
	 */
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	public List<Admin> getUserList(Integer pageNo,Integer pageSize){
		
		return adminDao.getUserByManager(pageNo, pageSize);
		
	}
	
	public List<Admin> getAdminList(Integer pageNo,Integer pageSize){
		
		return adminDao.getAdminByManager(pageNo, pageSize);
		
	}
	
}
