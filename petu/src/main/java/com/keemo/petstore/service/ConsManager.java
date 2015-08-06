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
	
	List<Admin> getUserList(Integer pageNo,Integer pageSize);
	
	List<Admin> getAdminList(Integer pageNo,Integer pageSize);
	

}
