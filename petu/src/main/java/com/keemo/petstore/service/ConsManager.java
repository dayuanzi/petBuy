/**
 * 
 */
package com.keemo.petstore.service;

import java.util.List;

import com.keemo.petstore.bean.Admin;

/**
 * @author 打水的
 *
 */
public interface ConsManager {
	
	/**
	 * 2015-8-7
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 * List<Admin>
	 */
	List<Admin> getUserList(Integer pageNo,Integer pageSize) throws Exception;
	
	/**
	 * 2015-8-7
	 * 打水的
	 * @param pageNo
	 * @param pageSize
	 * @return
	 * @throws Exception
	 * List<Admin>
	 */
	List<Admin> getAdminList(Integer pageNo,Integer pageSize) throws Exception;
	
	/**
	 * 2015-8-7
	 * 打水的
	 * @param adminid
	 * @param privileges
	 * @throws Exception
	 * void
	 */
	void updatePrivileges(Integer adminid,String privileges) throws Exception;
	

}
