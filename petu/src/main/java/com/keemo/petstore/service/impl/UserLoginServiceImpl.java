package com.keemo.petstore.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.authentication.RememberMeAuthenticationToken;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import com.petu.webapp.dao.BaseDAO;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.dao.AdminDao;

/*
 *  public abstract GrantedAuthority[] getAuthorities(); // 获取用户的授权信息  

 public abstract String getPassword(); // 获取用户密码(凭证)  

 public abstract String getUsername(); // 获取用户名  

 public abstract boolean isAccountNonExpired(); // 判断帐号是否已经过期  

 public abstract boolean isAccountNonLocked(); // 判断帐号是否已被锁定  

 public abstract boolean isCredentialsNonExpired(); // 判断用户凭证是否已经过期  

 public abstract boolean isEnabled(); // 判断用户帐号是否已启用 
 */

@Service
public class UserLoginServiceImpl implements UserDetailsService {

	protected static Logger logger = Logger.getLogger("service");

	@Autowired
	private AdminDao adminDao;
	//private BaseDAO<User> baseDao;
	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	private Admin user;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, DataAccessException {
		// TODO Auto-generated method stub


		List<Admin> list = adminDao.findByName(username);
		if (list != null && list.size() > 0) {
			user = list.get(0);

			org.springframework.security.core.userdetails.User myUser = new org.springframework.security.core.userdetails.User(
					user.getUsername(), user.getPassword(), true, true, true, true, getAuthorities(user.getPrivileges()));
			
		
			for (GrantedAuthority grantedAuthority : myUser.getAuthorities()) {
				System.out.println(grantedAuthority);
				
			}
			
			return myUser;

		} else {
			System.out.println("用户列表为空，不存在该用户");
			
			throw new UsernameNotFoundException("error code:1");
		
		}

	}

	/**
	 * 获得访问角色权限列表
	 * 
	 * @param access
	 * @return
	 */
	public Collection<GrantedAuthority> getAuthorities(String right) {

		// 角色字符串如：”ROLE_SUPERVISOR，ROLE_USER”。以逗号隔开
		// 分割多个角色
		String[] rights = right.split(",");
		// 设置用户的授权信息
		Set<GrantedAuthority> authorities = new HashSet<GrantedAuthority>();
		for (int i = 0; i < rights.length; i++) {
			GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(rights[i]);
			authorities.add(grantedAuthority);
		}
		return authorities;
	}



}
