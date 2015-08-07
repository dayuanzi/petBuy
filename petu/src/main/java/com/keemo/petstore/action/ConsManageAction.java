/**
 * 
 */
package com.keemo.petstore.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.InterceptorRef;
import org.apache.struts2.convention.annotation.Result;

import com.keemo.petstore.action.base.ConsBaseAction;
import com.keemo.petstore.bean.Admin;
import com.keemo.petstore.service.ConsManager;

/**
 * @author 打水的
 *
 */
public class ConsManageAction extends ConsBaseAction{

	
	private final String ADM_LIST = "adminlist";
	private final String USR_LIST = "userlist";
	private final String ADM_SUC = "adminupdsuccess";
	private String pageId;
	private Integer pageNumber;
	private List<Admin> adminlist;
	private Integer adminid;
	/**
	 * @return the adminlist
	 */
	public List<Admin> getAdminlist() {
		return adminlist;
	}


	/**
	 * @return the adminid
	 */
	public Integer getAdminid() {
		return adminid;
	}


	/**
	 * @param adminid the adminid to set
	 */
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}


	/**
	 * @param adminlist the adminlist to set
	 */
	public void setAdminlist(List<Admin> adminlist) {
		this.adminlist = adminlist;
	}


	
	
	/**
	 * @return the pageId
	 */
	public String getPageId() {
		return pageId;
	}


	/**
	 * @param pageId the pageId to set
	 */
	public void setPageId(String pageId) {
		this.pageId = pageId;
	}


	/**
	 * @return the pageNumber
	 */
	public Integer getPageNumber() {
		return pageNumber;
	}


	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	@Action(value = "AdminListAction",
			results = { @Result(name = "adminlist", 
					            location = "/content/userlist.jsp")})
			

	public String excute() throws Exception{
		
		
		if(pageId.equals("1"))
		{
			Integer pageNo = (pageNumber-1) * WebConstant.userlistPageSize;
		try{
			this.adminlist = cons.getAdminList(pageNo, WebConstant.userlistPageSize);
		}
		catch (Exception e){
			throw e;
		}
			
			return ADM_LIST;
		}
		else {
			
			Integer pageNo = (pageNumber-1) * WebConstant.userlistPageSize;
			try{
			this.adminlist = cons.getUserList(pageNo, WebConstant.userlistPageSize);
			}
			catch (Exception e){
				throw e;
			}
			return USR_LIST;
			
			
		}
		
	}
	
	
	
	@Action(value = "UpdateAdminAction",
			results = { @Result(name = "adminupdsuccess", 
					            location = "/content/userlist.jsp")})
			

	public String UpdateAdminAction() throws Exception{
		
	   cons.updatePrivileges(adminid,"USER_ROLE");
	   
	   return ADM_SUC;
		
	}
	
	
	
	
}
