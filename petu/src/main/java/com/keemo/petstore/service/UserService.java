package com.keemo.petstore.service;

import com.keemo.petstore.bean.Admin;

public interface UserService {
	/**
	 * 登录
	 * 
	 * @param userName
	 * @param password
	 */
	Admin login(String userName, String password);

	/**
	 * 
	* @Title: register 
	* @Description: 注册 
	* @param userName
	* @param password
	* @return
	* @throws
	 */
	void register(Admin user);

}
